<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="pink">
<%
{
	String palindrome=request.getParameter("prove");
	String reverse="";
	int length=palindrome.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+palindrome.charAt(i);
	}
	if(palindrome.equals(reverse))
	{
		out.print("entered string is a palindrome");
	}
	else
	{
		out.print("entered string is not a palindrome");
	}
}
%>
</body>
</html>