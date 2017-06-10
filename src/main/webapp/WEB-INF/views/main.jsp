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
        <script type="text/javascript" src="resource/js/main.js"></script>
		<title>首页</title>
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
            <div class="col-sm-offset-2"><span style="float:left;font-size:14px;padding-top:20px;">当前位置：<a href="/HouseIntermediarySystem/Mainpage">首页</a>></span></div>
			<div id="mainbody" class="panel panel-default col-md-offset-2" style="width:1000px;height:500px;margin-top:50px;">
				<ul style="list-style:none;">
					<li><p>今天工作不努力，明天努力找工作</p></li>				
					<iframe height=500px width=950px src="http://m.amap.com/navi/?dest=115.816623,28.727408&destName=江西财经大学麦庐园&hideRouteIcon=1&key=cb95629eb44f385aad3a787a8f410736"></iframe>
				</ul>
			</div>
            

</body>
<script>

	$("#quit").click(function(){
		$.cookies("token",null,{path:"/"});
	});

</script>
</html>