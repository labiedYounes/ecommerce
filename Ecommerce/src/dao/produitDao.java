package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;

import project.data.produit;
import project.data.utilisateur;

public class produitDao extends dao<produit> {

	

	public produitDao(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	
	public produit find(int id){
		produit prod=null;
		try {
			stmt=this.connect.prepareStatement("select * from produit where  id=?");
			stmt.setInt(1, id);
			 ResultSet rs =stmt.executeQuery();
			 while(rs.next()){
				 prod=new produit();
				 prod.setId(id);
				 prod.setNom(rs.getString("nom"));
				 prod.setQt(Integer.parseInt(rs.getString("qt")));
				 prod.setImg(rs.getString("img"));
				 prod.setDiscription(rs.getString("discription"));
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prod;
	}

	@Override
	public produit find(String str) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector getList(String str) throws SQLException {
		produit prod=null;
		Vector<produit> prodList=new Vector<produit>();
		java.sql.Statement stmt=null;
		try {
			 stmt=this.connect.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from produit where "+str);
			 while(rs.next()){
				 prod=new produit();
				
				 prod.setId(Integer.parseInt(rs.getString("id")));
			     prod.setQt(Integer.parseInt(rs.getString("id")));
			     prod.setImg(rs.getString("img"));
				 prod.setNom(rs.getString("nom"));
				 prod.setDiscription(rs.getString("discription"));
				 prodList.add(prod);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return prodList;
	}

	@Override
	public boolean create(produit obj,HttpServletRequest request) {
		boolean test=false;
		try {
			 stmt=this.connect.prepareStatement("insert into produit(nom,discription,qt,img) values(?,?,?,?)");
			 stmt.setString(1,obj.getNom() );
			 stmt.setString(2,obj.getDiscription() );
			 stmt.setInt(3, obj.getQt());
			 stmt.setString(4, obj.getImg());
		     stmt.executeUpdate();
		     
		     System.out.println(Integer.parseInt(request.getSession().getAttribute("idCat").toString()));
		     stmt=this.connect.prepareStatement("insert into catproduit(idC,idP) values(?,LAST_INSERT_ID())");
		     stmt.setInt(1,Integer.parseInt(request.getSession().getAttribute("idCat").toString()));
		     test=stmt.executeUpdate()!=0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
		
	}

	@Override
	public boolean delete(produit obj,HttpServletRequest request) {
		boolean test=false;
		try {
			 stmt=this.connect.prepareStatement("delete from catproduit where idP=? and idC=?");
			 stmt.setInt(1,obj.getId() );
			 stmt.setInt(2,Integer.parseInt(request.getSession().getAttribute("idCat").toString()));
			 System.out.println(request.getSession().getAttribute("idCat").toString()+","+obj.getId()+" aa");
			 stmt.executeUpdate();
			 stmt=this.connect.prepareStatement("delete from produit where id=?");
			 stmt.setInt(1, obj.getId());
			 test=stmt.executeUpdate()!=0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public boolean update(produit obj) {
		boolean test=false; 
		try {
			stmt=this.connect.prepareStatement("update produit set nom =? ,discription=?,qt=?,img=? where id=?");
			stmt.setString(1, obj.getNom());
			stmt.setString(2, obj.getDiscription());
			stmt.setInt(3, obj.getQt());
			stmt.setString(4, obj.getImg());
			stmt.setInt(5,obj.getId());
			test=stmt.executeUpdate()!=0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
	}


	@Override
	public boolean create(produit obj) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(produit obj) {
		// TODO Auto-generated method stub
		return false;
	}
	}


