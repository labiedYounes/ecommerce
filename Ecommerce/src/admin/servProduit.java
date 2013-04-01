package admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.factory;
import dao.produitDao;

import project.connection.connec;
import project.data.produit;
import servlet.main;

/**
 * Servlet implementation class servProduit
 */
public class servProduit extends main {
	private static final long serialVersionUID = 1L;
	private factory fact=new factory();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servProduit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setReqAndResp(req, resp);
		switch (Integer.parseInt(request.getParameter("callVar"))) {
		case 0:afficher();
			break;
		case 1:if(request.getParameter("id")==null){
			     dispatch("manProduit");}
		       else{
			     request.setAttribute("prod",fact.getInstanceOfProdDao().find(Integer.parseInt(request.getParameter("id"))));
			     dispatch("manProduit");
		       }
		
		break;
        case 2:ajouter();
        	
		
		break;
        case 3:supp();
        	
		
		break;
        case 4:modifier();
    		break;
		default:
			break;
		}
		
		
	}

	private void afficher() {
		setSession(request.getParameter("idCat"),"idCat");
		produitDao prodD=fact.getInstanceOfProdDao();
		Vector<produit> listProduit=null;
		try {
			listProduit=prodD.getList("id in (select idP from catproduit where idC="+Integer.parseInt((String)request.getSession().getAttribute("idCat"))+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("listProduit", listProduit);
		request.setAttribute("listSize", listProduit.size());
		dispatch("produit");
		
	}

	private void setSession(String parameter, String str) {
		if(parameter!=null){
			request.getSession().setAttribute(str, parameter);
		}
		
	}

	

	private void supp() {
		produitDao prodD=fact.getInstanceOfProdDao();
	    produit prod=new produit();
	    prod.setId(Integer.parseInt(request.getParameter("id")));
	    if(prodD.delete(prod, request)){
	    	System.out.println("produit suppriée");
	    }
	    afficher();
		
	}

	private void modifier() {
		produitDao prodD=fact.getInstanceOfProdDao();
	    produit prod=new produit();
	    prod.setNom(request.getParameter("nom"));
	    prod.setDiscription(request.getParameter("discription"));
	    prod.setQt(Integer.parseInt(request.getParameter("qt")));
	    prod.setImg(request.getParameter("img"));
	    prod.setId(Integer.parseInt(request.getParameter("idProd")));
		if(prodD.update(prod)){
			System.out.println("produit modifier");
		}
		afficher();
	}

	private void ajouter() {
		produitDao prodD=fact.getInstanceOfProdDao();
	    produit prod=new produit();
	    prod.setNom(request.getParameter("nom"));
	    prod.setDiscription(request.getParameter("discription"));
	    prod.setQt(Integer.parseInt(request.getParameter("qt")));
	    prod.setImg(request.getParameter("img"));
		if(prodD.create(prod,request)){
			System.out.println("produit ajoutée");
		}
		afficher();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
