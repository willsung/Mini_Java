import java.net.*;
import java.io.*;

public class ChatServer{
	public static void main(String[] args){
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(4567);
			System.out.println("Server Start Done!");
		}catch(Exception e){
			System.out.println("Server Start ERROR!");
			System.exit(0);
		}
		Socket s = null;
		try{
			s = ss.accept();
			System.out.println("Connected!");
		}catch(Exception e){
			System.out.println("Server ERROR while connecting!");
		}
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter output = new PrintWriter(s.getOutputStream());
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String omsg = reader.readLine();
			System.out.println("Client: " + omsg);
			String imsg = input.readLine();
			int count = 0;
			while(!imsg.equals("Over")){
				output.println(imsg);
				output.flush();
				System.out.println("Server: " + imsg);
				System.out.println("Client: " + omsg);
				imsg = input.readLine();
				omsg = reader.readLine();
			}
			input.close();
			output.close();
			reader.close();
			s.close();
		}catch(Exception e){
			System.out.println("Server ERROR!"+e);
		}
	}
}