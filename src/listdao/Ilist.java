package listdao;



import java.util.List;

import info.Items;

/*
 * 与list文件相对应的接口
 */
public interface Ilist {
	public List<Items> allchat(Items items);
		     
	public List<Items>  selectoneitem(int id); 
		  
	public void updateitem(Items items);
	
	public String wechat(String field1);
		   
    public void deleteoneitem(int id);
		    
	public void deletebatch(List<Integer> ids);
	
	public   void  insert(List<String> item);
}
