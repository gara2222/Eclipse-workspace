//MySQLに接続するためのユーティリティクラス
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

//ドライバーの名前を指定
public class DBConnector {
	private static String driverName ="com.mysql.jdbc.Driver";
//データベース用URL、ユーザー名、パスワード
	private static String url =
		"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String password ="mysql";

//カプセル化
public Connection getConnection(){
	Connection con = null;
	try{
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);
	} catch (ClassNotFoundException e){
		e.printStackTrace();
	} catch (SQLException e){
		e.printStackTrace();
	}
return con ;
}
}
