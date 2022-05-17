package Programs;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientChat {

	public clientChat() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",6666);  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream din=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str1="",str2="";
		while(!str1.equalsIgnoreCase("STOP"))
		{
			str1= br.readLine();
			dout.writeUTF(str1);
			str2=din.readUTF();
			System.out.println("Server says: "+str2);
			dout.flush();
		}
		dout.close();
		din.close();
		s.close();
	}
}
