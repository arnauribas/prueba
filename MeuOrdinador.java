import java.net.*;
public class MeuOrdinador {
	public static void main(String[] args) {
		try{
			InetAddress addr = InetAddress.getLocalHost();
			String ipAddr = addr.getHostAddress();
			String hostname = addr.getHostName();
			System.out.println("hostname=" + hostname);
			System.out.println("Adreça IP:" + ipAddr);
		}
		catch(
			UnknownHostException e) {
		 e.printStackTrace();
			}
	}
}
