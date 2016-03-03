import java.net.*;
import java.io.*;

//����Client������Long�����ݣ����������Ȼ����ȷ��ʾ����
public class UDPServer{
    public static void main(String[] args){
        try{
            //���峤��1024�ַ����飬�洢���ܵ�������
            byte[] buf = new byte[1024];
			long a;
            //����������ݰ�����
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            //�������ڽ������ݰ���Socket
            DatagramSocket ds = new DatagramSocket(4567);
			//�����յ���byte���鷴תΪLong
			//byte���� -> ByteArrayInputStream -> DataInputStream -> readLong()�������õ�Long
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bais);
            //ѭ���������ݰ�
            while(true){
                ds.receive(dp);
				a = dis.readLong();
				System.out.println(dp.getAddress() + ":" + dp.getPort());
				System.out.println("���յ�������: " + a);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}