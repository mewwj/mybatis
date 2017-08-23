package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MaintainService;

public class DeleteBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteBatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String[] ids=request.getParameterValues("id");
		//将查询到的值传给页面
		MaintainService maintainservice=new MaintainService();
		
		maintainservice.deleteBatch(ids);
	      //页面跳转
	     request.getRequestDispatcher("/ServletList1").forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
