import java.net.*;
import java.io.*;

public class TCPClient{
	public static void main(String[] args) throws Exception{
		try{
			Socket s = new Socket("127.0.0.1",6666);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("C2S");
			dos.flush();
			//dos.close();	//dos关闭会同时关闭Socket从而报错Socket is closed
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
		}catch(ConnectException e){
			e.printStackTrace();
			System.err.println("Server Connect Error!");
		}catch(IOException e){
			e.printStackTrace();
			System.err.println("IO Error!");
		}
	}
}