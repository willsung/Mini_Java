import java.net.*;
import java.io.*;

//UDP��ʽ������Long��10000��Server
public class UDPClient{
    public static void main(String[] args){
        long a = 10000L;
        try{
            //�Ȱ�Long��ת����byte����
			//Long writeLong()д���� -> DataOutputStream -> ByteArrayOutputStream -> byte����
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeLong(a);
            
            byte[] buf = baos.toByteArray();
            //���ַ�����д�����ݰ�(�����������鳤�ȣ�Ŀ��IP��Port)
            DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 4567));
            //�趨���ݰ����Ͷ˿ڲ�����
            DatagramSocket ds = new DatagramSocket(5678);
            ds.send(dp);
            //�ر�ͨ��
            ds.close();
            dos.close();
            baos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}