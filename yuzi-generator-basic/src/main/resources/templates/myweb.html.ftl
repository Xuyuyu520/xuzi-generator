<!DOCTYPE html>
<html>
<head>
    <title>鱼皮官网</title>
</head>
<body>
<h1>欢迎来到鱼皮官网</h1>
<ul>
    <#-- 循环渲染导航条 -->
    <#list menuItems as item>
        <li><a href="${item.url}">${item.label}</a></li>
    </#list>
</ul>
<footer>
    ${currentYear} 鱼皮官网. 版权所有.
</footer>
</body>
</html>

