import java.io.*;
import java.net.*;

public class ClientUDP {
    public static void main(String[] args) throws IOException {
        int portSender=51424;
        int portReceiver=51425;

        DatagramSocket clientSocket = new DatagramSocket(portReceiver);
        InetAddress IPAddress = InetAddress.getByName("localhost");

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];
        String dataToSend = "";
        
        int count=0;
        int totalCount=0;
        //TODO: use an interface to convert what is sended.
        
        boolean isDone = false;
        int maxMod = 5;

        while(!isDone){            
            if(count%maxMod==0){
                dataToSend=parseParams(new String[]{"client", "unpause"});
                count++;
            } else if(count%maxMod==1) {
                dataToSend=parseParams(new String[]{"emu", "frameadvance"});
                count++;
            } else if(count%maxMod==2) {
                dataToSend=parseParams(new String[]{"client", "speedmode", "int", "100"});
                count++;
            } else if(count%maxMod==3) {
                dataToSend=parseParams(new String[]{"client", "pause"});
                count++;
            } else if(count%maxMod==4) {
                dataToSend=parseParams(new String[]{"gui", "drawText", "luaarray", "{10,10,'TotalCount: "+totalCount+"'}"});
                count++;
            }
            if(count==(maxMod*1)+1) {
                dataToSend="send";
                totalCount+=count;
                count=0;
            }
            
            sendData = dataToSend.getBytes();
            
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, portSender);
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


