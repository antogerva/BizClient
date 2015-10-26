package gui;

import javax.swing.DefaultListModel;

import obs.*;

public class ReceivedLogBox implements IObserver  {
    
    private DefaultListModel<String> lstLogs;

    public ReceivedLogBox(DefaultListModel<String> lstLogs) {
        this.lstLogs = lstLogs;
    }

    public void update(Object observable, Object arg) {
        lstLogs.addElement(arg.toString());
    }

}
