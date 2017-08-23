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
		      
		    //����ҳ���ֵ
			request.setCharacterEncoding("utf-8");
			String field1=request.getParameter("field1");
			String field2=request.getParameter("field2");
			//��ҳ�洫ֵ
			//request.setAttribute("field1", field1);
			//request.setAttribute("field2", field2);
			//����ѯ����ֵ����ҳ��
			ListService listservice=new ListService();
		      request.setAttribute("list",listservice.DataConn(field1, field2));
		      //ҳ����ת
		request.getRequestDispatcher("/WEB-INF/jsp/back/List.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
