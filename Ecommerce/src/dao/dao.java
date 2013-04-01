package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;


import project.data.produit;
import project.data.utilisateur;

public abstract class dao<T> {
	  protected Connection connect = null;
	   
	  public dao(Connection conn){
	    this.connect = conn;
	  }
	    
	  /**
	  * M�thode de cr�ation
	  * @param obj
	  * @return boolean 
	  */
	  public abstract boolean create(T obj);
	 
	  /**
	  * M�thode pour effacer
	  * @param obj
	  * @return boolean 
	  */
	  public abstract boolean delete(T obj);
	 
	  /**
	  * M�thode de mise � jour
	  * @param obj
	  * @return boolean
	  */
	  public abstract boolean update(T obj);
	 
	  /**
	  * M�thode de recherche des informations
	  * @param id
	  * @return T
	 * @throws SQLException 
	  */
	  public abstract T find(int id) throws SQLException;

	  public abstract T find(String str) throws SQLException;
	  public abstract Vector<T>getList(String string) throws SQLException;

	public boolean create(produit obj, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(produit obj, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}
		
	}