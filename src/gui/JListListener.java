package gui;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListListener implements ListSelectionListener {
    
    public JListListener() {
    }
    public synchronized void valueChanged(ListSelectionEvent e) {
        JList jLst = (JList)e.getSource();
        int index = jLst.getSelectedIndex();
        doExtra(index);
    }
    public void doExtra(int selectedIndex){            
    }
}
