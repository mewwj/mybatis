/**
 * 外部引用，删除多条数据
 */
function Function1(){
    if(confirm("你确定要删除？"))
    {
        
        alert("删除");
    }
    else
    {
        alert("取消删除");
        return false;
    }
}
function deleteBatch(basePath){
	$('#mainForm').attr("action","DeleteBatchServlet");
	$('#mainForm').submit();
}