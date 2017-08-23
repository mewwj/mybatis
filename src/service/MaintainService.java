package service;

import java.util.ArrayList;
import java.util.List;

import info.Items;
import listdao.ListDAO;

/**
 * 维护
 *
 */

public class MaintainService {
 public void deleteoneitem(String id){
	 if(id!=null&&!"".equals(id.trim())){
	 ListDAO listdao=new ListDAO();
	 listdao.deleteoneitem(Integer.valueOf(id));
	 }
 }
 public void deleteBatch(String[] ids){
	
		 ListDAO listdao=new ListDAO();
		 List<Integer> idlist=new ArrayList<Integer>();
		 for(String id:ids){
			 idlist.add(Integer.valueOf(id));
		 }
		 listdao.deleteBatch(idlist);
 }
 public void insert(String[] item){
		
	 ListDAO listdao=new ListDAO();
	 List<String> itemlist=new ArrayList<String>();
	 for(String message:item){
		 itemlist.add(message);
	 }
	 listdao.insertitem(itemlist);
}
 public List<Items> selectoneitem(String id){
	   ListDAO listdao=new ListDAO();
	   return listdao.selectoneitem(Integer.valueOf(id));
}
 //更新数据
 public void updateitem(List<Items> item){
		
	 ListDAO listdao=new ListDAO();
	 listdao.updateitem(item);
}
 
}
