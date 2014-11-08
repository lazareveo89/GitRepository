package test.se.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ConnectToSQL {
	//������������� ����������
		//�������� url ���������� �� ��
		private static final String urlSQL = "jdbc:sybase:Tds:noutepc:5000/diplom";
		private static final String userSQL="sa";
		private static final String passUserSQL="";
		private static Connection conn;
		//������������ ����� ��������
		static {
			try{
			Class.forName("com.sybase.jdbc4.jdbc.SybDataSource");
			}catch(ClassNotFoundException e){
				System.out.println("Class sybase not load");
			}
		}
		//�������� ������ Connection ��� ����������� ���������� �������� �� ������ ��
		private static Connection getConnectionSybase() throws SQLException{
			try{
			conn = DriverManager.getConnection(urlSQL,userSQL,passUserSQL);}
			catch(SQLException e){
				e.printStackTrace();
				/*throw new SQLException();*/
			}
			return conn;
		}
		public Map getContentTable() throws SQLException {
			Map <Integer,String> map = new HashMap<Integer, String>();
			Statement stat;
			ResultSet rs;
			//Statement - ��� ���������� ��������
			stat = getConnectionSybase().createStatement();
			rs = stat.executeQuery("SELECT * FROM Contacts");
			while(rs.next()){
			map.put(rs.getInt("ID_contact"), rs.getString("Type_contact"));				
		}		
			return map;
			}
}
