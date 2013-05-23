package dao;

import java.sql.SQLException;

import project.connection.connec;

public class factory{
	private connec con;
	public factory() {
		creatCon();
	}
	public CategorieDao getInstanceOfCatDao(){
		return new CategorieDao(con.getCon());
	}
	public produitDao getInstanceOfProdDao(){
		return  new produitDao(con.getCon());
	}
	public utilisateurDao getInstanceOfUserDao() {
        return new utilisateurDao(con.getCon()) ;
	}

	private void creatCon() {
		try {
			con = new connec();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
