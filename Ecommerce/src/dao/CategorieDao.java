package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import project.data.Categorie;
import project.data.utilisateur;

public class CategorieDao extends dao<Categorie> {
	private java.sql.Statement stmt=null;
	Categorie cat=null;
	public CategorieDao(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Categorie cat) {
		boolean test=false;
		try {
			 stmt=this.connect.createStatement();
		     stmt.executeUpdate("insert into categorie(nom,discription) values('"+cat.getNom()+"','"+cat.getDiscription()+"')");
			test=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public boolean delete(Categorie obj) {
		boolean test=false;
		try {
			 stmt=this.connect.createStatement();
		     stmt.executeUpdate("delete from categorie where id="+obj.getId());
			test=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public boolean update(Categorie obj) {
		boolean test=false;
		try {
			 stmt=this.connect.createStatement();
		     stmt.executeUpdate("update categorie set nom='"+obj.getNom()+"',discription='"+obj.getDiscription()+"' where id="+obj.getId());
			test=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public Categorie find(int id) {
		try {
			 stmt=this.connect.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from categorie where id ="+id);
			 while(rs.next()){
				 cat=new Categorie();
				
				 cat.setId(Integer.parseInt(rs.getString("id")));
				 cat.setNom(rs.getString("nom"));
				 cat.setDiscription(rs.getString("discription"));
				 
				
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cat;
	}

	@Override
	public Categorie find(String str)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Categorie> getList(String str) {
		
		Vector<Categorie> catList=new Vector<Categorie>();
		
		try {
			 stmt=this.connect.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from categorie where "+str);
			 while(rs.next()){
				 cat=new Categorie();
				
				 cat.setId(Integer.parseInt(rs.getString("id")));
				 cat.setNom(rs.getString("nom"));
				 cat.setDiscription(rs.getString("discription"));
				 
				
				 catList.add(cat);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return catList;
	}
		
	}


