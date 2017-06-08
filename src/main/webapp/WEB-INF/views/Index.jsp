<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="resource/js/jquery-3.2.0.js" ></script>
        <script type="text/javascript" src="resource/js/bootstrap.js" ></script>
        <script type="text/javascript" src="resource/js/jquery.cookie.js" ></script>
        <script type="text/javascript" src="resource/js/jquery.validate.js" ></script>
        <script type="text/javascript" src="resource/js/additional-methods.js" ></script>
        <script type="text/javascript" src="resource/js/jquery.form.js" ></script>
        <script type="text/javascript" src="resource/js/jquery.session.js" ></script>
        <link rel="stylesheet" type="text/css" href="resource/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="resource/css/bootstrap-theme.css"/>
        <link rel="stylesheet" type="text/css" href="resource/css/local.css"/>
    </head>
    <script type="text/javascript">
    var canflush=true;
    var serversafecodeimg;
    function reloadcode() {
        canflush=true;
        var verify = document.getElementById('safecodeimg');  
        verify.setAttribute('src', 'makeCerPic?math=' + Math.random());
    }
    function updateServerCode(data,textStatus){
        serversafecodeimg = data;
        canflush = false;
    }
    $.validator.addMethod("checksafecode",function(value,element){
        if(canflush==true){
            getSafeCode();
        }
        console.log("In check safecode serversafecodeimg = " + serversafecodeimg);
        if(value==serversafecodeimg)
        {
            return true;
        }else {
            return false;
        }
    },"验证码不正确");
    $().ready(function() {
        document.getElementById("safecodeimg").onload = getSafeCode;
        reloadcode();
        $(function() {
            var validate = $("#loginform").validate({
                    onfocusout: function (element) {
                    $(element).valid();
                },
                errorPlacement: function(error, element) {
                            $(error).toggleClass("alert alert-danger errormessage");
                            element.parent().after(error);
                            },
                debug: true,
                submitHandler: function(form) {
                    var user = new formInfo($("#username").val(),$("#password").val(),$("#autoLogin").prop("checked"));
                    post(user,"Login/LoginCheck","POST");
                    alert("submiting");
                },
                errorElement:'div',
                rules: {
                    username: {
                        required:true,
                        rangelength:[4,20]
                    },
                    password: {
                        required:true,
                        rangelength:[6,20]
                    },
                    safecode: {
                        required:true,
                        checksafecode:true
                    }
                },
                messages: {
                    username: {
                        required: "请输入用户名",
                        rangelength: $.validator.format("用户名不能短于{0}个字符")
                    },
                    password: {
                        required: "请输入密码",
                        rangelength: $.validator.format("密码必须在{0}-{1}个字符")
                    },
                    safecode: {
                        required: "请输入验证码"
                    }
                }
            });
        })
    });
    function formInfo(username,password,autoLogin) {
        var o = {};
        o.username = username;
        o.password = password;
        o.autoLogin = autoLogin;
        return o;
    }
    function getSafeCode(){
        $.ajax({
                cache:true,
                type:"GET",
                datatype:"text",
                contentType: "text/html",
                url:"Login/getsafecode",
                data:null,
                error: function(XMLHttpRequest,textStatus,errorThrown) {
                    alert(alert(XMLHttpRequest.status+"\r\n"+XMLHttpRequest.readyState+"\r\n"+textStatus))
                },
                success: function(data,textStatus) {
                    serversafecodeimg=data;
                    canflush=false;
                }
            });
    }
    function post(user,methodURL,method) {
        $.ajax({
            cache:true,
            type:method,
            datatype:"json",
            contentType: "application/json",
            url:methodURL,
            data:JSON.stringify(user),
            error: function(XMLHttpRequest,textStatus,errorThrown) {
                alert(alert(XMLHttpRequest.status+"\r\n"+XMLHttpRequest.readyState+"\r\n"+textStatus))
            },
            success: function(data,textStatus) {
                console.log(data);
                console.log(textStatus);
                if(data==1){
                	window.location.href="main";
                }
                else{
                	window.location.href="Index";
                };
            }
        });
    }
 
