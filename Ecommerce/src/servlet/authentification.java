package servlet;

import java.io.IOException;
//import java.lang.ProcessBuilder.Redirect;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import dao.CategorieDao;
import dao.utilisateurDao;

import project.connection.connec;
import project.data.Categorie;
import project.data.utilisateur;

/**
 * Servlet implementation class authentification
 */
public class authentification extends main {
	private static final long serialVersionUID = 1L;
	
	utilisateurDao userDao=null;
	CategorieDao catDao=null;
	connec con=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		utilisateur user=null;
		try {
		 user=getUser(request.getParameter("login"),request.getParameter("mdp"));
		//response.sendRedirect(user.getType());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 response.sendRedirect("www.google.com");
			
			
		} 
		
		if(user.getType() != null){
			request.getSession().setAttribute("user", user);
		request.getRequestDispatcher(user.getType()+"Serv").forward(request, response);}
		
		else {
			response.sendRedirect("http://www.google.com?login="+request.getParameter("login")+"&pwd="+request.getParameter("mdp"));
		}
			
		
	}


	private utilisateur getUser(String login, String pwd) throws Exception  {
       
       con=new connec();
		 userDao=new  utilisateurDao(con.getCon());
	
		return userDao.find("login=\""+login+"\" and pwd=\""+pwd+"\"");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
