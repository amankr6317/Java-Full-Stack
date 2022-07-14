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
 * Servlet implementation class CRUDUpdateFormValue
 */
@WebServlet("/CRUDUpdateFormValue")
public class CRUDUpdateFormValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ID = request.getParameter("id");
		int id = Integer.parseInt(ID);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		CRUDModel crudModel = new CRUDModel();
		crudModel.setId(id);
		crudModel.setName(username);
		crudModel.setPassword(password);
		crudModel.setEmail(email);

		int status = CRUDDao.update(crudModel);

		if (status > 0) {
			request.getRequestDispatcher("updateEmp.jsp").include(request, response);
		}
		
	}

}
