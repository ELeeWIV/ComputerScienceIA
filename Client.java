package Main;
import java.net.*;
import java.io.*;
import GUI;

public class Client {
  public server () {}
    public void transfer () {
      GUI gui = new GUI;
      String file = gui.getDate + gui.getRoom + gui.getTeacher + ".txt";
      InetAddress localHost = InetAddress.getLocalHost();
      String ip = localHost.getHostAddress();
      try (SocketChannel sc = SocketChannel.open(new InetSocketAddress(ip, 9999));
      FileChannel fc = new FileInputStream(file).getChannel()) {fc.transferTo(0, fc.size(), sc);}
    }
}
