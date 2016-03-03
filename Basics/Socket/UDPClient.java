import java.net.*;
import java.io.*;

//UDP方式，发送Long型10000到Server
public class UDPClient{
    public static void main(String[] args){
        long a = 10000L;
        try{
            //先把Long型转换成byte数组
			//Long writeLong()写入流 -> DataOutputStream -> ByteArrayOutputStream -> byte数组
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeLong(a);
            
            byte[] buf = baos.toByteArray();
            //把字符数组写入数据包(数组名，数组长度，目标IP及Port)
            DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 4567));
            //设定数据包发送端口并发送
            DatagramSocket ds = new DatagramSocket(5678);
            ds.send(dp);
            //关闭通道
            ds.close();
            dos.close();
            baos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}