<%-- 
    Document   : Inventory
    Created on : Nov 2, 2017, 12:51:20 AM
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
        <title>AddInventory</title>
    </head>
    <body>
           <%
            String inventoryid = request.getParameter("inventoryid");
            String type = request.getParameter("type");
            String desc = request.getParameter("desc");
            String userid = request.getParameter("userid");
            String roomno = request.getParameter("roomno");
            String date = request.getParameter("date");
            
            

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");

                Statement stmt = con.createStatement();
                
                response.sendRedirect("Inventory Add Forms.html");
                
               
                
                String query = "INSERT INTO inventory(invid,type,description,userid,roomno,date)"
                        + "values('" + inventoryid+ "','" +type+ "','"+desc+"','"+userid+"','"+roomno+"','"+date+"')";

                int rs = stmt.executeUpdate(query);

            } catch (Exception e) {

                out.println(e.getMessage());
                
            }


        %>
    </body>
</html>

