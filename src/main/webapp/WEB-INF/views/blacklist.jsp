<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="resource/css/bootstrap.css" />
        <link rel="stylesheet" href="resource/css/style.css" />
        <link rel="stylesheet" href="resource/css/jquery-ui.css"/>
        <script type="text/javascript" src="resource/js/jquery-3.2.0.js"></script>
        <script type="text/javascript" src="resource/js/bootstrap.js"></script>
        <script type="text/javascript" src="resource/js/jquery-ui.js"></script>
        <script type="text/javascript" src="resource/js/jquery.cookie.js"></script>
        <script type="text/javascript" src="resource/js/main.js"></script>
		<title>黑名单</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/HouseIntermediarySystem/Mainpage">蔡氏集团</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <div class="navbar-right" id="welcome" style="line-height: 50px;color: white;"><span style="color:white;">${username},你好</span>&nbsp;</div>
                    
                </div>
            </div>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidenav">
                    <ul class="nav nav-sidenav">
                        <li class="active"><a href="/HouseIntermediarySystem/Achivement">业绩排名</a></li>
                        <li><a href="/HouseIntermediarySystem/Achivement/notice">查看公告</a></li>
                        <li><a href="/HouseIntermediarySystem/Contract">合同信息</a></li>
                        <li><a href="/HouseIntermediarySystem/Achivement/housesource">房源信息</a></li>
                        <li><a href="/HouseIntermediarySystem/BlackList">黑名单</a></li>
                        <li><a id="quit" href="/HouseIntermediarySystem/Index">退出</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-offset-2"><span style="float:left;font-size:14px;padding-top:20px;">当前位置：<a href="/HouseIntermediarySystem/Mainpage">首页</a>><a href="/HouseIntermediarySystem/BlackList">黑名单</a></span></div>
			 <div id="searchBlackList" class="input-group" >
            	
            	<input id="searchBody" type="text" class="form-control" placeholder="请输入客户名" style="width: 180px;"/>
            	<button id="NameSearch" class="btn btn-info btn-search" style="margin-bottom:3px;">查找</button>
            </div>
            <div id="blacklist" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <div class="table-responsive">
                        <table id="list1" class="table table-striped">
                            <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>客户姓名</th>
                                    <th>客户身份证号</th>
                                    <th>描述</th>
                                    <th>记录时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                
                            <tbody id="listbody">
                            </tbody>
                        </table>
            </div>
			<button id="openDialog" class="btn btn-success" style="border:1px solid">添加记录</button>
			 <div id="dialog-form" title="创建新合同" style="display:none;">
            	<form>
            		<fieldset>
            			<label for="newClientName">客户姓名</label>
            			<input id="newClientName" type="text"  class="form-control" style="width:300px">
    					<label for="newClientId">客户身份证号</label>
    					<input id="newClientId" type="text"  class="form-control" style="width:300px">
    					<label for="newDescription">描述</label>
    					<input id="newDescription" type="text"  class="form-control" style="width:300px">
            		</fieldset>
            	</form>
            </div>
</body>
<script>
 $().ready(function() {
	request(null,"GET","BlackList/query/2/1",refreshBlackList);
	}); 
 $("#NameSearch").click(function(){
	 var clientname=$("#searchBlackList").find("#searchBody").val();
	 request(null,"GET","BlackList/query/1/"+clientname,refreshBlackList);
 });
 $("#openDialog").click(function(){
	 $("#dialog-form").dialog({
		 width:350,
		 height:300,
		 modal:true,
		 buttons:{
			 "确定":function(){
				 CreateBlackList();
				 request(null,"GET","BlackList/query/2/1",refreshBlackList);
				 $("#dialog-form").dialog("close");
				 
			 },
			 "取消":function(){
				 $("#dialog-form").dialog("close");
			 }
		 }
	 });
 });
 $("#quit").click(function(){
		$.cookies("token",null,{path:"/"});
	});
</script>
</html>