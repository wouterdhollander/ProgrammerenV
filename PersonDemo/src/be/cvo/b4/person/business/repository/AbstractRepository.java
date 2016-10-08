package be.cvo.b4.person.business.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public abstract class AbstractRepository {
	
	private static final int POOLSIZE = 5;
	private static final String MYSQL_URL = "jdbc:mysql://localhost/PersonDemo";
	private static final String USER = "root";
	private static final String PASS = "root";

	static{
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private HashMap<Connection, Boolean> connectionMap;
	
	public AbstractRepository() {
		initConnections();
	}

	private void initConnections() {
		connectionMap = new HashMap<Connection, Boolean>();
		for(int i=0; i<POOLSIZE; i++){
			Connection c;
			try {
				c = DriverManager.getConnection(MYSQL_URL, USER, PASS);
				connectionMap.put(c, new Boolean(true));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected Connection getConnection(){
		for(Connection c : connectionMap.keySet()){
			if(connectionMap.get(c)){
				connectionMap.put(c, false);
				return c;
			}
		}
		return null;
	}
	
	protected void releaseConnection(Connection c){
		connectionMap.put(c, true);
	}

}
