import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Core {

	static Socket s;
	static Scanner tIn = new Scanner(System.in);
	private static OutputStream out;
	private static InputStream in;
	private static BufferedReader br;
	static String text = "";

	public void connectToServer(String host, int port) throws ConnectionFailureException {
		try {
			System.out.println("Connecting...");
			// connect papq computer
			// s = new Socket("127.0.0.1", 4444);
			s = new Socket(host, port);
			System.out.println("Connected");
			in = s.getInputStream();
			out = s.getOutputStream();
			InputStreamReader isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			PrintWriter pw = new PrintWriter(out);
		} catch (UnknownHostException e) {
			System.out.println("Unknown Host");
			throw new ConnectionFailureException();
		} catch (IOException e) {
			System.out.println("IO Connection failure");
			throw new ConnectionFailureException();
		}

//		try {
//			text = br.readLine();
//			System.out.println(text);
//		} catch (IOException e) {
//			System.out.println("Connection failure");
//		throw new ConnectionFailureException();
//		} catch (NullPointerException e) {
//			System.out.println("Null Pointer failure");
//		throw new ConnectionFailureException();
//		}
	}

}
