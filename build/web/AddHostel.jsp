<%-- 
    Document   : AddHostel
    Created on : Nov 1, 2017, 11:59:02 PM
    Author     : user
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddUser</title>
    </head>
    <body>
           <%
            String hostelid = request.getParameter("hostelid");
            String hostelname = request.getParameter("hostelname");
            String addline1 = request.getParameter("addline1");
            String addline2 = request.getParameter("addline2");
            String addline3 = request.getParameter("addline3");
            String userid = request.getParameter("userid");
            String date = request.getParameter("date");
            

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");
                 response.sendRedirect("Hostel Add Forms.html");
                Statement stmt = con.createStatement();
                
                
                
               
                
                String query = "INSERT INTO hostel(hostelid,hostelname,addline1,addline2,addline3,userid,date)"
                        + "values('" + hostelid+ "','" +hostelname+ "','"+addline1+"','"+addline2+"','"+addline3+"','"+userid+"','"+date+"')";

                int rs = stmt.executeUpdate(query);

            } catch (Exception e) {

                out.println(e.getMessage());
                
            }


        %>
    </body>
</html>
