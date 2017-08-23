package service;

import java.util.ArrayList;
import java.util.List;

import info.Items;
import listdao.ListDAO;
/**
 * 
 * @author 王文杰
 *列表相关的业务
 */

public class ListService {
	public List<Items> DataConn(String field1,String field2){
		  ListDAO listdao=new ListDAO();
		  return listdao.DataConn(field1, field2);
		}
	
	
}
