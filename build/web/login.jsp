<%-- 
    Document   : login
    Created on : Oct 26, 2017, 1:04:55 PM
    Author     : user
--%>




<%@page import="java.security.MessageDigest"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn</title>
    </head>
    <body>
        
         
        
        <%
            
            
            String userid =  request.getParameter("userid");
             String password = request.getParameter("password");
             String encryptpassword= request.getParameter("password");
       try{
          
       Class.forName("com.mysql.jdbc.Driver");
       Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system","root","");
       MessageDigest alg = MessageDigest.getInstance("MD5");
      Statement stmt = con.createStatement();
       
       String query = "select * from user where userid ='"+userid+"' and password = '"+encryptpassword+"' ";
       
       ResultSet rs = stmt.executeQuery(query);
       
       
       if(rs.next()){
       
       
       
       
            
            
       session.setAttribute("user1",rs.getString("userid"));
            
            response.sendRedirect("SystemAdmin.html");
            
       
             response.sendRedirect("SubWarden.jsp");
       
       
       }else{
       
      out.println("Invalid LogIn");
       }
       
       
     
       }catch(Exception e){
       
            out.println(e.getMessage());

       
       
       
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        %>
        
        
        
        
        
        
        
        
        
    </body>
</html>
