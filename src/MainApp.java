import channel.Client;
import gui.Window;


public class MainApp {

    public static void main(final String... args) {
        String remoteIp = "localhost";
        int remotePort = 51424;
        int localPort = 51425;
        Client c = new Client(remoteIp, remotePort, localPort);
        Window window = new Window(c.getClientRunner());
        window.setVisible(true);
    }
    
}
