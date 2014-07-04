<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>IDENTITY MANAGEMENT ACCESS CONTROL</title>
</head>
<body>
 
<h2>User Maintenance</h2>
 
<form:form method="post" action="add" commandName="user">
 
    <table>
        <tr>
        <td><form:label path="loginname"><spring:message code="label.loginname"/></form:label></td>
        <td><form:input path="loginname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>
    <tr>
        <td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
        <td><form:input path="firstname" /></td>
    </tr>
   
  
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
      
<h3>Exsisting Users</h3>
<c:if  test="${!empty userList}">
<table border="1" class="data">

<tr>
    <th>LoginName</th>
    <th>LastName</th>
    <th>FirstName</th>
    <th>Active</th>
    <th>Division</th>	
    <th>Created Date</th>
    <th> Edit </th>
    <th> Delete </th>
</tr>
<c:forEach items="${userList}" var="usr">
    <tr>
        <td>${usr.loginname}</td>
        <td>${usr.lastname}</td>
        <td>${usr.firstname}</td>
        <td>${usr.active}</td>
        <td>${usr.division}</td>
        <td>${usr.date}</td>
        <td><a href="delete/${usr.id}">Edit</a></td>
        <td><a href="delete/${usr.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>