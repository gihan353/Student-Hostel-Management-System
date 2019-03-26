<%-- 
    Document   : studentaddform
    Created on : Oct 27, 2017, 1:03:15 PM
    Author     : user
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student</title>
    </head>
    <body>
        <%
            String regno = request.getParameter("regno");
            String fname = request.getParameter("firstname");
            String lname = request.getParameter("lastname");
            String nicno = request.getParameter("nicno");
            String gender = request.getParameter("gender");
            String acedemicyear = request.getParameter("acedemicyear");
            String username= request.getParameter("username");
            String roomno = request.getParameter("roomno");
            String date = request.getParameter("date");
            

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");

                Statement stmt = con.createStatement();
                out.print("The Data Have Successfull enter to the DataBase");
                
                String query = "INSERT INTO student(regno,fname,lname,nicno,gender,acedemicyear,roomno,date)"
                        + "values('" + regno + "','" + fname + "','"+lname+"','"+nicno+"','"+gender+"','"+acedemicyear+"','"+roomno+"','"+date+"')";

                int rs = stmt.executeUpdate(query);

            } catch (Exception e) {

                out.println(e.getMessage());
            }


        %>




    </body>
</html>
