package info;



public class Items {
	private int id;
	private String field1;
	private String field2;
	private String content;
	 public Items(){}
	 public Items(int id,String field1,String field2){
		 this.id=id;
		 this.field1=field1;
		 this.field2=field2;
	 }
	 
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}



}
