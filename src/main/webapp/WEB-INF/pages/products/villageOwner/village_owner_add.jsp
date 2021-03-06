<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link href="<%=basePath%>/css/pages/style_v2.2.css" type="text/css" rel="stylesheet">
    <script src="<%=basePath%>js/jquery-1.11.1.min.js" type="text/javascript"></script>
    <script src="<%=basePath%>/js/pages/parkingViewV2.js" type="text/javascript"></script>
    <%--<script src="<%=basePath%>/js/CheckForm.js" type="text/javascript"></script>--%>
</head>
<body>
<form method="post" action="<%=basePath%>products/villageowner/save.html">
    <div class="editView">
        <div class="titleView">请填写小区业主信息</div>
        <table class="editTable" cellpadding="0" cellspacing="0" border="0">
            <tr>
                <td><span class="star">＊</span>小区名称：</td>
                <td>
                    <input required type="text" name="parkingName" value="${param.parkingName}" onclick="pv.show($('#parkingId'), $(this), false);"/>
                    <input type="hidden" id="parkingId" name="parkingId" value="${param.parkingId}"/>
                </td>
                <td>业主姓名：</td>
                <td><input type="text" name="name" value="${param.name}"/></td>
            </tr>
            <tr>
                <td><span class="star">＊</span>手机号：</td>
                <td><input required pattern="[0-9]{11}" title="手机号必须是11位数字" type="text" name="mobile" value="${param.mobile}"/></td>
                <td></td>
                <td></td>
            </tr>
        </table>
        <div class="footView">
            <input class="greenBtn" type="submit" value="确&nbsp;定">
            <input class="greenBtn" type="button" value="返&nbsp;回" onclick="location='<%=basePath%>products/villageowner/list.html'">
        </div>
    </div>
</form>
<script type="text/javascript">
    var info = '${requestScope.info}';
    if (info.length > 0) alert(info);
</script>
</body>
</html>
