<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../resource/css/jquery-ui-1.10.0.custom.css" />
        <link rel="stylesheet" href="../resource/css/bootstrap.css" />
        <link rel="stylesheet" href="../resource/css/style.css" />
        <script type="text/javascript" src="../resource/js/jquery-3.2.0.js"></script>
        <script type="text/javascript" src="../resource/js/jquery-ui-1.9.2.custom.min.js"></script>
        <script type="text/javascript" src="../resource/js/bootstrap.js"></script>
        <title>查看公告</title>
        <script>
            
        </script>
    </head>
    <style>
        body {
            padding-top: 0px;
        }
    </style>

    <body>

        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/HouseIntermediarySystem/Achivement">蔡氏集团</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <div class="navbar-right" id="welcome" style="line-height: 50px;color: white;"><span style="color:white;"><%session.getAttribute("username"); %>,你好</span>&nbsp;</div>
                    <script type="text/javascript" src="resource/js/main.js"></script>
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
                        <li><a href="/HouseIntermediarySystem/Achivement/blacklist">黑名单</a></li>
                        <li><a href="#">退出</a></li>
                    </ul>
                </div>
            </div>
            
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <div class="col-sm-offset-2"><span style="float:left;font-size:14px;padding-top:60px;margin-left:-150px;">当前位置：<a href="">首页</a>><a href="#">查看公告</a></span></div>
                <div id="notice">
                    <ul style="list-style-type: none;">
                        <li>
                            1:&nbsp;&nbsp;<button type="button" class="btn btn-success" title="2017/5/31" data-container="body" data-toggle="popover" data-placement="right" data-content=" 由于公司发展需要厂房搬迁，我公司于XXXX年X月底搬迁至怡景路XXXX号XXXXXXXXXXXXX。目前搬迁工作已结束在此，感谢新老员们的搬迁期间对我公司的支持。我公司也将走入正轨！借此机会同时对我司的新老员工期间工作安排如下 今晚 8点   聚餐 特此通知！">《最新通知：关于公司近来……》</button>
                        </li>
                        <li>
                            2:&nbsp;&nbsp;<button type="button" class="btn btn-success" title="2017/5/31" data-container="body" data-toggle="popover" data-placement="right" data-content="xxxx">《2017年5月员工奖励与惩罚通知》</button>
                        </li>
                        <li>
                            3:&nbsp;&nbsp;<button type="button" class="btn btn-success" title="2017/5/31" data-container="body" data-toggle="popover" data-placement="right" data-content="xxxx">公告3</button>
                        </li>
                        <li>
                            4:&nbsp;&nbsp;<button type="button" class="btn btn-success" title="2017/5/31" data-container="body" data-toggle="popover" data-placement="right" data-content="xxxx">公告4</button>
                        </li>
                    </ul>
                </div>
                </div>
                <script>
                    $(function(){
                        $("[data-toggle='popover']").popover();
                    });
                </script>
                
               <!-- 翻页组件-->
                <div id="pages">
                    <nav aria-label="Page navigation" style="margin-top:-500px">
                        <ul class="pagination">
                            <li>
                                <a href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li>
                                <a href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
    </body>

</html>