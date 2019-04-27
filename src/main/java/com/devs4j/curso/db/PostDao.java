package com.devs4j.curso.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.devs4j.curso.db.model.Post;

public class PostDao {

	private Connection connection;

	public void connect() throws ClassNotFoundException, SQLException {
		System.out.println("Conectando");
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", null);
		System.out.println("Conectado");
	}
	
	public void disconnect() throws SQLException {
		System.out.println("Desconectando");
		connection.close();
		System.out.println("Desconectado");
	}


	public List<Post> findAll() throws SQLException {
		PreparedStatement statement = connection.prepareStatement("select * from post");
		ResultSet resultSet = statement.executeQuery();
		List<Post> result = new ArrayList<>();
		while (resultSet.next()) {
			Post post = toPost(resultSet);
			result.add(post);
		}
		return result;
	}

	public int create(Post post) throws SQLException {
		PreparedStatement statement = toPreparedStatement(post);
		return statement.executeUpdate();
	}
	
	public int deleteAll() throws SQLException{
		PreparedStatement statement = connection.prepareStatement("delete from post");
		return statement.executeUpdate();
	}

	private PreparedStatement toPreparedStatement(Post post) throws SQLException {
		PreparedStatement ps = connection
				.prepareStatement("insert into post (id, name,content,author )values(?,?, ?,?)");
		ps.setInt(1, post.getId());
		ps.setString(2, post.getName());
		ps.setString(3, post.getContent());
		ps.setString(4, post.getAuthor());
		return ps;
	}
	
	

	private Post toPost(ResultSet rs) throws SQLException {
		return new Post(rs.getInt("id"), rs.getString("name"), rs.getString("content"), rs.getString("author"));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PostDao dao = new PostDao();
		dao.connect();
		
		dao.deleteAll();
		
		dao.create(new Post(2, "Java 8", "Test", "@raidentrance"));
		dao.create(new Post(3, "Java 9", "Test 9", "@raidentrance"));
		dao.create(new Post(4, "Java 10", "Test 10", "@raidentrance"));
		
		List<Post> posts = dao.findAll();
		for (Post post : posts) {
			System.out.println(post);
		}
		
		dao.disconnect();
	}
}
