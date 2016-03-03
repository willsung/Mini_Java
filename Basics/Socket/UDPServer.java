import java.net.*;
import java.io.*;

//接受Client发来的Long型数据，并解包处理，然后正确显示出来
public class UDPServer{
    public static void main(String[] args){
        try{
            //定义长度1024字符数组，存储接受到的数据
            byte[] buf = new byte[1024];
			long a;
            //定义接收数据包对象
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            //定义用于接受数据包的Socket
            DatagramSocket ds = new DatagramSocket(4567);
			//将接收到的byte数组反转为Long
			//byte数组 -> ByteArrayInputStream -> DataInputStream -> readLong()读出流得到Long
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bais);
            //循环接受数据包
            while(true){
                ds.receive(dp);
				a = dis.readLong();
				System.out.println(dp.getAddress() + ":" + dp.getPort());
				System.out.println("接收到的数据: " + a);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}