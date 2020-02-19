package Main;
import java.net.*;
import java.io.*;

public class server {
  public server () {
    InetAddress localHost = InetAddress.getLocalHost();
    String ip = localHost.getHostAddress();
    ServerSocketChannel ss = ServerSocketChannel.open();
    ss.bind(new InetSocketAddress(ip, 9999));
    try (SocketChannel sc = ss.accept();
            FileChannel fc = new FileOutputStream("test").getChannel()) {
        fc.transferFrom(sc, 0, Long.MAX_VALUE);
    }
}
