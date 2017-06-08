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
		
		<title>合同信息</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/HouseIntermediarySystem/Achivement">蔡氏集团</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <div class="navbar-right" id="welcome" style="line-height: 50px;color: white;"><span style="color:white;"><%session.getAttribute("username"); %>,你好</span>&nbsp;</div>
                </div>
            </div>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidenav">
                    <ul class="nav nav-sidenav">
                        <li class="active"><a href="/HouseIntermediarySystem/Achivement">业绩排名</a></li>
                        <li><a href="/HouseIntermediarySystem/Achivement/notice">查看公告</a></li>
                        <li class="dropdown"><a href="/HouseIntermediarySystem/Contract" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="flase">合同信息<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">已完成合同</a></li>
                                <li><a href="#">待审核合同</a></li>
                            </ul>
                        </li>
                        <li><a href="/HouseIntermediarySystem/Achivement/housesource">房源信息</a></li>
                        <li><a href="/HouseIntermediarySystem/Blacklist">黑名单</a></li>
                        <li><a href="#">退出</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-offset-2"><span style="float:left;font-size:14px;padding-top:20px;">当前位置：<a href="">首页</a>><a href="#">合同信息</a></span></div>

            <div id="contractlist" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <div class="table-responsive">
                        <table id="list1" class="table table-striped">
                            <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>签约楼盘</th>
                                    <th>客户姓名</th>
                                    <th>签约时间</th>
                                    <th>负责人</th>
                                    <th>操作</th>
                                    
                                </tr>
                                </thead>
                                
                            <tbody id="listbody">
                            </tbody>
                        </table>
            </div>
            <button id="openDialog" class="btn" style="border:1px solid">新增合同</button>
            <div id="dialog-form" title="创建新合同" style="display:none;">
            	<form>
            		<fieldset>
            			<label for="newHousesname">楼盘名</label>
            			<input id="newHousesname" type="text"  class="form-control" style="width:300px">
    					<label for="newHousesarea">房屋面积</label>
    					<input id="newHousesarea" type="text"  class="form-control" style="width:300px">
    					<label for="newHousesprice">房屋价格/平方米</label>
    					<input id="newHousesprice" type="text"  class="form-control" style="width:300px">
    					<label for="newIntentiongold">订金</label>
    					<input id="newIntentiongold" type="text"  class="form-control" style="width:300px">
    					<label for="newDealgold">成交金额</label>
    					<input id="newDealgold" type="text"  class="form-control" style="width:300px">
    					<label for="newClientname">客户姓名</label>
    					<input id="newClientname" type="text"  class="form-control" style="width:300px">
    					<!-- <label for="newSigntime">签约时间</label>
    					<input id="newSigntime" type="text" class="form-control" style="width:300px"> -->
    					<label for="newEmployeename">负责人</label>
    					<input id="newEmployeename" type="text"  class="form-control" style="width:300px">
            		</fieldset>
            	</form>
            </div>
            <div id="dialog" title="合同详细" style="display:none;">
            	<div class="table-responsive">
                        <table id="detaillist" class="table table-bordered">
                            <thead>
                                <tr>
                                    <th>签约楼盘</th>
                                    <th>房屋面积</th>
                                    <th>房屋价格/平方米</th>
                                    <th>订金</th>
                                    <th>成交金额</th>
                                    <th>客户姓名</th>
                                    <th>客户身份证</th>
                                    <th>签约时间</th>
                                    <th>负责人</th>
                                </tr>
                                </thead>
                            <tbody id="detailbody">
                            		
                            </tbody>
                        </table>
            
            </div>

 <script type="text/javascript" src="resource/js/main.js"></script>
 </body>

 
<script>
	$().ready(function() {
	request(null,"GET","Contract/none/list/4/1",refreshContractList);
	});
	$("#openDialog").click(function (){
		$("#dialog-form").dialog({
			width:"350",
			height:"450",
			modal:true,
			draggable:false,
			buttons:{
				"创建合同":function(){
					CreateContract();
					$("#dialog-form").dialog("close");
					request(null,"GET","Contract/none/list/4/1",refreshContractList);
					
				},
				"取消":function(){
					$("#dialog-form").dialog("close");
				}
			},

		});
	}); 

	
  
</script>
</html>