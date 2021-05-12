import java.net.*;
public class MeuOrdinador {
	public static void main(String[] args) {
		try{
			System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
			System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
			InetAddress addr = InetAddress.getLocalHost();
			String ipAddr = addr.getHostAddress();
			String hostname = addr.getHostName();
			System.out.println("hostname=" + hostname);
			System.out.println("Adreça IP:" + ipAddr);
			System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
			System.out.println("Versió OS: " + System.getProperty("os.version"));
		}
		catch(
			UnknownHostException e) {
		 e.printStackTrace();
			}
	}
}
