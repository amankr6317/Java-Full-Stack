package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.dao.CRUDDao;
import com.yash.model.CRUDModel;

/**
 * Servlet implementation class CRUDUpdate
 */
@WebServlet("/CRUDUpdate")
public class CRUDUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ID = request.getParameter("id");
		int id = Integer.parseInt(ID);
		CRUDModel crudModel = CRUDDao.getEmployeeById(id);

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
        		+ "<html lang=\"en\">\r\n"
        		+ "<head>\r\n"
        		+ "<meta charset=\"ISO-8859-1\">\r\n"
        		+ "<title>UPDATE FORM</title>\r\n"
        		+ "<link rel=\"stylesheet\" href=\"css/indexstyle.css\">\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "	<div class=\"employee-form\">\r\n"
        		+ "		<div class=\"form-header\">\r\n"
        		+ "			<h1>UPDATE EMPLOYEE</h1>\r\n"
        		+ "		</div>\r\n"
        		+ "		<div class=\"employee-form-body\">\r\n"
        		+ "			<form action=\"updatevalue\" method=\"post\">\r\n"
        		+ "				<table>\r\n"
				+ "					<tr>\r\n"
        		+ "						<td class=\"form-head-css\" style=\"display: none;\">ID:</td>\r\n"
        		+ "						<td><input type=\"text\" name=\"id\" class=\"form-input-css\" style=\"display: none;\" value=\""+ crudModel.getId() +"\" /></td>\r\n"
        		+ "					</tr>\r\n"
        		+ "					<tr>\r\n"
        		+ "						<td class=\"form-head-css\">Name:</td>\r\n"
        		+ "						<td><input type=\"text\" name=\"username\" class=\"form-input-css\" value=\""+ crudModel.getName() +"\" required /></td>\r\n"
        		+ "					</tr>\r\n"
        		+ "					<tr>\r\n"
        		+ "						<td>Password:</td>\r\n"
        		+ "						<td><input type=\"password\" name=\"password\" class=\"form-input-css\" value=\""+ crudModel.getPassword() +"\"  required /></td>\r\n"
        		+ "					</tr>\r\n"
        		+ "					<tr>\r\n"
        		+ "						<td>Email:</td>\r\n"
        		+ "						<td><input type=\"email\" name=\"email\" class=\"form-input-css\" value=\""+ crudModel.getEmail() +"\" required /></td>\r\n"
        		+ "					</tr>\r\n"
        		+ "				</table>\r\n"
        		+ "				<div class=\"form-footer\">\r\n"
        		+ "					<input type=\"submit\" value=\"Update Employee\" class=\"form-button\" />\r\n"
        		+ "				</div>\r\n"
        		+ "			</form>\r\n"
        		+ "		</div>\r\n"
        		+ "	</div>\r\n"
        		+ "</body>\r\n"
        		+ "</html>");
        out.close();

	}

}
