<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/11/19
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.util.regex.Pattern" %>
<%@ page import="java.util.regex.Matcher" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="/judge">
    <p>
        <label>用户名：
            <input type="text" name="User" id="textfield" />
        </label>
    </p>
    <p>
        <label>密码：
            <input type="password" name="Password" id="textfield2" />
        </label>
    </p>
    <p>
        <label>重复密码：
            <input type="password" name="RePassword" id="textfield3" />
        </label>
    </p>
    <p>
        <label>身份证号：
            <input type="text" name="id" id="textfield4" />
        </label>
    </p>
    <p>
        <label>
            <input type="submit" name="button" id="button" value="提交" />
        </label>
        <label>
            <input type="reset" name="button2" id="button2" value="重置" />
        </label>
    </p>
</form>
<%
    class userBean {
        String name = request.getParameter("name");
        String password =request.getParameter("password");
        String repassword=request.getParameter("repassword");
        String id=request.getParameter("id");
        public boolean isNameValid() {
            char cArr[] = name.toCharArray();
            int firstChar = (int) cArr[0];
            if ((firstChar >= 65 && firstChar <= 90) || (firstChar >= 97 && firstChar <= 122)) {
                for (int i = 1; i < cArr.length; i++) {
                    int ascii = cArr[i];
                    if (!((ascii >= 48 && ascii <= 57) || (ascii >= 65 && ascii <= 90) ||
                            (ascii >= 97 && ascii <= 122) || (ascii == 95))) {
                        return false;
                    }
                }
                return true;
            }
            else {
                return false;
            }
        }
        public boolean isPwdValid(){
            Pattern Password_Pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(.{8,20})$");
            Matcher matcher = Password_Pattern.matcher(password);
            if (matcher.matches()) {
                if (repassword.equals(password)){
                    return true;
                }
            }
            return false;
        }
        public boolean isIdValid(){
            String regularExpression = "(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|" +
                    "(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";
            boolean matches = id.matches(regularExpression);
            //判断第18位校验值
            if (matches) {
                if (id.length() == 18) {
                        char[] charArray = id.toCharArray();
                        //前十七位加权因子
                        int[] idCardWi = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
                        //这是除以11后，可能产生的11位余数对应的验证码
                        String[] idCardY = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
                        int sum = 0;
                        for (int i = 0; i < idCardWi.length; i++) {
                            int current = Integer.parseInt(String.valueOf(charArray[i]));
                            int count = current * idCardWi[i];
                            sum += count;
                        }
                        char idCardLast = charArray[17];
                        int idCardMod = sum % 11;
                        if (idCardY[idCardMod].toUpperCase().equals(String.valueOf(idCardLast).toUpperCase())) {
                            return true;
                        } else {
                            return false;
                        }
                }
            }
            return matches;
        }
    }
%>
</body>
</html>