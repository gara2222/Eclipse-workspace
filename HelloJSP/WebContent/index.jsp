<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST</title>
</head>
<body>
<!-- JSPはHTML, Javaも扱える -->
<p>こんにちは！</p>

<%//Javaを使用するとき<%//>を使用する%>
<% out.println(new java.util.Date()); %>


<%!
static int add(int a, int b){
	return a+b;}
%>

<p>1+2=<%=add(1,2) %></p>
<p>5+2=<%=add(3,4) %></p>

<%! static int countA=0; %>
<%
int countB=0;
countA++;
countB++;
%>
<p>countA = <%=countA %></p>
<p>countB = <%=countB %></p>

<p><%out.println(Math.random()); %></p>
<p><%=Math.random() %></p>

<p>お名前を入力してください</p>
<form method="post" action="greeting-out.jsp">
<input type="text" name="user">
<input type="submit" value="確定">
</form>

</body>
</html>