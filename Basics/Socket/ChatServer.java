import java.net.*;
import java.io.*;

//有可能出现异常的地方一定要抛出异常，并最好用try...catch，不宜用throws
public class ChatServer{
	public static void main(String[] args){
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(4567);//定义ServerSocket时必须指定端口号
			System.out.println("Server Start Done!");
		}catch(Exception e){
			System.out.println("Server Start ERROR!");
			System.exit(0);
		}
		Socket s = null;
		try{
			s = ss.accept();//建立连接是Server端也会有个Socket实现，用来和Client端对应从而进行连接
			System.out.println("Connected!");
		}catch(Exception e){
			System.out.println("Server ERROR while connecting!");
		}
		try{
			//从Client端获取数据，BufferedReader接受InputStreamReader型数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//向Client端发送数据
			PrintWriter output = new PrintWriter(s.getOutputStream());
			//从键盘获取输入，System.in是InputStream类型
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client: " + reader.readLine());
			String imsg = input.readLine();
			while(!imsg.equals("Over")){
				output.println(imsg);//println()方法把字符串打印到PrintWriter，传给Client
				output.flush();//数据清空
				System.out.println("Server: " + imsg);
				System.out.println("Client: " + reader.readLine());
				imsg = input.readLine();
			}
			//数据传输结束后一定要关闭各种连接，逆序依次关闭
			input.close();
			output.close();
			reader.close();
			s.close();
		}catch(Exception e){
			System.out.println("Server ERROR!"+e);
		}
	}
}