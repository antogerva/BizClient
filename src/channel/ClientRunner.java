package channel;

import obs.IObserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ClientRunner implements Runnable {
    private DatagramSocket clientSocket=null;
    private InetAddress inetAddress = null;
    private String remoteIp;
    private int remotePort;
    private List<String> fifo = new ArrayList<>();
    private List<IObserver> lstObserver = new ArrayList<IObserver>();

    public ClientRunner(DatagramSocket clientSocket, String remoteIp, int remotePort) {
        this.clientSocket = clientSocket;
        this.remoteIp=remoteIp;
        this.remotePort=remotePort;
        try {
            this.inetAddress = InetAddress.getByName(this.remoteIp);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
    public void addObserver(IObserver obs){
        //super.addObserver(obs);
        lstObserver.add(obs);
    }
    public void notifyObservers(Object eventObj){
        for(IObserver obs : lstObserver) {
            obs.update(this, eventObj);
        }
    } 
    
    public void run() {
        processClient();
    }

    public void writeFifo(String msg){
        synchronized (fifo) {
            fifo.add(msg);
            if(fifo.size()>0){
                byte[] sendData = msg.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, inetAddress, remotePort);
                try {
                    clientSocket.send(sendPacket);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }       
        }     
    }

    public synchronized String receivePacket() throws IOException{
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket); 
        String newData = new String(receivePacket.getData());
        return newData;
    }

    public void processClient(){   
        try {
            String eventValue = null;
            while ((eventValue = receivePacket()) != null){
                System.out.println("receiving data");
                System.out.println("FROM SERVER: "+eventValue);
                //super.notifyObservers(eventValue);
                notifyObservers(eventValue);
            }                
        } catch (Exception e) {
            e.printStackTrace();
        }            
    }
}  