<%-- 
    Document   : AddUser
    Created on : Nov 1, 2017, 1:06:04 PM
    Author     : user
--%>
<%@page import="java.security.MessageDigest"%>
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
            String userid = request.getParameter("userid");
            String fname = request.getParameter("firstname");
            String lname = request.getParameter("lastname");
            String gender = request.getParameter("gender");
            String password = request.getParameter("password");
            String roleid = request.getParameter("roleid");
            String designation = request.getParameter("designation");
            String landno = request.getParameter("landno");
            String mobileno = request.getParameter("mobileno");
            String email = request.getParameter("email");
            String message = (String) request.getAttribute("alertMsg");
            

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();

            
            for (int i = 0; i < digest.length; i++) {
                ;
            }
            

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");
                MessageDigest alg = MessageDigest.getInstance("MD5");
                Statement stmt = con.createStatement();

                response.sendRedirect("User Add Form.html");

                String query = "INSERT INTO user(userid,fname,lname,gender,password,roleid,designation,landno,mobileno,email)"
                        + "values('" + userid + "','" + fname + "','" + lname + "','" + gender + "','" + password + "','" + roleid + "','" + designation + "','" + landno + "','" + mobileno + "','" + email + "')";

                int rs = stmt.executeUpdate(query);

            } catch (Exception e) {

                out.println(e.getMessage());

            }


        %>
    </body>
</html>
