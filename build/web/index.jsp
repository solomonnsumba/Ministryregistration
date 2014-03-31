<%-- 
    Document   : index
    Created on : Mar 24, 2014, 12:10:50 PM
    Author     : mushabe
--%>


<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<link href="style.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	background-color: #CCCCCC;
}
.style1 {color: #FF33FF}
.style2{text-align:inherit}
.style3{table-layout:auto ;background-color:#6633CC}
.style4 {
	font-family: "Times New Roman", Times, serif;
	font-weight: bold;
	size:portrait;
}
-->
</style>

</head>

<body>

    
<div id="container">
    <div class="style4" id="header"  style="background-color:#CC66FF;text-align:justify;text-shadow:#FF9900"></div>
        Battery Force Uganda        
    
            </div>
    

<div id="leftnav"><span class="cc"></span>
                <div><a href="?action=homepage">HOME</a></div>
                <div><a href="?action=addsales">BATTERY SALES</a></div>
                <div><a href="?action=addcontainer">ADD CONTAINER</a></div>
                 <div><a href="?action=view_sales">VIEW ALL SALES</a></div>
                 <div><a href="?action=view_boxAvaliable">VIEW CONTAINERS</a></div>
                 <div><a href="?action=view_expenses">VIEW EXPENSES</a></div>
                 <div><a href="?action=view_netprofit">VIEW NET PROFIT</a></div>
                 <div><a href="?action=view_bat_remaining">BAT. REMAINING</a></div>
                 

         
            </div>




<div id="rightnav"></div>
<div id="body" align="centre"> 

                  <%
                try{
                  String s= request.getParameter("action");
           
                  if(s.equals("addsales")){
                        %>

                         <div align="center">
                     <div align="center">
  <table bgcolor="#cccccc" border="0"  width="667">
    <tbody>
      <td colspan="3" bgcolor="#0099cc"><div class="style2" align="center">Teacher Registration Step 1 of 3 </div></td>
    </tr>
    
    <tr>
     <br />
</td>
      <td>Choose Your Username </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><input name="textfield4" value="Username" type="text" /></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Create a Password </td>
      <td>Confirm Password </td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><input name="textfield52" value="Password" type="password" /></td>
      <td><input name="textfield5" value="password" type="password" /></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Date Of Birth </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><form id="form4" name="form4" method="post" action="">
        <label />
        <label>Month
        <select name="select" size="1">
          <option selected="selected">January</option>
          <option>February</option>
          <option>March</option>
          <option>April</option>
          <option>May</option>
          <option>June</option>
          <option>July</option>
          <option>August</option>
          <option>September</option>
          <option>October</option>
          <option>November</option>
          <option>December</option>
          
            </select>
        </label>
      </form>      </td>
      <td><label>Year
          <select name="select2" size="1">
            <option>2014</option>
            <option>2013</option>
            <option>2012</option>
            <option>2011</option>
            <option>2010</option>
            <option>2009</option>
            <option>2008</option>
            <option>2007</option>
            <option>2006</option>
            <option>2005</option>
            <option>2004</option>
            <option>2003</option>
            <option>2002</option>
            <option>2001</option>
            <option>2000</option>
            <option>1999</option>
            <option>1998</option>
            <option>1997</option>
            <option>1996</option>
          </select>
      </label></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Gender</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><label>
        <select name="select3" size="1">
          <option>MALE</option>
          <option>FEMALE</option>
                        </select>
      </label></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Mobile Number </td>
      <td>Location</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><input name="textfield3" type="text" /></td>
      <td><select name="select4" size="1">
        <option>Gayaza</option>
        <option>Mengo</option>
        <option>Rubaga</option>
        <option>Seeta</option>
        <option>Mukono</option>
        <option>Kawempe</option>
        <option>Ggaba</option>
        <option>Bukasa</option>
        <option>Ntinda</option>
                  </select></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>Your Current Email Address </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><input name="textfield32" type="text" /></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><form id="form6" name="form6" method="post" action="">
      </form><br />
</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><div align="center" /><br />
</td>
      <td><div align="center">
        <input name="Submit2" value="Cancel" type="submit" />
      </div></td>
      <td><div align="center">
        <input name="Submit" value="Continue" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </tbody></table>
</div>
                  </div>

                  

                        <%
                        }else if(s.equals("homepage")) {

                       
                          %>

                          
                          <div>
                              
                              
                                <div align="center">
  <table style="width: 567px; height: 602px;" bgcolor="#cccccc" border="0">
    <tbody><tr bordercolor="#0066FF">
      <td colspan="3" bgcolor="#0099cc"><div class="style2" align="center">Teacher Registration Step 2 of 3 </div></td>
    </tr>
    
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Marital Status </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><select name="select5" size="1">
        <option>Select .....</option>
            </select></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Number Of Children </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><select name="select6" size="1">
        <option>Select .....</option>
      </select></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Full Name OF Heir </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><input name="textfield22" value=" Full Name " type="text" /></td>
      <td><label>Year Of Birth 
          <select name="select2" size="1">
            <option>2014</option>
            <option>2013</option>
            <option>2012</option>
            <option>2011</option>
            <option>2010</option>
            <option>2009</option>
            <option>2008</option>
            <option>2007</option>
            <option>2006</option>
            <option>2005</option>
            <option>2004</option>
            <option>2003</option>
            <option>2002</option>
            <option>2001</option>
            <option>2000</option>
            <option>1999</option>
            <option>1998</option>
            <option>1997</option>
            <option>1996</option>
          </select>
      </label></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Gender</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><label>
        <select name="select3" size="1">
          <option>MALE</option>
          <option>FEMALE</option>
                        </select>
      </label></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Mobile Number </td>
      <td>Location</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><input name="textfield3" type="text" /></td>
      <td><select name="select4" size="1">
        <option>Gayaza</option>
        <option>Mengo</option>
        <option>Rubaga</option>
        <option>Seeta</option>
        <option>Mukono</option>
        <option>Kawempe</option>
        <option>Ggaba</option>
        <option>Bukasa</option>
        <option>Ntinda</option>
                  </select></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>Their Current Email Address </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><input name="textfield32" type="text" /></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><form id="form6" name="form6" method="post" action="">
      </form><br />
</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><div align="center" /><br />
</td>
      <td><div align="center">
        <input name="Submit2" value="Back" type="submit" />
      </div></td>
      <td><div align="center">
        <input name="Submit" value="Continue" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </tbody></table>
</div>
                          </div>                          
                          


                          <% 
                        }

                        else if(s.equals("view_sales")){

                     //   out.println("viewing reports");
                        %>
                     <%
          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select * from sales") ;
       %>
       <TABLE BORDER="1" style="margin-top:40px" class=".mush" align="center">
      <TR>
      <TH>COST PRICE</TH>
      <TH>SELLING PRICE</TH>
      <TH>DOZEN NUMBER</TH>
      <TH>TOTAL COST</TH>
      <TH>NAME</TH>
      <TH>ADDRESS</TH>
      
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
       <TD> <%= resultset.getString(6) %></TD>
      
      </TR>
      <% } %>
     </TABLE>
                        <%
                        }


                        else if(s.equals("addcontainer")){

                          //  out.println("adding a container");

                            %>

          <div align="center">
              <div align="center">
  <table bgcolor="#cccccc" border="0" height="600" width="667">
    <tbody><tr bordercolor="#0066FF">
      <td colspan="3" bgcolor="#0099cc"><div class="style2" align="center">Teacher Registration Step 3 of 3 </div></td>
    </tr>
    
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Academic Documents </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Primary Leaving Examinations </td>
      <td><div align="center">
        <input name="Submit32" value="Browse" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Uganda Certificate Of Education </td>
      <td><div align="center">
        <input name="Submit322" value="Browse" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Uganda Advanced Certificate Of Eductaion</td>
      <td><label>
        </label><div align="center">
          <input name="Submit323" value="Browse" type="submit" />
          </div>
      </td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><label>Teacher Qualification Testimonial </label></td>
      <td><div align="center">
        <input name="Submit324" value="Browse" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>Other Certificate </td>
      <td><div align="center">
        <input name="Submit325" value="Browse" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><div align="center" /><br />
</td>
      <td><div align="center">
        <input name="Submit2" value="Back" type="submit" />
      </div></td>
      <td><div align="center">
        <input name="Submit" value="Submit" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </tbody></table>
</div></div>

                            <% 
                        } else if(s.equals("view_boxAvaliable")){

                     //   out.println("viewing reports");
                        %>

                   <%
          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select * from container") ;
       %>
       <TABLE style="margin-top:40px" BORDER="" class=".mush" width="80%">
      <TR>
      <TH>COUNTRY</TH>
      <TH>BATTERY Name</TH>
      <TH>MAN</TH>
      <TH>DOZEN NO.</TH>
      <TH>MAN DATE</TH>
      <TH>COST PRICE</TH>
      <TH>PURCHASE DATE</TH>
      <TH>DIMENSION</TH>
      <TH>TAX</TH>
      <TH>HIRE CONTAINER</TH>
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
       <TD> <%= resultset.getString(6) %></TD>
       <TD> <%= resultset.getString(7) %></TD>
       <TD> <%= resultset.getString(8) %></TD>
       <TD> <%= resultset.getString(9) %></TD>
       <TD> <%= resultset.getString(10) %></TD>
      </TR>
      <% } %>
     </TABLE>
                        
                        <%
                        }
                        else if(s.equals("view_expenses")){
                        %>
                        
                        
                        
                   <%
          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select nBatteries,tax,hirecontainer from container") ;
       %>
       <TABLE BORDER="1" style="margin-top:40px" align="center" class=".mush">
      <TR>
      <TH>NAME OF BATTERY</TH>
      <TH>TAX</TH>
      <TH>HIRE CONTAINER</TH>
      
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       
      </TR>
      <% } %>
     </TABLE>
                        
         
                        
                        <%
                        }
                   else if(s.equals("view_netprofit")){
                        
                                   %>
                        
                   <%
          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select( select sum(sellPrice) from sales )- ( select sum(cpBox+tax+hirecontainer) from container )  as NET_PROFIT;") ;
       %>
       <TABLE BORDER="1" style="margin-top:40px" align="center" class=".mush">
      <TR>
      <TH>NET PROFIT FROM  BATTERY SALES</TH>
      
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       
      </TR>
      <% } %>
     </TABLE>
      <%
                        }
                        else if(s.equals("view_bat_remaining")){
                        
                                                     %>
                        
                   <%
          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery(" select( select sum(noDozenB) from container )-( select sum(noOfDozens) from sales )as BAT_REMAINING") ;
       %>
       <TABLE BORDER="1" style="margin-top:40px" align="center" class=".mush">
      <TR>
      <TH>BATTERIES REMAINING</TH>
      
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       
      </TR>
      <% } %>
     </TABLE>
      <% 
                        }


                        else{
                        out.println("welcome");
                        }
               
                }catch(NullPointerException e){

                }            %>
                
                
                  
</div>
<div id="footer">BATTERY FORCE</div>
</div>

</body>

</html>
