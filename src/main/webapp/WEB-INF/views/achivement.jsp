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
        <title>JSP Page</title>
        <script>
            /*$(document).ready(function(){
                refreshList();
            })
            */    
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
           /*  function request(object,method,methodURL){ 
                $.ajax({
                    cache: true,
                    type: method,
                    datatype:"json",
                    contentType: "application/json",
                    url:methodURL,
                    data:JSON.stringify(object),
                    error: function(XMLHttpRequest, textStatus, errorThrown) {
                            alert(XMLHttpRequest.status+"\r\n"+XMLHttpRequest.readyState+"\r\n"+textStatus);
                },
                success: function(data,textStatus){
                console.log(6);
                alert(data);
                }
            }); */
        </script>
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
                        <li class="active"><a href="#">业绩排名</a></li>
                        <li><a href="/HouseIntermediarySystem/notice">查看公告</a></li>
                        <li><a href="#">合同信息</a></li>
                        <li><a href="#">房源信息</a></li>
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
            <div id="list" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <div class="table-responsive">
                        <table id="list1" class="table table-striped">
                            <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>姓名</th>
                                    <th>主营楼盘区域</th>
                                    <th>联系电话</th>
                                    <th>本月业绩</th>
                                    <th>总业绩</th>
                                </tr>
                                </thead>
                                
                            
                            <tbody id="listbody">
                            </tbody>
                        </table>
                         
                         <input id="test1" class="btn btn-success" value="新增"  type="button" onclick="open1()">
                </div>
                
            </div>
        </div>
        <script>
        var ach = 
        	[{"userid":"1","userName":"zzw","area":"湾里区","achivement":"100k","totalAch":"300k","userTel":"15279108332"},
        	{"userid":"2","userName":"xc","area":"帝豪辉煌城","achivement":"20k","totalAch":"500k","userTel":"123456789"},
        	{"userid":"3","userName":"chw","area":"宝石广场","achivement":"3k","totalAch":"10k","userTel":"12300000000"}];
        
        function open1(){
        	Dialog.open({URL:"window"});
        }

		
        $().ready(function refreshList(){
            var selector = $("#list").find("#list1").find("#listbody");
            selector.html("");
            for(var i=0;i<ach.length;i++){
            	var id = "<th>"+ach[i].userid+"</th>";
                var name = "<th>"+ach[i].userName+"</th>";
                var area = "<th>"+ach[i].area+"</th>";
                var achivement = "<th>"+ach[i].achivement+"</th>";
                var totalAch = "<th>"+ach[i].totalAch+"</th>";
                var userTel = "<th>"+ach[i].userTel+"</th>";
                selector.append("<tr>"+id+name+area+achivement+totalAch+userTel);
            }
            
        }
        	
        );
        
        $("#test1").click(function(){
            
         }); 
        
        /* $.ajax({
                    async:false,
                    type:"POST",
                    url:"testAjax",
                    data:JSON.stringify(student),
                    dataType:"json",
                    success:function(data){
                        if(data.result=='true'){
                            alert('修改成功');
                        }
                        else{
                            alert('修改失败');
                        }
                    },
                    error:function(data){  
                        alert('异常');
                    }
                        
                }); */
                function abc(url){
                    request(null,"GET",url);
                }
                function request(object,method,methodURL){ 
                    $.ajax({
                        cache: true,
                        type: method,
                        datatype:"json",
                        contentType: "application/json",
                        url:methodURL,
                        data:JSON.stringify(object),
                        error: function(XMLHttpRequest, textStatus, errorThrown) {
                                alert(XMLHttpRequest.status+"\r\n"+XMLHttpRequest.readyState+"\r\n"+textStatus);
                    },
                    success: function(data,textStatus){
                        console.log(data);
                    }
                    })
                }
        </script>
    </body>

</html>