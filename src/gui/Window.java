package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.net.DatagramPacket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.MatteBorder;

import channel.ClientRunner;
import utils.FuncListLoaderUtil;
import utils.SeqNumGeneratorUtil;

public class Window extends JFrame {
    private static final long serialVersionUID = -5879074624133753263L;

    private JPanel pnlLibrary;

    private final DefaultListModel<String> lstLibs = new DefaultListModel<String>();
    private final DefaultListModel<String> lstFuncs = new DefaultListModel<String>();
    private final DefaultListModel<String> lstLogs = new DefaultListModel<String>();
    
    private HashMap<String, List<String>> funcLibMap = new HashMap<>();
    
    private final JList<String> jLstFuncs = new JList<String>(lstFuncs);
    private final JList<String> jLstLibs = new JList<String>(lstLibs);
    private final JList<String> jLstLogs = new JList<String>(lstLogs);
    
    private final JLabel lblFuncSelectedValue = new JLabel();
    private final JFormattedTextField txtCustomField = new JFormattedTextField();
    
    private final ClientRunner clientRunner;
    private ReceivedLogBox logBox = null;
    
    public Window(final ClientRunner clientRunner) {
        this.clientRunner=clientRunner;
        bootStrapUI();
        this.clientRunner.addObserver(new ReceivedLogBox(this.lstLogs));
    }

