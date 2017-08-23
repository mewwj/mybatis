package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info.Items;
import service.ListService;
import service.MaintainService;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
        String field11=request.getParameter("updatefield1");
        String field22=request.getParameter("updatefield2");
		String id=request.getParameter("updateid");
		int id2=Integer.valueOf(id);
		List<Items> item = new ArrayList();
	     Items items=new Items();
	     items.setId(id2);
	     items.setField1(field11);
	     items.setField2(field22);
	     item.add(items);
	     
		//将查询到的值传给页面
		System.out.println("updateid:"+id);
		MaintainService maintainservice=new MaintainService();
		   maintainservice.updateitem(item);
	 request.getRequestDispatcher("/ServletList1").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
