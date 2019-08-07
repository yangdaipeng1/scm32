<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/common/common.jspf"%>
<html>
<head>
<title></title>
<style type="text/css">
.searchbox{
	margin:-3
}
</style>

<script type="text/javascript">
	$(function() {
		$('#dg').datagrid({
			//url:'${proPath}/supplier/selectPage.action',//通过关键字查询
			//支持多条件查询
			url:'${proPath}/supplier/selectPageUseDyc.action',
			fitColumns:true,
			nowrap:true,
			//idField:
			pagination:true,
			rownumbers:true,
			pageSize:5,
			pageList:[2,5,10,20],
			queryParams: {
				supName:'%%',
				supAddress:'%%'
			},
			
			toolbar: [{
				iconCls: 'icon-add',
				text:'新增',
				handler: function(){
					alert('新增按钮');
					}
			},'-',{
				iconCls: 'icon-edit',
				text:'修改',
				handler: function(){
					alert('修改按钮');
				}
			},'-',{
				iconCls: 'icon-remove',
				text:'删除',
				handler: function(){
					alert('删除按钮');
				}
			},'-',{
				text:"名称：<input type='text' id='supName' name='supName'/>",
				
			},'-',{
				text:"地址：<input type='text' id='supAddress' name='supAddress'/>",
				
			}],

			columns : [ [ {
				checkbox:true,
			},{
				field : 'supId',
				title : '供应商编号',
				width : 100
			}, {
				field : 'supName',
				title : '供应商名称',
				width : 100
			}, {
				field : 'supAddress',
				title : '地址',
				width : 100,
				align : 'right'
			} ] ]
		});
		$('#supAddress').searchbox({ 
			searcher:function(value,name){ 
				alert("supAddress:"+value);
				alert("supName:"+$('#supName').val());
				$('#dg').datagrid('load',{
					supName: '%'+$('#supName').val()+'%',
					supAddress: '%'+value+'%'
					
				});
			}, 
			prompt:'请输入供应商名称' 
			});
		/*$('#ss').searchbox({ 
			searcher:function(value,name){ 
				alert(value + "," + name);
				$('#dg').datagrid('load',{
					keyWord: '%'+value+'%'
					
				});
			}, 
			prompt:'请输入供应商名称' 
			});
		*/


	});
</script>




</head>


<body>

	<table id="dg"></table>
</body>

</html>