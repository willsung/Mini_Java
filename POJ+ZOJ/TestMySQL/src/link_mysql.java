import java.sql.*;   
import java.text.SimpleDateFormat;   
import java.util.Date;   
   
public class link_mysql {   
   
  public static void main(String[] args) {   
   
      link_mysql  lm = new link_mysql();   
      String t= lm.getStringDate();   
         try {   
              System.out.println("["+t+"]"+"加载MYSQL JDBC驱动程序......");   
              Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
              System.out.println("["+t+"]"+"Success loading Mysql Driver!");   
            }   
        catch (Exception e) {   
              System.out.print("["+t+"]"+"Error loading Mysql Driver!");   
              e.printStackTrace();   
            }   
        try {   
              System.out.println("["+t+"]"+"连接MySQL:jdbc:mysql//服务器地址:端口/数据库名  ，登陆用户名,密码  ......");   
              Connection connect = DriverManager.getConnection(   
        "jdbc:mysql://localhost:3306/BOOK_SYSTEM","root","nothing");   
        //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码   
              System.out.println("["+t+"]"+"Success connect Mysql server!");   
              Statement stmt = connect.createStatement();   
              ResultSet rs = stmt.executeQuery("select * from t_user");
        //user 为你表的名称   
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