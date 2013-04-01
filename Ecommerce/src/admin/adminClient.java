package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.data.utilisateur;
import servlet.main;

import dao.*;

/**
 * Servlet implementation class adminClient
 */
public class adminClient extends main {
	
	private factory fact=new factory(); 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		setReqAndResp(req, resp);
		switch (Integer.parseInt(request.getParameter("callVar"))) {
		case 0:afficher();	break;
		default:
			break;
		}
	}

	private void afficher() {
		utilisateurDao userDao=fact.getInstanceOfUserDao();
		System.out.println("qsdqs :"+request.getParameter("idClient"));
		utilisateur user=userDao.find(Integer.parseInt(request.getParameter("idClient")));
		request.setAttribute("client", user);
		dispatch("client");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
