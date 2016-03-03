import java.net.*;
import java.io.*;

//�п��ܳ����쳣�ĵط�һ��Ҫ�׳��쳣���������try...catch��������throws
public class ChatServer{
	public static void main(String[] args){
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(4567);//����ServerSocketʱ����ָ���˿ں�
			System.out.println("Server Start Done!");
		}catch(Exception e){
			System.out.println("Server Start ERROR!");
			System.exit(0);
		}
		Socket s = null;
		try{
			s = ss.accept();//����������Server��Ҳ���и�Socketʵ�֣�������Client�˶�Ӧ�Ӷ���������
			System.out.println("Connected!");
		}catch(Exception e){
			System.out.println("Server ERROR while connecting!");
		}
		try{
			//��Client�˻�ȡ���ݣ�BufferedReader����InputStreamReader������
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//��Client�˷�������
			PrintWriter output = new PrintWriter(s.getOutputStream());
			//�Ӽ��̻�ȡ���룬System.in��InputStream����
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client: " + reader.readLine());
			String imsg = input.readLine();
			while(!imsg.equals("Over")){
				output.println(imsg);//println()�������ַ�����ӡ��PrintWriter������Client
				output.flush();//�������
				System.out.println("Server: " + imsg);
				System.out.println("Client: " + reader.readLine());
				imsg = input.readLine();
			}
			//���ݴ��������һ��Ҫ�رո������ӣ��������ιر�
			input.close();
			output.close();
			reader.close();
			s.close();
		}catch(Exception e){
			System.out.println("Server ERROR!"+e);
		}
	}
}