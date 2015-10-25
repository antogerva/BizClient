package channel;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client{
    private ClientRunner clientRunner=null;
    
    public Client(String remoteIp, int remotePort, int localPort) {
        DatagramSocket clientSocket = createClientSocket(remoteIp, localPort);
        this.clientRunner = new ClientRunner(clientSocket, remoteIp, remotePort);
        Thread t = new Thread(clientRunner);
        t.start();
    }
    
    public DatagramSocket createClientSocket(String ip, int port){
        DatagramSocket clientSocket=null;
        try {
            InetAddress inetAddress = InetAddress.getByName(ip);
            clientSocket = new DatagramSocket(port, inetAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return clientSocket;            
    }
    public ClientRunner getClientRunner() {
        return clientRunner;
    }
}
