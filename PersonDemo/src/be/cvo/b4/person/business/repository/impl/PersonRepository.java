package be.cvo.b4.person.business.repository.impl;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import be.cvo.b4.person.business.Person;
import be.cvo.b4.person.business.repository.AbstractRepository;

public class PersonRepository extends AbstractRepository {

	public void save(Person p) {
		Connection c = getConnection();
		try {
			Statement stmt = c.createStatement();
			stmt.execute("insert into Persons(name) VALUES ('" + p.getName()+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			releaseConnection(c);
		}
		
	}

}
