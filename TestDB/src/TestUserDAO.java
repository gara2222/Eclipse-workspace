import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUserDAO {
	String name = "";
	String password = "";




public void insert(int user_id, String name, String password){
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	String sql = "insert from test_table where user_name=?";
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		int i = ps.executeUpdate();
		if (i>0){
			System.out.println(i + "削除されました");
		}
	} catch (SQLException e){
		e.printStackTrace();
	}
	try {
		con.close();
	}catch (SQLException e){
		e.printStackTrace();
	}
	}
}