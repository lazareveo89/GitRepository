package test.se.sql;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class TestSQL {

	public static void main(String[] args) {
		ConnectToSQL c = new ConnectToSQL();
		Map <Integer,String> m = new HashMap<Integer,String>();		
		try {
			m=c.getContentTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m.get(2));
	}

}
