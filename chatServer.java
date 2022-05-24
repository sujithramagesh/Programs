package Programs;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public ChatServer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(6666);  
		System.out.println("Server listening on port");
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equalsIgnoreCase("STOP"))
		{
			str1=din.readUTF();
			System.out.println("Client says"+str1);
			
			if(str1.equalsIgnoreCase("STOP"))
			{
				str2="STOP Accepted";
			}
			else
			{
				str2=br.readLine();
			}
			dout.writeUTF(str2);
			dout.flush();
		}
		dout.close();
		din.close();
		s.close();
		ss.close();
	}
}
