<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="resource/css/bootstrap.css" />
        <link rel="stylesheet" href="resource/css/style.css" />
        <script type="text/javascript" src="resource/js/jquery-3.2.0.js"></script>
        <script type="text/javascript" src="resource/js/bootstrap.js"></script>
<title>房源信息</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/HouseIntermediarySystem/achivement">蔡氏集团</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <div class="navbar-right" id="welcome" style="line-height: 50px;color: white;"><span class="glyphicon glyphicon-user"></span>&nbsp;</div>
                    
                </div>
            </div>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidenav">
                    <ul class="nav nav-sidenav">
                        <li class="active"><a href="/HouseIntermediarySystem/achivement">业绩排名</a></li>
                        <li><a href="/HouseIntermediarySystem/notice">查看公告</a></li>
                        <li><a href="#">合同信息</a></li>
                        <li><a href="/HouseIntermediarySystem/housesource">房源信息</a></li>
                        <li style="display:none;"><a href="#">跟进记录</a></li>
                        <!--<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="flase">跟进记录<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">查看跟进记录</a></li>
                                <li><a href="#">新增跟进记录</a></li>
                            </ul>
                        </li>-->
                        <li><a href="#">退出</a></li>
                    </ul>
                </div>
            </div>
            <div id="search" class="input-group col-sm-offset-9" style="margin-top:15px; border:none;">
            	<input type="text" class="form-control" value="请输入房屋名" onfocus=if(this.value=="请输入房屋名"){this.value="";}; onblur=if(this.value==""){this.value="请输入房屋名";};>
            		<span class="input-group-btn">
            		<button class="btn btn-info btn-search">查找</button>
            		</span>
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
                                    <th>负责人</th>
                                </tr>
                                </thead>                                      
                            <tbody id="listbody">
                            </tbody>
                        </table>
            </div>
</body>
<script>
	$().ready(function({
		request(null,"GET","",refreshHouseList);
	}));
	
	
</script>
</html>