    public void bootStrapUI(){
        initMenuBar();
        initLibsPannel();
        initFuncsPannel();
        initBoard();
        initLogBox();
        //initParamsPannel();

        this.setTitle("Remote Emu UI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(950, 510);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        this.setResizable(false);
    }

    public void initMenuBar(){
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        
        MenuItem quitItem = new MenuItem("Exit", new MenuShortcut('E'));
        quitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        fileMenu.add(quitItem);
        menuBar.add(fileMenu);
        this.setMenuBar(menuBar);        
    }

    public void initLibsPannel(){
        pnlLibrary = new JPanel();
        pnlLibrary.setBounds(10, 10, 220, 380);
        pnlLibrary.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        pnlLibrary.setLayout(new BoxLayout(pnlLibrary, BoxLayout.Y_AXIS));
        this.add(pnlLibrary);

        final JLabel label_info = new JLabel();
        label_info.setBounds(170, 5, 300, 30);
        label_info.setText("Choose a library");
        pnlLibrary.add(label_info);

        jLstLibs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jLstLibs.addListSelectionListener(new JListListener(){
            @Override
            public void doExtra(int selectedIndex) {
                String libName = lstLibs.get(selectedIndex);
                fillFuncs(libName);
            }
        });
        
        jLstLibs.setLayoutOrientation(JList.VERTICAL);
        JScrollPane scrollPanel = new JScrollPane(jLstLibs);
        scrollPanel.setPreferredSize(new Dimension(200, 200));
        pnlLibrary.add(scrollPanel);
        fillLibs();
    }

    public void initFuncsPannel(){
        final JPanel pnlFunction = new JPanel();

        pnlFunction.setBounds(250, 10, 220, 380);
        pnlFunction.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        pnlFunction.setLayout(new BoxLayout(pnlFunction, BoxLayout.Y_AXIS));
        this.add(pnlFunction);

        final JLabel lblFuncTitle = new JLabel();
        lblFuncTitle.setBounds(200, 10, 220, 180);
        lblFuncTitle.setText("Choose a function");
        pnlFunction.add(lblFuncTitle);

        jLstFuncs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jLstFuncs.addListSelectionListener(new JListListener(){
            @Override
            public void doExtra(int selectedIndex) {
                String funcName = "";
                if(selectedIndex!=-1 && selectedIndex<=lstFuncs.getSize()){
                    String libName = jLstLibs.getSelectedValue();
                    funcName=libName+"."+lstFuncs.get(selectedIndex);
                }
                lblFuncSelectedValue.setText(funcName);
            }
        });

        jLstFuncs.setLayoutOrientation(JList.VERTICAL);
        JScrollPane scrollPanel = new JScrollPane(jLstFuncs);
        scrollPanel.setPreferredSize(new Dimension(200, 200));
        pnlFunction.add(scrollPanel);
    }
        
    public void initBoard(){
        final JPanel pnlBoard = new JPanel();
        pnlBoard.setBounds(490, 10, 440, 180);
        pnlBoard.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        pnlBoard.setLayout(null);
        this.add(pnlBoard);
        
        JLabel lblDashBoard = new JLabel();
        lblDashBoard.setBounds(10, 2, 140, 15);
        lblDashBoard.setText("DashBoard:");
        Map<TextAttribute, Integer> fontAttDashBoard = (Map<TextAttribute, Integer>) lblDashBoard.getFont().getAttributes();
        fontAttDashBoard.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblDashBoard.setFont(new Font(fontAttDashBoard));
        pnlBoard.add(lblDashBoard);
        
        JLabel lblPingEmu = new JLabel();
        lblPingEmu.setBounds(10, 30, 140, 15);
        lblPingEmu.setText("Ping emu:");
        pnlBoard.add(lblPingEmu);
        final JButton btnPingEmu = new JButton("Ping emu");
        btnPingEmu.setBounds(80, 25, 150, 30);
        btnPingEmu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("sending ping");
                clientRunner.writeFifo("ping");
                clientRunner.writeFifo("send");
                System.out.println("sended ping");
            }
        });
        pnlBoard.add(btnPingEmu);

        JLabel lblFuncSelected = new JLabel();
        lblFuncSelected.setBounds(10, 60, 140, 15);
        lblFuncSelected.setText("Function selected:");
        pnlBoard.add(lblFuncSelected);
        
        lblFuncSelectedValue.setBounds(120, 60, 250, 15);
        lblFuncSelectedValue.setText("");
        pnlBoard.add(lblFuncSelectedValue);
        
        final JButton btnSendFunc = new JButton("Send function");
        btnSendFunc.setBounds(10, 80, 150, 30);
        btnSendFunc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String params = txtCustomField.getText().trim();
                String libName = jLstLibs.getSelectedValue();
                String funcName = jLstFuncs.getSelectedValue();
                //TODO: Add params
                String stringToSend = Window.parseParams(new String[]{SeqNumGeneratorUtil.getNumber()+"",libName, funcName});
                System.out.println("sending "+stringToSend);
                clientRunner.writeFifo(stringToSend);
                clientRunner.writeFifo("send");
                System.out.println("sended "+stringToSend);
                
            }
        });
        pnlBoard.add(btnSendFunc);

        JLabel lblCustomParam = new JLabel();
        lblCustomParam.setBounds(10, 120, 140, 15);
        lblCustomParam.setText("Custom params:");
        pnlBoard.add(lblCustomParam);
        
        txtCustomField.setBounds(120, 120, 280, 30);
        txtCustomField.setText("");
        pnlBoard.add(txtCustomField);
    }

    public void initLogBox(){
        final JPanel pnlLogBox = new JPanel();
        pnlLogBox.setBounds(490, 210, 440, 180);

        pnlLogBox.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        pnlLogBox.setLayout(new BoxLayout(pnlLogBox, BoxLayout.Y_AXIS));

        final JLabel lblLogBoxTitle = new JLabel();
        lblLogBoxTitle.setBounds(200, 10, 220, 180);
        lblLogBoxTitle.setText("Logs");
        pnlLogBox.add(lblLogBoxTitle);

        jLstLogs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jLstLogs.setLayoutOrientation(JList.VERTICAL);
        JScrollPane scrollPanel = new JScrollPane(jLstLogs);
        scrollPanel.setPreferredSize(new Dimension(200, 200));
        pnlLogBox.add(scrollPanel);

        this.add(pnlLogBox);
    }

    public void fillLibs(){
        lstLibs.clear();
        lstLibs.ensureCapacity(30);
        funcLibMap = FuncListLoaderUtil.fill();
        for (String libName : funcLibMap.keySet()) {
            lstLibs.addElement(libName);
        }
    }
    
    public void fillFuncs(String libName){
        lstFuncs.clear();
        lstFuncs.ensureCapacity(50);
        for (String funcName : funcLibMap.get(libName)) {
            lstFuncs.addElement(funcName);
        }        
    }
        
    public static String parseParams(String... params){
        String dataToSend="";
        for (String s: params) {
            if(!"".equals(dataToSend)){
                dataToSend+=";;";
            }
            dataToSend+="\""+s+"\"";
        }
        return dataToSend;
    }
}