</script>
    <style type="text/css">
        .inner-bg{
            padding: 100px 0 0 0;
        }
        .bk{
            width: 100%;
            height: 100%;
            background-image: url(resource/img/background.jpg);
            background-repeat: no-repeat;
            background-size:100% 100%;
            position: absolute;
            opacity: 0.6;
        }
        .top-content .text{
            color:#000;
            font-family:"微软雅黑";
        }
        .top-content .discription p{
            font-family: "微软雅黑";
            opacity: 0.8;
            font-size: 15px;
            padding-top:20px ;
        }
        .form-box{
            margin-top: 35px;
        }
        .form-top{
            padding: 15px 25px 15px 25px;
            background-image: -webkit-linear-gradient(top, rgba(255, 255, 255, 0.1) 0%, rgba(255, 255, 255, 0.7) 100%);
            -moz-border-radius: 15px 15px 0 0;
            -webkit-border-radius: 15px 15px 0 0;
            border-radius: 15px 15px 0 0;
            text-align: center;
            line-height: 30px;
            font-family: "微软雅黑";
        }
        .form-bottom{
            padding: 5px 25px 15px 25px;
            background-image: -webkit-linear-gradient(top, rgba(255, 255, 255, 0.8) 70%, rgba(255, 255, 255, 0.1) 100%);
            -moz-border-radius:0 0 15px 15px ;
            -webkit-border-radius:0 0 15px 15px ;
            border-radius: 0 0 15px 15px ;
            text-align: center;
            line-height: 30px;
            font-family: "微软雅黑";
        }
        .password-holder{
            padding: 6px 18px 6px 20px;
        }
        .submit-holder{
            margin-top: 10px;
        }
        .linewidthholder{
            margin: 10px 0 10px 0;
        }
        .footfont{
            height: 30px;
            line-height: 30px;
            background-image: -webkit-linear-gradient(top, rgba(0, 0, 0, 0.1) 0%, rgba(255, 255, 255, 0.6) 100%);
            font-family: "微软雅黑";
            color:#009999;
            text-align: center;
            letter-spacing: 1px;
            font-size: 15px;
        }
        .errormessage{
            height: 32px;padding-top: 0px;padding-bottom: 0px;margin-bottom: 0px;
        }
    </style>
    <body>
        <div class="bk"></div>
        <div class="top-content">
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text-center text">
                            <h1>房屋中介管理系统</h1>
                            <div class="discription">
                                <p>房屋中介管理系统，信息的交流平台</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4 col-sm-offset-4">
                            <div class="form-top">
                                <h3>登录</h3>
                                <p>输入用户名与密码登录</p>
                            </div>
                            <div class="form-bottom">
                                <form id="loginform">
                                    <div class="input-group linewidthholder">
                                        <span class="input-group-addon">用户名</span>
                                        <input type="text" class="form-control" placeholder="username" name="username" id="username"/>
                                    </div>
                                    <div class="input-group linewidthholder">
                                        <span class="input-group-addon password-holder">密码</span>
                                        <input type="password" class="form-control" placeholder="password" name="password" id="password"/>
                                    </div>
                                    <div class="input-group linewidthholder">
                                        <span class="input-group-addon">验证码</span>
                                        <input type="text" class="form-control" name="safecode"/>
                                        <span class="input-group-addon" style="margin: 0;padding: 0;width: 68px;height: 34.333334px;">
                                            <img src="" onclick="reloadcode()" id="safecodeimg" style="cursor: pointer;width: 67px;height: 32px;"/>
                                        </span>
                                    </div>
                                    <div class="input-group linewidthholder" >
                                        <input type="checkbox" name="autoLogin" id="autoLogin"/>下次自动登录<br />
                                    </div>
                                    <button type="submit" onclick="javascript:void(0);" class="btn btn-info btn-lg btn-block submit-holder">登录</button>
                                </form>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer class="footer navbar-fixed-bottom footfont">CopyRight 2017 xxx xxx xxx <span class="glyphicon-envelope"></span>Contect us :123456789@QQ.com</footer>
     </body>
</html>