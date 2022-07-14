package com.yash.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.dao.CRUDDao;
import com.yash.model.CRUDModel;

/**
 * Servlet implementation class CRUDSignIn
 */
@WebServlet("/CRUDSignIn")
public class CRUDSignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDSignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		CRUDModel crudModel = new CRUDModel();
		crudModel.setEmail(email);
		crudModel.setPassword(password);
		boolean status = CRUDDao.signIn(email, password);
		if (status == true) {
			request.getRequestDispatcher("index.jsp").include(request, response);
		} else {
			request.getRequestDispatcher("signin.jsp").include(request, response);
		}
		
	}

}
