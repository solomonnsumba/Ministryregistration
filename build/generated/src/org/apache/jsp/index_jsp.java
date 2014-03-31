package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tbackground-color: #CCCCCC;\n");
      out.write("}\n");
      out.write(".style1 {color: #FF33FF}\n");
      out.write(".style2{text-align:inherit}\n");
      out.write(".style3{table-layout:auto ;background-color:#6633CC}\n");
      out.write(".style4 {\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tsize:portrait;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<div id=\"container\">\n");
      out.write("    <div class=\"style4\" id=\"header\"  style=\"background-color:#CC66FF;text-align:justify;text-shadow:#FF9900\"></div>\n");
      out.write("        Battery Force Uganda        \n");
      out.write("     <tr>\n");
      out.write("      <td height=\"123\" colspan=\"3\">\n");
      out.write("          <a href=\"#\"><img src=\"cheap%20_files/logo_battery_force.gif\" alt=\"Battery Force\" title=\"Battery Force\"   /></a>\n");
      out.write("          <a href=\"http://www.battery-force.co.uk/\"><img id=\"photo\" src=\"cheap%20_files/photo_best_batteries.gif\" alt=\"Photo Best Batteries\" width=\"390\" />\n");
      out.write("          </a></td>\n");
      out.write("        </tr> \n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<div id=\"leftnav\"><span class=\"cc\"></span>\n");
      out.write("                <div><a href=\"?action=homepage\">HOME</a></div>\n");
      out.write("                <div><a href=\"?action=addsales\">BATTERY SALES</a></div>\n");
      out.write("                <div><a href=\"?action=addcontainer\">ADD CONTAINER</a></div>\n");
      out.write("                 <div><a href=\"?action=view_sales\">VIEW ALL SALES</a></div>\n");
      out.write("                 <div><a href=\"?action=view_boxAvaliable\">VIEW CONTAINERS</a></div>\n");
      out.write("                 <div><a href=\"?action=view_expenses\">VIEW EXPENSES</a></div>\n");
      out.write("                 <div><a href=\"?action=view_netprofit\">VIEW NET PROFIT</a></div>\n");
      out.write("                 <div><a href=\"?action=view_bat_remaining\">BAT. REMAINING</a></div>\n");
      out.write("                 \n");
      out.write("\n");
      out.write("         \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"rightnav\"></div>\n");
      out.write("<div id=\"body\" align=\"centre\"> \n");
      out.write("\n");
      out.write("                  ");

                try{
                  String s= request.getParameter("action");
           
                  if(s.equals("addsales")){
                        
      out.write("\n");
      out.write("\n");
      out.write("                         <div align=\"center\">\n");
      out.write("                     <div align=\"center\">\n");
      out.write("  <table bgcolor=\"#cccccc\" border=\"0\"  width=\"667\">\n");
      out.write("    <tbody><tr bordercolor=\"#0066FF\">\n");
      out.write("      <td colspan=\"3\" bgcolor=\"#0099cc\"><div class=\"style2\" align=\"center\">Teacher Registration Step 1 of 3 </div></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Choose Your Username </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><input name=\"textfield4\" value=\"Username\" type=\"text\" /></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Create a Password </td>\n");
      out.write("      <td>Confirm Password </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><input name=\"textfield52\" value=\"Password\" type=\"password\" /></td>\n");
      out.write("      <td><input name=\"textfield5\" value=\"password\" type=\"password\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Date Of Birth </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><form id=\"form4\" name=\"form4\" method=\"post\" action=\"\">\n");
      out.write("        <label />\n");
      out.write("        <label>Month\n");
      out.write("        <select name=\"select\" size=\"1\">\n");
      out.write("          <option selected=\"selected\">January</option>\n");
      out.write("          <option>February</option>\n");
      out.write("          <option>March</option>\n");
      out.write("          <option>April</option>\n");
      out.write("          <option>May</option>\n");
      out.write("          <option>June</option>\n");
      out.write("          <option>July</option>\n");
      out.write("          <option>August</option>\n");
      out.write("          <option>September</option>\n");
      out.write("          <option>October</option>\n");
      out.write("          <option>November</option>\n");
      out.write("          <option>December</option>\n");
      out.write("          \n");
      out.write("            </select>\n");
      out.write("        </label>\n");
      out.write("      </form>      </td>\n");
      out.write("      <td><label>Year\n");
      out.write("          <select name=\"select2\" size=\"1\">\n");
      out.write("            <option>2014</option>\n");
      out.write("            <option>2013</option>\n");
      out.write("            <option>2012</option>\n");
      out.write("            <option>2011</option>\n");
      out.write("            <option>2010</option>\n");
      out.write("            <option>2009</option>\n");
      out.write("            <option>2008</option>\n");
      out.write("            <option>2007</option>\n");
      out.write("            <option>2006</option>\n");
      out.write("            <option>2005</option>\n");
      out.write("            <option>2004</option>\n");
      out.write("            <option>2003</option>\n");
      out.write("            <option>2002</option>\n");
      out.write("            <option>2001</option>\n");
      out.write("            <option>2000</option>\n");
      out.write("            <option>1999</option>\n");
      out.write("            <option>1998</option>\n");
      out.write("            <option>1997</option>\n");
      out.write("            <option>1996</option>\n");
      out.write("          </select>\n");
      out.write("      </label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Gender</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><label>\n");
      out.write("        <select name=\"select3\" size=\"1\">\n");
      out.write("          <option>MALE</option>\n");
      out.write("          <option>FEMALE</option>\n");
      out.write("                        </select>\n");
      out.write("      </label></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Mobile Number </td>\n");
      out.write("      <td>Location</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><input name=\"textfield3\" type=\"text\" /></td>\n");
      out.write("      <td><select name=\"select4\" size=\"1\">\n");
      out.write("        <option>Gayaza</option>\n");
      out.write("        <option>Mengo</option>\n");
      out.write("        <option>Rubaga</option>\n");
      out.write("        <option>Seeta</option>\n");
      out.write("        <option>Mukono</option>\n");
      out.write("        <option>Kawempe</option>\n");
      out.write("        <option>Ggaba</option>\n");
      out.write("        <option>Bukasa</option>\n");
      out.write("        <option>Ntinda</option>\n");
      out.write("                  </select></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>Your Current Email Address </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><input name=\"textfield32\" type=\"text\" /></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><form id=\"form6\" name=\"form6\" method=\"post\" action=\"\">\n");
      out.write("      </form><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><div align=\"center\" /><br />\n");
      out.write("</td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit2\" value=\"Cancel\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit\" value=\"Continue\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody></table>\n");
      out.write("</div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("\n");
      out.write("                        ");

                        }else if(s.equals("homepage")) {

                       
                          
      out.write("\n");
      out.write("\n");
      out.write("                          \n");
      out.write("                          <div>\n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                                <div align=\"center\">\n");
      out.write("  <table style=\"width: 567px; height: 602px;\" bgcolor=\"#cccccc\" border=\"0\">\n");
      out.write("    <tbody><tr bordercolor=\"#0066FF\">\n");
      out.write("      <td colspan=\"3\" bgcolor=\"#0099cc\"><div class=\"style2\" align=\"center\">Teacher Registration Step 2 of 3 </div></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Marital Status </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><select name=\"select5\" size=\"1\">\n");
      out.write("        <option>Select .....</option>\n");
      out.write("            </select></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Number Of Children </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><select name=\"select6\" size=\"1\">\n");
      out.write("        <option>Select .....</option>\n");
      out.write("      </select></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Full Name OF Heir </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><input name=\"textfield22\" value=\" Full Name \" type=\"text\" /></td>\n");
      out.write("      <td><label>Year Of Birth \n");
      out.write("          <select name=\"select2\" size=\"1\">\n");
      out.write("            <option>2014</option>\n");
      out.write("            <option>2013</option>\n");
      out.write("            <option>2012</option>\n");
      out.write("            <option>2011</option>\n");
      out.write("            <option>2010</option>\n");
      out.write("            <option>2009</option>\n");
      out.write("            <option>2008</option>\n");
      out.write("            <option>2007</option>\n");
      out.write("            <option>2006</option>\n");
      out.write("            <option>2005</option>\n");
      out.write("            <option>2004</option>\n");
      out.write("            <option>2003</option>\n");
      out.write("            <option>2002</option>\n");
      out.write("            <option>2001</option>\n");
      out.write("            <option>2000</option>\n");
      out.write("            <option>1999</option>\n");
      out.write("            <option>1998</option>\n");
      out.write("            <option>1997</option>\n");
      out.write("            <option>1996</option>\n");
      out.write("          </select>\n");
      out.write("      </label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Gender</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><label>\n");
      out.write("        <select name=\"select3\" size=\"1\">\n");
      out.write("          <option>MALE</option>\n");
      out.write("          <option>FEMALE</option>\n");
      out.write("                        </select>\n");
      out.write("      </label></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Mobile Number </td>\n");
      out.write("      <td>Location</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><input name=\"textfield3\" type=\"text\" /></td>\n");
      out.write("      <td><select name=\"select4\" size=\"1\">\n");
      out.write("        <option>Gayaza</option>\n");
      out.write("        <option>Mengo</option>\n");
      out.write("        <option>Rubaga</option>\n");
      out.write("        <option>Seeta</option>\n");
      out.write("        <option>Mukono</option>\n");
      out.write("        <option>Kawempe</option>\n");
      out.write("        <option>Ggaba</option>\n");
      out.write("        <option>Bukasa</option>\n");
      out.write("        <option>Ntinda</option>\n");
      out.write("                  </select></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>Their Current Email Address </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><input name=\"textfield32\" type=\"text\" /></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><form id=\"form6\" name=\"form6\" method=\"post\" action=\"\">\n");
      out.write("      </form><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><div align=\"center\" /><br />\n");
      out.write("</td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit2\" value=\"Back\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit\" value=\"Continue\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody></table>\n");
      out.write("</div>\n");
      out.write("                          </div>                          \n");
      out.write("                          \n");
      out.write("\n");
      out.write("\n");
      out.write("                          ");
 
                        }

                        else if(s.equals("view_sales")){

                     //   out.println("viewing reports");
                        
      out.write("\n");
      out.write("                     ");

          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select * from sales") ;
       
      out.write("\n");
      out.write("       <TABLE BORDER=\"1\" style=\"margin-top:40px\" class=\".mush\" align=\"center\">\n");
      out.write("      <TR>\n");
      out.write("      <TH>COST PRICE</TH>\n");
      out.write("      <TH>SELLING PRICE</TH>\n");
      out.write("      <TH>DOZEN NUMBER</TH>\n");
      out.write("      <TH>TOTAL COST</TH>\n");
      out.write("      <TH>NAME</TH>\n");
      out.write("      <TH>ADDRESS</TH>\n");
      out.write("      \n");
      out.write("      </TR>\n");
      out.write("      ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("      <TR>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(4) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(5) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(6) );
      out.write("</TD>\n");
      out.write("      \n");
      out.write("      </TR>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("     </TABLE>\n");
      out.write("                        ");

                        }


                        else if(s.equals("addcontainer")){

                          //  out.println("adding a container");

                            
      out.write("\n");
      out.write("\n");
      out.write("          <div align=\"center\">\n");
      out.write("              <div align=\"center\">\n");
      out.write("  <table bgcolor=\"#cccccc\" border=\"0\" height=\"600\" width=\"667\">\n");
      out.write("    <tbody><tr bordercolor=\"#0066FF\">\n");
      out.write("      <td colspan=\"3\" bgcolor=\"#0099cc\"><div class=\"style2\" align=\"center\">Teacher Registration Step 3 of 3 </div></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Academic Documents </td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Primary Leaving Examinations </td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit32\" value=\"Browse\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Uganda Certificate Of Education </td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit322\" value=\"Browse\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Uganda Advanced Certificate Of Eductaion</td>\n");
      out.write("      <td><label>\n");
      out.write("        </label><div align=\"center\">\n");
      out.write("          <input name=\"Submit323\" value=\"Browse\" type=\"submit\" />\n");
      out.write("          </div>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><label>Teacher Qualification Testimonial </label></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit324\" value=\"Browse\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>Other Certificate </td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit325\" value=\"Browse\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><div align=\"center\" /><br />\n");
      out.write("</td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit2\" value=\"Back\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit\" value=\"Submit\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody></table>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("                            ");
 
                        } else if(s.equals("view_boxAvaliable")){

                     //   out.println("viewing reports");
                        
      out.write("\n");
      out.write("\n");
      out.write("                   ");

          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select * from container") ;
       
      out.write("\n");
      out.write("       <TABLE style=\"margin-top:40px\" BORDER=\"\" class=\".mush\" width=\"80%\">\n");
      out.write("      <TR>\n");
      out.write("      <TH>COUNTRY</TH>\n");
      out.write("      <TH>BATTERY Name</TH>\n");
      out.write("      <TH>MAN</TH>\n");
      out.write("      <TH>DOZEN NO.</TH>\n");
      out.write("      <TH>MAN DATE</TH>\n");
      out.write("      <TH>COST PRICE</TH>\n");
      out.write("      <TH>PURCHASE DATE</TH>\n");
      out.write("      <TH>DIMENSION</TH>\n");
      out.write("      <TH>TAX</TH>\n");
      out.write("      <TH>HIRE CONTAINER</TH>\n");
      out.write("      </TR>\n");
      out.write("      ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("      <TR>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(4) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(5) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(6) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(7) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(8) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(9) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(10) );
      out.write("</TD>\n");
      out.write("      </TR>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("     </TABLE>\n");
      out.write("                        \n");
      out.write("                        ");

                        }
                        else if(s.equals("view_expenses")){
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                   ");

          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select nBatteries,tax,hirecontainer from container") ;
       
      out.write("\n");
      out.write("       <TABLE BORDER=\"1\" style=\"margin-top:40px\" align=\"center\" class=\".mush\">\n");
      out.write("      <TR>\n");
      out.write("      <TH>NAME OF BATTERY</TH>\n");
      out.write("      <TH>TAX</TH>\n");
      out.write("      <TH>HIRE CONTAINER</TH>\n");
      out.write("      \n");
      out.write("      </TR>\n");
      out.write("      ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("      <TR>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\n");
      out.write("       \n");
      out.write("      </TR>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("     </TABLE>\n");
      out.write("                        \n");
      out.write("         \n");
      out.write("                        \n");
      out.write("                        ");

                        }
                   else if(s.equals("view_netprofit")){
                        
                                   
      out.write("\n");
      out.write("                        \n");
      out.write("                   ");

          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery("select( select sum(sellPrice) from sales )- ( select sum(cpBox+tax+hirecontainer) from container )  as NET_PROFIT;") ;
       
      out.write("\n");
      out.write("       <TABLE BORDER=\"1\" style=\"margin-top:40px\" align=\"center\" class=\".mush\">\n");
      out.write("      <TR>\n");
      out.write("      <TH>NET PROFIT FROM  BATTERY SALES</TH>\n");
      out.write("      \n");
      out.write("      </TR>\n");
      out.write("      ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("      <TR>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("       \n");
      out.write("      </TR>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("     </TABLE>\n");
      out.write("      ");

                        }
                        else if(s.equals("view_bat_remaining")){
                        
                                                     
      out.write("\n");
      out.write("                        \n");
      out.write("                   ");

          String connectionURL = "jdbc:mysql://localhost:3306/coarsework2";
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        connection = DriverManager.getConnection(connectionURL, "root", "daphin1986");
                        statement = connection.createStatement();
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coarsework2", "root", "daphin1986");
          ResultSet resultset = statement.executeQuery(" select( select sum(noDozenB) from container )-( select sum(noOfDozens) from sales )as BAT_REMAINING") ;
       
      out.write("\n");
      out.write("       <TABLE BORDER=\"1\" style=\"margin-top:40px\" align=\"center\" class=\".mush\">\n");
      out.write("      <TR>\n");
      out.write("      <TH>BATTERIES REMAINING</TH>\n");
      out.write("      \n");
      out.write("      </TR>\n");
      out.write("      ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("      <TR>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("       \n");
      out.write("      </TR>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("     </TABLE>\n");
      out.write("      ");
 
                        }


                        else{
                        out.println("welcome");
                        }
               
                }catch(NullPointerException e){

                }            
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  \n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">BATTERY FORCE</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
