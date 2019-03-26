<%-- 
    Document   : sub
    Created on : Nov 14, 2017, 10:31:02 PM
    Author     : user
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Subwarden</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<div class="row">
	<div class="col-sm-16">
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Hostel Managment System | Uva Wellassa University Sri Lanka </a>
    </div>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="AllHomePage.html"><span class="glyphicon glyphicon-home"></span> Home</a></li>
        <li><a href="SubWarden.html"><span class="glyphicon glyphicon-user"></span> My Profile</a></li>
      <li><a href="LoginHomePage.html"><span class="glyphicon glyphicon-log-out"></span> Logout  </a></li>
    </ul>
  </div>
</nav>
  	</div>
  <div class="col-sm-3">
  <ul class="nav nav-pills nav-stacked">
 
  <li><a href="Student Add Forms.html"><span class="glyphicon glyphicon-user"></span> Add/Edit/Delete Student Details</a></li>
  <li><a href="Hostel Add Forms.html"><span class="glyphicon glyphicon-tag	"></span> Add Hostel</a></li>
  <li><a href="Inventory Add Forms.html"><span class="glyphicon glyphicon-info-sign"></span> Change Inventory Details</a></li>
</ul>
  </div>
  <div class="col-sm-3">
  <div class="container">
      <div class="jumbotron col-sm-10" style="background-image: url( pics/3.jpg); color: #ffffff;">
    <h1>Welcome | Subwarden Profile</h1> 
    
  </div>
                   
      
  <%
                          
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");
                                Statement stmt = con.createStatement();

                                ResultSet rs = stmt.executeQuery("select * from student");
                                
                                %>
                       
                                
                                <div class="jubrotron col-sm-10">
                                <table class="table table-striped table-bordered"  cellspacing="0" width="100%" role="grid">
                           <tr>
                            <th width="100">Registration Number</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>NIC No</th>
                            <th>Gender</th>
                            <th>Acedemic Year</th>
                            <th>Room No</th>
                            <th width="150">Registered Date</th>
                            
                            
                            
                            
                           </tr>
                              <% while(rs.next()){   %>  
                                <tr>
                                    <td><%= rs.getString(1)%></td>
                                    <td><%= rs.getString(2)%></td>
                                    <td><%= rs.getString(3)%></td>
                                    <td><%= rs.getString(4)%></td>
                                    <td><%= rs.getString(5)%></td>
                                    <td><%= rs.getString(6)%></td>
                                    <td><%= rs.getString(7)%></td>
                                    <td><%= rs.getString(8)%></td>
                                   
                                    

                               </tr>
                                  <%}%>
                        </table> 
                                </div>
</div>
      
  </div>
    
    
    
    
    
    
    <style>
.footer {
    position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    background-color: #333;
    color: white;
    text-align: center;
	
	
	height:60px;
}
</style>

<div class="footer">
  <p></p>
  <p></p>
  <p>Copyright © 2017 - Uva Wellassa University</p>
</div>

</div>
<body>
</body>
</html>
