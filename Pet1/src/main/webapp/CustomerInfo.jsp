<%--
  Created by IntelliJ IDEA.
  User: Justi
  Date: 3/31/2024
  Time: 1:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.example.pet1.BusinessObjects.Customer" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Dentist Info</title>
</head>
<body>

<% Customer c1;
    c1 = (Customer) session.getAttribute("c1");
    //c1.display();
%>

<h2> Hello <%= c1.getfirstName() + " " + c1.getlastName()%> </h2>

<form id="searchForm" name = "form1" action="CustomerInfo.jsp">
<%--    <label for="acctNo">Customer ID</label>--%>
    <input type="text" id="CustId" name="CustId" value="<%=c1.getcustID()%>" readonly/>
    <br><br>
    <label for="CustId">Customer Id</label>
<%--    <input type="text" id="dpw" name="dentPw" value="<%=d1.getPassword()%>" readonly/>--%>
<%--    <br><br>--%>
<%--    <label for="acctType">First Name (can edit)</label>--%>
<%--    <input type="text" id="dfn" name="dentFn" value="<%=d1.getFirstName()%>" placeholder="Enter First Name"/>--%>
<%--    <br><br>--%>
<%--    <label for="acctBalance">Last Name (can edit)</label>--%>
<%--    <input type="text" id="dln" name="dentLn" value="<%=d1.getLastName()%>" placeholder="Enter Last Name"/>--%>
<%--    <br><br>--%>
<%--    <label for="acctBalance">Email (can edit)</label>--%>
<%--    <input type="text" id="dEmail" name="dentEmail" value="<%=d1.getEmail()%>" placeholder="Enter Email"/>--%>
<%--    <br><br>--%>
<%--    <label for="acctBalance">Office</label>--%>
<%--    <input type="text" id="office" name="Office" value="<%=d1.getOffice()%>" readonly placeholder="Enter Office Number"/>--%>
<%--    <br><br>--%>

    <input type="submit" value ="Edit" onclick="edit()"/>
</form>
<script type="text/javascript">
    function edit() {
        document.form1.action = "UpdateCustomerInfo.jsp";
        form1.submit();
    }

    document.getElementById("submit").addEventListener("click", submit, false);
</script>

<h3> <a href="Index.jsp">    Log out</a></h3>
</body>
</html>