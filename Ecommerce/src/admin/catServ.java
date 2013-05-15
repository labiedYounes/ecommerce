package admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.connection.connec;
import project.data.Categorie;
import servlet.main;

import dao.CategorieDao;
import dao.factory;

/**
 * Servlet implementation class catServ
 */
public class catServ extends main {
	private static final long serialVersionUID = 1L;
	
	private factory f=new factory();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public catServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /* afficher les categries requestedForm =1
     * ajouter ou modifier un categorie requestedForm =2
     *
     */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setReqAndResp(req, resp);
		switch (Integer.parseInt(request.getParameter("callVar"))) {
		case 1:fillcatOrMod();break;
		case 2:ajouterCat();break;
		case 3:modCat();break;
		case 4:delete();break;
		default:break;
		}
		
		
	}

	private void delete() {
		Categorie cat=creatCatWithId();
		CategorieDao catDao=f.getInstanceOfCatDao();
		if(catDao.delete(cat)){
			System.out.println("supprimée");
		}
		else {
			System.out.println("n'est pas suprimée");
		}
		dispatch("adminServ");
		
	}

	private void fillcatOrMod() {
		/*
		 * ajouter un categorie catMan=1
		 * modifier un categorie catMan=2
		 */
		request.setAttribute("requestedForm", 2);
		if(request.getParameter("id")== null){
			request.setAttribute("catMan", 1);//vers addCategorie.jspf
			dispatch("admin");
		}else{
		request.setAttribute("catMan", 2);//vers modCat.jspf
		request.setAttribute("cat", f.getInstanceOfCatDao().find(Integer.parseInt(request.getParameter("id"))));
		dispatch("admin");}
	}

	

	

	private void modCat() {
		Categorie cat=creatCatWithId();
		CategorieDao catDao=f.getInstanceOfCatDao();
		if(catDao.update(cat)){
			System.out.println("modifiée");
		}
		else {
			System.out.println("n'est pas modifiée");
		}
		dispatch("adminServ");
	}

	private void ajouterCat() {
        CategorieDao catDao= f.getInstanceOfCatDao();
		if(catDao.create(creatCat())){
			System.out.println("cat ajoutée");
		}
		dispatch("adminServ");
	}

	private Categorie creatCatWithId() {
		Categorie cat =new Categorie();
		cat.setId(Integer.parseInt(request.getParameter("id")));
		cat.setNom(request.getParameter("nom"));
		cat.setDiscription(request.getParameter("discription"));
		return cat;
	}
	private Categorie creatCat() {
		Categorie cat =new Categorie();
		cat.setNom(request.getParameter("nom"));
		cat.setDiscription(request.getParameter("discription"));
		return cat;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
