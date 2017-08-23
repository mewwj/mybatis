package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ListService;
import service.MaintainService;

/**
 * 删除一条数据的servlet
 */
public class DeleteOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteOneServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		//将查询到的值传给页面
		MaintainService maintainservice=new MaintainService();
		maintainservice.deleteoneitem(id);
	      //页面跳转
	request.getRequestDispatcher("/ServletList1").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
