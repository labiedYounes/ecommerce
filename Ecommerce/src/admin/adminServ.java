package admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategorieDao;
import dao.utilisateurDao;

import project.connection.connec;
import project.data.Categorie;
import project.data.utilisateur;
import servlet.main;

/**
 * Servlet implementation class adminServ
 */
public class adminServ extends main {
	private static final long serialVersionUID = 1L;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setReqAndResp(req, resp);
		utilisateur user=(utilisateur) request.getSession().getAttribute("user");
		if(user !=null){
			
		request.setAttribute("user", user);
		request.setAttribute("val", 56*6);
		createInfo(user.getType(),request);
		dispatch((user).getType());
		}
		else{
			dispatch("index");
		}
	}
	
	
	private void createInfo(String type, HttpServletRequest request) {
		if(type.equals("admin")){
			try {
				Vector<utilisateur> listClient=createClients();
				String clientsHtml=transToHTML(listClient);
				request.setAttribute("listClients",listClient );
			
				Vector<Categorie> listCat=createCategories();
				String catsHtml=transToHTML(listCat);
				request.setAttribute("n",""+listCat.size());
				request.setAttribute("listCat", listCat);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	private <T> String transToHTML(Vector<T >list) {
		String clients="";
		for(int i=0;i<list.size();i++){
			clients+=list.get(i).toString();
		}
		return clients;
	}

	private Vector<utilisateur> createClients() throws SQLException {
		return fact.getInstanceOfUserDao().getList("type=\"client\"");
	}

	private Vector<Categorie> createCategories() throws SQLException {
			return fact.getInstanceOfCatDao().getList(" 1="+1);
		
	}

	private utilisateur getUser(String login, String pwd) throws Exception  {
		return fact.getInstanceOfUserDao().find("login=\""+login+"\" and pwd=\""+pwd+"\"");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
