import java.sql.*;   
import java.text.SimpleDateFormat;   
import java.util.Date;   
   
public class link_mysql {   
   
  public static void main(String[] args) {   
   
      link_mysql  lm = new link_mysql();   
      String t= lm.getStringDate();   
         try {   
              System.out.println("["+t+"]"+"����MYSQL JDBC��������......");   
              Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
              System.out.println("["+t+"]"+"Success loading Mysql Driver!");   
            }   
        catch (Exception e) {   
              System.out.print("["+t+"]"+"Error loading Mysql Driver!");   
              e.printStackTrace();   
            }   
        try {   
              System.out.println("["+t+"]"+"����MySQL:jdbc:mysql//��������ַ:�˿�/���ݿ���  ����½�û���,����  ......");   
              Connection connect = DriverManager.getConnection(   
        "jdbc:mysql://localhost:3306/BOOK_SYSTEM","root","nothing");   
        //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������   
              System.out.println("["+t+"]"+"Success connect Mysql server!");   
              Statement stmt = connect.createStatement();   
              ResultSet rs = stmt.executeQuery("select * from t_user");
        //user Ϊ���������   
        System.out.println("["+t+"]"+" Get MySQL data.....");   

        while (rs.next()) {   
        	System.out.println(rs.getString("ID")+". "+rs.getString("USER_NAME")+"  "+rs.getString("USER_PASSWORD")); 
        }   
        System.out.println("["+t+"]"+"Get MySQL data successfully! ");   
            }   
        catch (Exception e) {   
              System.out.print("["+t+"]"+"Get MySQL data error!");   
              e.printStackTrace();   
            }   
          }   

    public String getStringDate() {   
           Date currentTime = new Date();   
           SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
           String dateString = formatter.format(currentTime);   
           return dateString;   
    }   
} 