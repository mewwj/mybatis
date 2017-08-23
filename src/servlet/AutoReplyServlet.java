package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.QueryService;


@SuppressWarnings("serial")
public class AutoReplyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String a=req.getParameter("content");
		PrintWriter out = resp.getWriter();
		QueryService queryService = new QueryService();
		try {
			out.write(queryService.queryByCommand(a));
		} catch (Exception e) {
			out.write("对不起，请回复帮助，获取其他选项。");
		}
		
		out.flush();
		out.close();
		System.out.println("123");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
