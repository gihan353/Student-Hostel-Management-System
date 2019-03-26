<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Untitled Document</title>
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
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> My Profile</a></li>
      <li><a href="AllHomePage.html"><span class="glyphicon glyphicon-log-out"></span> Logout  </a></li>
    </ul>
  </div>
</nav>
  	</div>
  <div class="col-sm-3">
  <ul class="nav nav-pills nav-stacked">
  <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> Home</a></li>
  <li><a href="Student Add Forms.html"><span class="glyphicon glyphicon-user"></span> Add Student</a></li>
  <li><a href="Student Add Forms.html"><span class="glyphicon glyphicon-edit"></span> Edit Student Details</a></li>
  <li><a href="Student Add Forms.html"><span class="glyphicon glyphicon-trash"></span> Delete Student Details</a></li>
  <li><a href="Hostel Add Forms.html"><span class="glyphicon glyphicon-tag	"></span> Add Hostel</a></li>
  <li><a href="Inventory Add Forms.html"><span class="glyphicon glyphicon-info-sign"></span> Change Inventory Details</a></li>
</ul>
  </div>
  <div class="col-sm-3">
  <div class="container">
      <div class="jumbotron col-sm-10" style="background-image: url( pics/3.jpg); color: #ffffff;">
    <h1>Welcome | Subwarden Profile</h1> 
     
                <p></p> 
                <p></p> 
            </div>

            <table border="1" class="table table-striped text-centered ">
                <thead>
                    <tr class="">
                        <th>Reg.No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>NIC No</th>
                        <th>Gender</th>
                        <th>Address</th>
                        <th>Acedemic Year</th>
                        <th>Room No</th>
                        <th>Date</th>
                        
                       
                       
                    </tr>
                </thead>
                <tbody>


                    <%

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_managment_system", "root", "");

                        Statement stmt = con.createStatement();

                        String query = "select * from student";

                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next()) {

                            out.println(" <tr>");

                            out.println(" <td>" + rs.getString("regno") + "</td>");
                            out.println(" <td>" + rs.getString("firstname") + "</td>");
                            out.println(" <td>" + rs.getString("lastname") + "</td>");
                            out.println(" <td>" + rs.getString("nicno") + "</td>");
                            out.println(" <td>" + rs.getString("gender") + "</td>");
                            out.println(" <td>" + rs.getString("address") + "</td>");
                            out.println(" <td>" + rs.getString("acedemicyear") + "</td>");
                            out.println(" <td>" + rs.getString("roomno") + "</td>");
                            out.println(" <td>" + rs.getString("date") + "</td>");
                            
                           
                            out.println(" </tr>");
                        }

                    %>      



                </tbody>
            </table>

        </div>

    </div>
    <body>
    </body>
</html>
