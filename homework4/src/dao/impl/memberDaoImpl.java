package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.memberDao;
import model.member;

public class memberDaoImpl implements memberDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*測試註冊人員add到資料庫上  member m = new member("teacher", "teacher", "1234", "台北", "09222", "abc@abc.com");
		member m1 = new member("test", "test", "1234", "台北", "022802", "def@abc.com");
		new memberDaoImpl().add(m);
		new memberDaoImpl().add(m1);*/
		//查詢
		System.out.println(new memberDaoImpl().queyMember("nini", "lovenini").getName());
		System.out.println(new memberDaoImpl().queyMember("nini", "lovenini").getName());


	}

	@Override
	public void add(member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into member(name, username,password, address,mobile, email)" + "values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
		
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getMobile());
			ps.setString(5, m.getEmail());
			ps.setString(6, m.getMobile());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

		
	

	@Override
	public member queyMember(String username, String password) {
		/*
		 * 1.連線
		 * 2.SQL
		 * 3.PreparedStatement
		 * 4.ResultSet--->new member 
		 */
		Connection conn=DbConnection.getDb();
		String SQL="select * from member where username=? and password=?";//SQL語法
		member m=null;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();//ResultSet才是java
			/*
			 * ps: 这是你之前创建的 PreparedStatement 对象，它包含了预编译的 SQL 查询语句以及可能设置的参数值。
			 * executeQuery(): 这是 PreparedStatement 接口定义的方法，用于执行查询语句。当你调用这个方法时，
			 * 它会执行之前准备好的 SQL 查询，并返回一个 ResultSet 对象，其中包含了查询结果的数据集。
               ResultSet rs: 这是用于存储查询结果的对象。
               ResultSet 是一个 Java 接口，提供了访问数据库查询结果的方法。
               通过这个对象，你可以逐行检索查询结果，获取每一行的数据。
               所以，整体而言，这一行代码的作用是执行之前准备好的 SQL 查询，
               然后将查询结果保存在 ResultSet 对象 rs 中，以便进一步处理和检索数据库返回的数据。**/
			
			if(rs.next())
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public boolean queryUsername(String username) {
		/**
		 * 1.連線 2.SQL 3.preparedStatement 4.ResultSet ---> boolean
		 */
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where username=?";
		boolean x = false;

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				x = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return x;
	}
	

	@Override
	public List<member> queryAll() {
		// TODO Auto-generated method stub
				Connection conn = DbConnection.getDb();
				String SQL = "select * from member";
				List<member> l = new ArrayList();
				/**
				 * 這個方法應該從資料庫中查詢所有會員的資料。具體的實現細節尚未提供， 
				 * 
				 * 但你可以預期它會使用 JDBC（Java Database
				 * Connectivity）來執行 SQL 查詢， 
				 * 並將結果封裝為 List<member> 返回。在方法內部，
				 * 還有一個 Connection 對象，它使用 DbConnection.getDb() 方法取得與資料庫的連線。 
				 * 需要注意的是，這段程式碼中的 <member> 假定存在一個 member
				 * 類型， 它可能是定義在你的程式碼中的一個類別。
				 */

				try {
					PreparedStatement ps = conn.prepareStatement(SQL);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						member m = new member();
						m.setId(rs.getInt("id"));
						m.setName(rs.getNString("name"));
						m.setUsername(rs.getNString("username"));
						m.setPassword(rs.getString("password"));
						m.setAddress(rs.getString("address"));
						m.setMobile(rs.getString("mobile"));
						m.setEmail(rs.getString("email"));
						l.add(m);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

				return l;
			}
	
	@Override
	public member queryUser(String username) {
		// TODO Auto-generated method stub
		/**
		 * 1.連線 2.SQL 3.preparedStatement 4.ResultSet ---> boolean
		 */

		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where username=?";
		member m = null;

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
		
			if (rs.next()) {
				m = new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return m;

	}
			

	@Override
	public List<member> queryID(int startId, int endId) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where id>=? and id<=?";
		List<member> l = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, startId);// ps是因為從資料庫查詢
			ps.setInt(2, endId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				member m = new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
				l.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public List<member> queryAddress(String address) {
			Connection conn = DbConnection.getDb();
			String SQL = "select * from member where address=?";
			List<member> l = new ArrayList();
			try {
				PreparedStatement ps = conn.prepareStatement(SQL);
				ps.setString(1, address);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					member m = new member();
					m.setId(rs.getInt("id"));
					m.setName(rs.getString("name"));
					m.setUsername(rs.getString("username"));
					m.setPassword(rs.getString("password"));
					m.setAddress(rs.getString("address"));
					m.setMobile(rs.getString("mobile"));
					m.setEmail(rs.getString("email"));
					l.add(m);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return l;
		
	}


	@Override
	public void update(member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "update member set address=?,mobile=? where username=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getAddress());
			ps.setString(2, m.getMobile());
			ps.setString(3, m.getUsername());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	@Override
	public void delete(int id) {
		Connection conn = DbConnection.getDb();
		String SQL = "delete from member where id=?";

		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
