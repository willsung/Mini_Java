import java.net.*;
import java.io.*;

public class TCPServer{
	public static void main(String[] args) throws Exception{
		int i = 0;
		try{
			ServerSocket ss = new ServerSocket(6666);
			while(true){
				Socket s = ss.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				System.out.println(dis.readUTF() + " " + (++i));
				//dis.close();	//dis�رջ�ͬʱ�ر�Socket�Ӷ�����Socket is closed
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				dos.writeUTF("S2C" + " " +s.getInetAddress() + " " +s.getPort());
				//s.getInetAddress()��ȡ�ͻ���IP
				//s.getPort()��ȡ�ͻ��˶˿�
				dos.flush();
				dos.close();
				s.close();
			}
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("Error Occured!");
		}
	}
}