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
        String dataToSend = "ok";
        sendData = dataToSend.getBytes();
        
        boolean isDone = false;
        
        while(!isDone){
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, portSender);
            System.out.println("sending ok");
            clientSocket.send(sendPacket);
            System.out.println("sended ok");
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            System.out.println("receiving data");
            clientSocket.receive(receivePacket);
            String newData = new String(receivePacket.getData());
            System.out.println("FROM SERVER: " + newData);            
        }
        System.out.println("Closing connection.");
        clientSocket.close();
    }
}


