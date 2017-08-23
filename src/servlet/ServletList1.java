package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ListService;

public class ServletList1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletList1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      
		    //接受页面的值
			request.setCharacterEncoding("utf-8");
			String field1=request.getParameter("field1");
			String field2=request.getParameter("field2");
			//向页面传值
			//request.setAttribute("field1", field1);
			//request.setAttribute("field2", field2);
			//将查询到的值传给页面
			ListService listservice=new ListService();
		      request.setAttribute("list",listservice.DataConn(field1, field2));
		      //页面跳转
		request.getRequestDispatcher("/WEB-INF/jsp/back/List.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
