<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../resource/css/bootstrap.css" />
        <link rel="stylesheet" href="../resource/css/style.css" />
        <link rel="stylesheet" href="../resource/css/jquery-ui.css"/>
        <script type="text/javascript" src="../resource/js/jquery-3.2.0.js"></script>
        <script type="text/javascript" src="../resource/js/bootstrap.js"></script>
        <script type="text/javascript" src="../resource/js/main.js"></script>
        <script type="text/javascript" src="../resource/js/jquery-ui.js"></script>
<title>房源信息</title>
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
            <div class="col-sm-offset-2"><span style="float:left;font-size:14px;padding-top:20px;">当前位置：<a href="/HouseIntermediarySystem/Mainpage">首页</a>><a href="/HouseIntermediarySystem/Achivement/housesource">房源信息</a></span></div>
            <div id="search" class="input-group" >
            	
            	<input id="searchBody" type="text" class="form-control" placeholder="请输入楼盘名" style="width: 180px;"/>
            	<button id="NameSearch" class="btn btn-info btn-search" style="margin-bottom:3px;">查找</button>
            	
            	<input id="area_min" type="text" class="ipt" style="width:50px;height:34px;margin-left:10px;"/>
            	<span>-</span>
            	<input id="area_max" type="text" class="ipt" style="width:50px;height:34px;"/>
            	<button id="AreaSearch" class="btn btn-info btn-search" style="margin-left: -4px;margin-bottom: 3px;">面积区间查找</button>
            	
            	<input id="price_min" type="text" class="ipt" style="width:50px;height:34px;margin-left:10px;"/>
            	<span>-</span>
            	<input id="price_max" type="text" class="ipt" style="width:50px;height:34px;"/>
            	<button id="PriceSearch" class="btn btn-info btn-search" style="margin-left: -4px;margin-bottom: 3px;">价格区间查找</button>
            </div>
            <div id="houselist" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <div class="table-responsive">
                        <table id="list1" class="table table-striped">
                            <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>楼盘名</th>
                                    <th>房屋面积</th>
                                    <th>房屋价格</th>
                                    <th>业主联系电话</th>
                                    <th>开盘时间</th>
                                    <th>负责人</th>
                                </tr>
                                </thead>                                      
                            <tbody id="listbody">
                            </tbody>
                        </table>
            </div>
            <input id="createHouse" type="button" value="添加房源" class="btn btn-success">
            </div>
            <div id="open_map" style="display:none;">
            	<iframe id="map" style="width:600px;height:499px" src=""></iframe>
            </div>
            <div id="newHouse" style="display:none;" title="添加房源信息">
            	<form>
            		<fieldset>
            			<label for="newHousesname">楼盘名</label>
            			<input id="newHousesname" type="text"  class="form-control" style="width:300px">
    					<label for="newHousesarea">房屋面积</label>
    					<input id="newHousesarea" type="text"  class="form-control" style="width:300px">
    					<label for="newHousesprice">房屋价格/平方米</label>
    					<input id="newHousesprice" type="text"  class="form-control" style="width:300px">
    					<label for="newClientTelephone">业主联系电话</label>
    					<input id="newClientTelephone" type="text"  class="form-control" style="width:300px">
    					<label for="newHousesOpentime">开盘时间</label>
    					<input id="newHousesOpentime" type="text"  class="form-control" style="width:300px">
    					<label for="newEmployeename">负责人</label>
    					<input id="newEmployeename" type="text"  class="form-control" style="width:300px">
            		</fieldset>
            	</form>
            </div>
            
            </div>
            
</body>
<script>
	$().ready(function(){
		request(null,"GET","getHouseInfo",refreshHouseList);
	});
	$("#NameSearch").click(function(){
		var housename = $("#search").find("#searchBody").val();
		request(null,"POST","queryHouseInfo?type=1&housename=" + housename,refreshHouseList);
	});
	$("#AreaSearch").click(function(){
		var area_min=$("#search").find("#area_min").val();
		var area_max=$("#search").find("#area_max").val();
		request(null,"POST","queryHouseInfo?type=3&min="+area_min+"&max="+area_max,refreshHouseList);
	})
	$("#PriceSearch").click(function(){
		var price_min=$("#search").find("#price_min").val();
		var price_max=$("#search").find("#price_max").val();
		request(null,"POST","queryHouseInfo?type=2&min="+price_min+"&max="+price_max,refreshHouseList);
	})
	$("#createHouse").click(function(){
		$("#newHouse").dialog({
			width:"350",
			height:"450",
			modal:true,
			draggable:false,
			buttons:{
				"添加房源":function(){
					CreateHouse();
					$("#newHouse").dialog("close");
					request(null,"GET","getHouseInfo",refreshHouseList);
				},
				"取消":function(){
					$("#newHouse").dialog("close");
				}
			},

		});
	});
	$("#quit").click(function(){
		$.cookies("token",null,{path:"/"});
	});
</script>
</html>