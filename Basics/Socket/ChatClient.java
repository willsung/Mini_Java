import java.net.*;
import java.io.*;

public class ChatClient{
	public static void main(String[] args){
		Socket s = null;
		try{
			s = new Socket("127.0.0.1", 4567);//定义Socket时需要制定IP和Port
			System.out.println("Client Start Done!");
		}catch(Exception e){
			System.out.println("Client Start ERROR!");
		}
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter output = new PrintWriter(s.getOutputStream());
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String msg = input.readLine();
			while(!msg.equals("Over")){
				output.println(msg);
				output.flush();
				System.out.println("Client: " + msg);
				System.out.println("Server: " + reader.readLine());
				msg = input.readLine();
			}
			input.close();
			output.close();
			reader.close();
			s.close();
		}catch(Exception e){
			System.out.println("Client ERROR!"+e);
		}
	}
}