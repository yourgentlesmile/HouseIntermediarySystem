<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="resource/css/bootstrap.css" />
        <link rel="stylesheet" href="resource/css/style.css" />
        <script type="text/javascript" src="resource/js/jquery-3.2.0.js"></script>
        <script type="text/javascript" src="resource/js/bootstrap.js"></script>
		<script type="text/javascript" src="resource/js/zDialog.js"></script>
		<script type="text/javascript" src="resource/js/zDrag.js"></script>
        <script type="text/javascript" src="resource/js/main.js"></script>
        <title>蔡氏集团</title>
        <script>  
            /*
            function CreateList(){
                var achivement = new Achivement(0,
                    $("#list1").find("#empName").val(),
                    $("#list1").find("#houses").val();
                    $("#list1").find("#money").val();
                    $("#list1").find("#empTelephone").val();
                )
                request(achivement,"POST","",refreshList);
            }
            */
        </script>
    </head>

    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/HouseIntermediarySystem/achivement">蔡氏集团</a>
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
                        <li><a href="#">退出</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-offset-2"><span style="float:left;font-size:14px;padding-top:20px;">当前位置：<a href="">首页</a>><a href="#">业绩排名</a></span></div>
            <div id="list" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <div class="table-responsive">
                        <table id="list1" class="table table-striped">
                            <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>姓名</th>
                                    <th>主营楼盘区域</th>
                                    <th>本月业绩</th>
                                    <th>总业绩</th>
                                    <th>联系电话</th>
                                </tr>
                                </thead>
                                
                            
                            <tbody id="listbody">
                            </tbody>
                        </table>
                         
                         <input id="asc" class="btn btn-success" value="升序排列"  type="button" onclick="">
                         <input id="desc" class="btn btn-success" value="降序排列"  type="button" onclick="">
                </div>
            </div>
        </div>
        <script>
        $().ready(function() {
        	request(null,"GET","Achivement/getAchivement/0",refreshWorkList);
		});
  
        $("#asc").click(function(){
        	request(null,"GET","Achivement/getAchivement/1",refreshWorkList);
         }); 
        $("#desc").click(function(){
        	request(null,"GET","Achivement/getAchivement/0",refreshWorkList);
         }); 
       
        </script>
    </body>

</html>