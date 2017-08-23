package listdao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.eclipse.jdt.internal.compiler.batch.Main;

import com.sun.javafx.collections.MappingChange.Map;

import db.DBAccess;
import db.Iconst;
import servlet.ServletList1;
import info.Items;


public class ListDAO {
	
   public List<Items> DataConn(String field1,String field2){
		       DBAccess dbAccess=new DBAccess();
		        List<Items> itemslist = new ArrayList<Items>(); // 信息集合
		        Items items=new Items();
		       	SqlSession sqlSession=null;
		        items.setField1(field1);
		        items.setField2(field2);
		       	try {
					sqlSession=dbAccess.getSqlSession();
					Ilist iitem=sqlSession.getMapper(Ilist.class);
					itemslist=iitem.allchat(items);
					//itemslist=sqlSession.selectList("chat.allchat",items);
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					if(sqlSession!=null){
						sqlSession.close();
					}
				}
		       	
				return itemslist;
   }
//   单条删除方法
   public void deleteoneitem(int id){
	   DBAccess dbAccess=new DBAccess();
      
      	SqlSession sqlSession=null;
      	try {
			sqlSession=dbAccess.getSqlSession();
			Ilist iitem=sqlSession.getMapper(Ilist.class);
			iitem.deleteoneitem(id);
			//sqlSession.delete("chat.deleteoneitem",id);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
   }
  /**
   *  删除多条数据
   */
   public void deleteBatch(List<Integer> ids){
	   DBAccess dbAccess=new DBAccess();
      	SqlSession sqlSession=null;
      	try {
			sqlSession=dbAccess.getSqlSession();
			Ilist iitem=sqlSession.getMapper(Ilist.class);
			iitem.deletebatch(ids);
			//sqlSession.delete("chat.deletebatch",ids);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
   } 
// 添加数据
 public void insertitem(List<String> item){
	   DBAccess dbAccess=new DBAccess();
    
    	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Ilist iitem=sqlSession.getMapper(Ilist.class);
			iitem.insert(item);

			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
 }
    public String queryitemsList(String field1) {
    	String field2 = null;
    	DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
       	try {
 			sqlSession=dbAccess.getSqlSession();
 			Ilist iitem=sqlSession.getMapper(Ilist.class);
			iitem.wechat(field1);

 			//field2=sqlSession.selectOne("chat.wechat",field1);
 			sqlSession.commit();
 		} catch (Exception e) {
 			return Iconst.NO_MATCHING_CONTENT;
 		}finally{
 			if(sqlSession!=null){
 				sqlSession.close();
 			}
 		}
		return field2;
	}
    public List<Items> selectoneitem(int id) {
    	 DBAccess dbAccess=new DBAccess();
	        List<Items> itemslist = new ArrayList<Items>(); // 信息集合
	        Items items=new Items();
	       items.setId(id);
	       	SqlSession sqlSession=null;
	       	try {
				sqlSession=dbAccess.getSqlSession();
				Ilist iitem=sqlSession.getMapper(Ilist.class);
				itemslist=iitem.selectoneitem(id);
				//itemslist=sqlSession.selectList("chat.selectoneitem",id);
				
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
	       	for(int i=0;i<itemslist.size();i++) {
	       		System.out.println(itemslist.get(i));
	       	}
	       	System.out.println(id);
			return itemslist;
			
    }
    public void updateitem(List<Items> item) {
    	 DBAccess dbAccess=new DBAccess();
     	SqlSession sqlSession=null;
     	String field1=item.get(0).getField1();
     	String field2=item.get(0).getField2();
     	int id=item.get(0).getId();
     	Items items=new Items();
     	items.setId(id);
     	items.setField1(field1);
     	items.setField2(field2);
     	try {
 			sqlSession=dbAccess.getSqlSession();
 			Ilist iitem=sqlSession.getMapper(Ilist.class);
			iitem.updateitem(items);
 			//sqlSession.update("chat.updateitem",items);
 			sqlSession.commit();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}finally{
 			if(sqlSession!=null){
 				sqlSession.close();
 			}
 		}
		for(int i=0;i<item.size();i++) {
			System.out.println(item.get(i).getField1());
			System.out.println(item.get(i).getField2());
			System.out.println(item.get(i).getId());
		}
	}
    
    
    
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {
		ListDAO listdao=new ListDAO();
		listdao.DataConn("", "");
		HashMap<String, Items> itemsmap=new HashMap<String ,Items>();
		  itemsmap.put("key", new Items());
		  Logger log = null ;
		  log.debug("wwj");
		  log.info(itemsmap);
		  log.warn(itemsmap);
		  log.error(itemsmap);
		  listdao.DataConn("", "");
		HashMap<String, Items> itemsdeleteBatch=new HashMap<String ,Items>();
			  itemsmap.put("key", new Items());
			  Logger logdeleteBatch = null ;
			  logdeleteBatch.debug("wwj");
			  logdeleteBatch.info(itemsmap);
			  logdeleteBatch.warn(itemsmap);
			  logdeleteBatch.error(itemsmap);
		HashMap<String, Items> itemsinsert=new HashMap<String ,Items>();
			  itemsmap.put("key", new Items());
			  Logger loginsert = null ;
			  loginsert.debug("wwj");
			  loginsert.info(itemsmap);
			  loginsert.warn(itemsmap);
			  loginsert.error(itemsmap);
	 HashMap<String, Items> queryitemsList=new HashMap<String ,Items>();
	          queryitemsList.put("key", new Items());
			  Logger logchat = null ;
			  logchat.debug("wwj");
			  logchat.info(itemsmap);
			  logchat.warn(itemsmap);
			  logchat.error(itemsmap);
	HashMap<String, Items> selectoneitem=new HashMap<String ,Items>();
	          queryitemsList.put("key", new Items());
			  Logger logupdate = null ;
			  logupdate.debug("wwj");
			  logupdate.info(itemsmap);
			  logupdate.warn(itemsmap);
			  logupdate.error(itemsmap);
	HashMap<String, Items> updateitem=new HashMap<String ,Items>();
	          queryitemsList.put("key", new Items());
			  Logger logupdate2 = null ;
			  logupdate.debug("wwj");
			  logupdate.info(itemsmap);
			  logupdate.warn(itemsmap);
			  logupdate.error(itemsmap);
		  
	}
	
	
}
		
		
		
//	   try{
//	   Connection conn = null;
//		PreparedStatement stmt = null;
//		ResultSet rs = null;
//		/**
//		 * 根据查询条件查询信息列表
//		 */
//	
//		conn = DBconn.getConnection();
//		StringBuffer sql=new StringBuffer("SELECT * from firstchat");
//		StringBuffer sql1=new StringBuffer("SELECT * from firstchat");
//        if(field1!=null&&!"".equals(field1.trim())){
//        	sql.append(" where field1='"+field1+"'");
//        }
//        if(field2!=null&&!"".equals(field2.trim())){
//        	sql1.append("  where field2 LIKE  '%"+field2+"%'");
//        }
//		stmt = conn.prepareStatement(sql.toString());
//		rs = stmt.executeQuery();
//		while (rs.next()) {
//			Items item = new Items();
//			item.setId(rs.getInt("id"));
//			item.setField1(rs.getString("Field1"));
//			item.setField2(rs.getString("Field2"));
//			list.add(item);// 把一个信息加入集合
//		}
//		
//	    } catch (Exception ex) {
//		ex.printStackTrace();
//		}
//	return list;
	
	

