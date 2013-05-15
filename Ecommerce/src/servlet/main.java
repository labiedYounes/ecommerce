package servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.data.Categorie;

import dao.factory;

/**
 * Servlet implementation class main
 */
public class main extends HttpServlet {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected factory fact=new factory();
	protected int displayedElms=10;
	public void setReqAndResp(HttpServletRequest req,HttpServletResponse resp){
		request=req;
		response=resp;
	
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void dispatch(String str) {
		try {
			request.getRequestDispatcher(str).forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected Vector<Categorie> paging(Vector<Categorie> list,int display) {
		Vector<Categorie> sentList=null;
		if(list.size()>displayedElms){
			sentList=getSentList(list,displayedElms,display);
		}
		
		
		return null;
		
	}
	private Vector<Categorie> getSentList(Vector<Categorie> list,
			int displayedElms2, int display) {
		
		return null;
	}
}
