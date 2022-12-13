package task01.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import task01.User;

public class UserMapper {

	public static User map(ResultSet result) throws SQLException {
		int id = result.getInt("id");
		String firstName = result.getString("first_name");
		String lastName = result.getString("last_name");
		String email = result.getString("email");
		
		return new User(id,firstName, lastName, email);
	}
	
}