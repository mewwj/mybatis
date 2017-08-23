package service;

import db.Iconst;
import listdao.ListDAO;

public class QueryService {
	/**
	 * 通过指令查询自动回复的内容
	 * @param command 指令
	 * @return 
	 */
public String queryByCommand(String field1) {
     	 ListDAO listdao=new ListDAO();
//		return listdao.queryitemsList(field1);
	 
	  
	  if(Iconst.HELP_COMMAND.equals(field1)) {
		String e = listdao.queryitemsList(field1);
		StringBuilder result = new StringBuilder();
		
				result.append("<br/>");
				result.append("系统维护");
		return result.toString();
		}else {
	     	return listdao.queryitemsList(field1);
		}
}
}
