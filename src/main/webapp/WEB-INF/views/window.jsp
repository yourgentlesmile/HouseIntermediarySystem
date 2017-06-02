<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resource/css/bootstrap.css" />
<script type="text/javascript" src="resource/js/jquery-3.2.0.js"></script>
<script type="text/javascript" src="resource/js/bootstrap.js"></script>
<script type="text/javascript" src="zDrag.js"></script>
<script type="text/javascript" src="zDialog.js"></script>
<title>新增信息</title>
<style>
body { background: #ffffff; color: #444;font-size:12px; }
a { color: #07c; text-decoration: none; border: 0; background-color: transparent; }
body, div, q, iframe, form, h5 { margin: 0; padding: 0; }
img, fieldset { border: none 0; }
body, td, textarea { word-break: break-all; word-wrap: break-word; line-height:1.6; }
body, input, textarea, select, button { margin: 0; font-size: 12px; font-family: Tahoma, SimSun, sans-serif; }
div, p, table, th, td { font-size:1em; font-family:inherit; line-height:inherit; }
h5 { font-size:12px; } 
ol li,ul li{ margin-bottom:0.5em;}
pre, code { font-family: "Courier New", Courier, monospace; word-wrap:break-word; line-height:1.4; font-size:12px;}
pre{background:#f6f6f6; border:#eee solid 1px; margin:1em 0.5em; padding:0.5em 1em;}
#content { padding-left:50px; padding-right:50px; }
#content h2 { font-size:20px; color:#069; padding-top:8px; margin-bottom:8px; }
#content h3 { margin:8px 0; font-size:14px; COLOR:#693; }
#content h4 { margin:8px 0; font-size:16px; COLOR:#690; }
#content div.item { margin-top:10px; margin-bottom:10px; border:#eee solid 4px; padding:10px; }
hr { clear:both; margin:7px 0; +margin: 0;
border:0 none; font-size: 1px; line-height:1px; color: #069; background-color:#069; height: 1px; }
.infobar { background:#fff9e3; border:1px solid #fadc80; color:#743e04; }
.buttonStyle{width:64px;height:22px;line-height:22px;color:#369;text-align:center;background:url(images/buticon.gif) no-repeat left top;border:0;font-size:12px;}
.buttonStyle:hover{background:url(images/buticon.gif) no-repeat left -23px;}

</style>
</head>
<body>
	<div id="forlogin">
      <table width="100%" border="0" align="center" cellpadding="4" cellspacing="4" bordercolor="#666666">
        <tr>
          <td colspan="2" bgcolor="#eeeeee">这儿是弹出窗口中的表单</td>
        </tr>
        <tr>
          <td width="150" align="right">你的QQ：</td>
          <td><input type="text" id="qq" /></td>
        </tr>
        <tr>
          <td width="150" align="right">你的E-mail：</td>
          <td><input type="text" id="mail" /></td>
        </tr>
        <tr>
          <td align="right">你从哪儿获知本程序的？</td>
          <td><input type="text" id="track"  /></td>
        </tr>
        <tr>
          <td colspan="2" align="left" style="padding-left:160px;"><input type="button" onClick="fun3()" value="确定" class="buttonStyle" /> <input onClick="fun2()" class="buttonStyle" type="button" value="取消" /></td>
        </tr>
      </table>
</div>
</body>
<script>
function fun2()
{
	parentDialog.close();
}
</script>
</html>