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
 * Servlet implementation class CRUDSave
 */
@WebServlet("/CRUDSave")
public class CRUDSave extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		CRUDModel crudModel = new CRUDModel();
		crudModel.setName(username);
		crudModel.setPassword(password);
		crudModel.setEmail(email);

		int status = CRUDDao.save(crudModel);

		if (status > 0) {
			request.getRequestDispatcher("addEmp.jsp").include(request, response);
		}
		
	}

}
