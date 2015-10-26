import java.io.*;
import java.net.*;
import java.util.Observable;

import utils.SeqNumGeneratorUtil;

public class ClientUDP extends Observable{
    public static void main(String[] args) throws IOException {
        int portSender=51424;
        int portReceiver=51425;

        DatagramSocket clientSocket = new DatagramSocket(portReceiver);
        InetAddress ipAddress = InetAddress.getByName("localhost");

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];
        String dataToSend = "";
        
        int count=0;
        int totalCount=0;
        //TODO: use an interface to convert what is sended.
        
        boolean isDone = false;
        int maxMod = 2;

        while(!isDone){            
            if(count%maxMod==0){
                //dataToSend=parseParams(new String[]{"client", "unpause"});
                //dataToSend=parseParams(new String[]{"client", "pause"});
                //dataToSend=parseParams(new String[]{"client", "speedmode", "int", "100"});
                dataToSend=parseParams(new String[]{SeqNumGeneratorUtil.getNumber()+"","emu", "frameadvance"});
                count++;
            } else if(count%maxMod==1) {
                dataToSend=parseParams(new String[]{SeqNumGeneratorUtil.getNumber()+"","emu", "frameadvance"});
                //dataToSend=parseParams(new String[]{SeqNumGeneratorUtil.getNumber()+"", "gui", "drawText", "luaarray", "{10,10,'TotalCount: "+totalCount+"'}"});
                count++;
            }
            if(count==(maxMod*1)+1) {
                dataToSend="send";
                totalCount+=count;
                count=0;
            }            
            sendData = dataToSend.getBytes();
            
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, portSender);
            System.out.println("sending "+dataToSend);
            clientSocket.send(sendPacket);
            System.out.println("sended "+dataToSend);

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            System.out.println("receiving data");
            clientSocket.receive(receivePacket);
            String newData = new String(receivePacket.getData());
            System.out.println("FROM SERVER: " + newData);           
        }
        System.out.println("Closing connection.");
        System.out.println("TotalCount: "+totalCount);
        clientSocket.close();
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


