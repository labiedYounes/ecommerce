package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import project.data.utilisateur;

public class utilisateurDao extends dao<utilisateur> {
	public utilisateurDao(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean create(utilisateur user) {
		boolean test = false;
		int i = 0;
		try {
			stmt = this.connect
					.prepareStatement("insert into utilisateur(login,pwd,type,email,nom,prenom,sexe,lieuNaissance,dateNaissance,adresse) values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(++i, user.getPwd());
			stmt.setString(++i, user.getType());
			stmt.setString(++i, user.getEmail());
			stmt.setString(++i, user.getNom());
			stmt.setString(++i, user.getPrenom());
			stmt.setString(++i, user.getSexe());
			stmt.setString(++i, user.getLieuNaissance());
			stmt.setString(++i, user.getDateNaissance());
			stmt.setString(++i, user.getAdresse());
			stmt.executeUpdate();
			test = stmt.executeUpdate() != 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
	}
	
	@Override
	public boolean delete(utilisateur obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean update(utilisateur obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public utilisateur find(int id) {
		utilisateur user = null;
		java.sql.Statement stmt = null;
		try {
			stmt = this.connect.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from utilisateur where id=" + id);
			while (rs.next()) {
				user = new utilisateur();
				user.setEmail(rs.getString("email"));
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setLogin(rs.getString("login"));
				user.setPwd(rs.getString("pwd"));
				user.setType(rs.getString("type"));
				user.setImg(rs.getString("img"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	public utilisateur find(String str) {
		utilisateur user = new utilisateur();
		java.sql.Statement stmt = null;
		try {
			stmt = this.connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from utilisateur where "
					+ str);
			while (rs.next()) {
				user.setEmail(rs.getString("email"));
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setLogin(rs.getString("login"));
				user.setPwd(rs.getString("pwd"));
				user.setType(rs.getString("type"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public Vector<utilisateur> getList(String str) throws SQLException {
		utilisateur user = null;
		Vector<utilisateur> userList = new Vector<utilisateur>();
		java.sql.Statement stmt = null;
		try {
			stmt = this.connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from utilisateur where "
					+ str);
			while (rs.next()) {
				user = new utilisateur();
				user.setEmail(rs.getString("email"));
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setLogin(rs.getString("login"));
				user.setPwd(rs.getString("pwd"));
				user.setType(rs.getString("type"));
				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
}
