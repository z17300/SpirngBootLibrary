<html>
<head>
    <title></title>
    <script type='text/javascript' src='/dwr/engine.js'></script>
    <script type='text/javascript' src='/dwr/interface/LoginDwr.js'></script>

    <script>
        function test() {
             var tt=document.stuform.demo1.value;
            LoginDwr.sendValidationCode(tt,function (str) {
                alert(str);
            });
        }
    </script>
</head>



<body>
    <form name="stuform">
    <input type="button" value="登入测试" onclick="test()">
    <input type="text" id="demo1" name="demo1">

    </form>
</body>
</html>