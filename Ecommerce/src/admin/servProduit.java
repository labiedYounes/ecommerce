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

import project.data.produit;
import servlet.main;

/**
 * Servlet implementation class servProduit
 */
public class servProduit extends main {
	private static final long serialVersionUID = 1L;
//	private static final int paginateItems = 5;
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
	/* afficher les produit requestedForm =1
	 * afficher un produit  requestedForm =2
	 * afficher le formulaire pour modifier ou créer un produit requestedForm =3
	 * 
	 * */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setReqAndResp(req, resp);
		switch (Integer.parseInt(request.getParameter("callVar"))) {
		case 0:request.setAttribute("requestedForm",1);//afficher les  produits
		afficher();
		break;
		case 1:request.setAttribute("requestedForm",3);//afficher les  produits
		if(request.getParameter("id")==null){
			dispatch("produit");}
		else{
			request.setAttribute("prod",fact.getInstanceOfProdDao().find(Integer.parseInt(request.getParameter("id"))));
			dispatch("produit");
		}

		break;
		case 2:ajouter();


		break;
		case 3:supp();


		break;
		case 4:modifier();
		break;
		case 5:afficherProd();//afficher un produit
		break;
		default:
			break;
		}


	}

	private void afficherProd() {
		request.setAttribute("requestedForm",2);//afficher un produit
		request.setAttribute("prod",fact.getInstanceOfProdDao().find(Integer.parseInt(request.getParameter("id"))));
		dispatch("produit");



	}

	private void afficher() {
		setSession(request.getParameter("idCat"),"idCat");
		produitDao prodD=fact.getInstanceOfProdDao();
		Vector<produit> listProduit=null;
		Vector actuList=null;
		int pageNum=1;
		try {
			listProduit=prodD.getList("id in (select idP from catproduit where idC="+Integer.parseInt((String)request.getSession().getAttribute("idCat"))+")");
			
			pageNum=(request.getParameterMap().containsKey("pagReqVal"))?Integer.parseInt(request.getParameter("pagReqVal")):pageNum;

			actuList=paginateur.getRequestedCollection(prodD.getList("id in (select idP from catproduit where idC="+Integer.parseInt((String)request.getSession().getAttribute("idCat"))+")"),pageNum);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		request.setAttribute("minPage",1);
		
		request.setAttribute("maxPage",listProduit.size()/paginateur.getItemPerPage());
		request.setAttribute("listProduit", actuList);
		request.setAttribute("listSize", listProduit.size());
		dispatch("produit");

	}

//	private Vector selectItem(Vector list, int i) {
//		int max=(list.size()/paginateItems)*i;
//		int min=max-paginateItems;
//		System.out.println("i :"+i+" max :"+max+",min :"+min);
//		if(min<0){
//			return list;
//		}
//		if(max>list.size()){
//			return rang(list,min,list.size());
//		}
//		return rang(list,min,max);
//	}

	private Vector rang(Vector list, int min, int max) {
		Vector page=new Vector();
		for(int i=min;i<max;i++){
			page.add(list.get(i));			
		}
		return page;
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
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
