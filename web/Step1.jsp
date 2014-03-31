<%-- 
    Document   : Step1
    Created on : Mar 29, 2014, 8:25:23 PM
    Author     : mushabe
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>



<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" /><title>Untitled Document</title>

<style type="text/css">
<!--
.style1 {color: #0000FF}
.style2 {
	color: #FFFFFF;
	font-weight: bold;
	font-size: 24px;
}
-->
</style></head><body>
<div align="center">
    <form id="form1" name="form1" method="post" action="Step2.jsp">
  <table bgcolor="#cccccc" border="0" height="600" width="667">
    <tbody><tr bordercolor="#0066FF">
      <td colspan="3" bgcolor="#0099cc"><div class="style2" align="center">Teacher Registration Step 1 of 3 </div></td>
    </tr>
    
    <tr>
      <td style="vertical-align: top;"><br />
      </td>
      <td style="vertical-align: top;">Your Names<br />
      </td>
      <td style="vertical-align: top;"><br />
      </td>
    </tr>
<tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><input name="firstName"  type="text" Placeholder="First Name" /> </td>
      <td><input name="lastName"  type="text" Placeholder="Last name" /> <br />
</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><input name="otherName" placeholder="Other Name" type="text" /></td>
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
      <td><input name="password" Placeholder="Password" type="password" /></td>
      <td><input name="password2" Placeholder="Re-enter Password" type="password" /></td>
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
      <td>
        <label>
        </label><label>Month Of Birth
        <select name="monthBirth" id="monthBirth">
            <option>Select Month Of Birth</option>
          <option value="January">January</option>
          <option value="February">February</option>
          <option value="March">March</option>
          <option value="April">April</option>
          <option value="May">May</option>
          <option value="June">June</option>
          <option value="July">July</option>
          <option value="August">August</option>
          <option value="September">September</option>
          <option value="October">October</option>
          <option value="November">November</option>
          <option value="December">December</option>
          
            </select>
        </label>
            </td>
      <td><label>Year Of Birth
              <select name="yearBirth" id="yearBirth">
                  <option>Select year Of Birth</option>
                  <option value="2014">2014</option>
                  <option value="2013">2013</option>
                  <option value="2012">2012</option>
                  <option value="2011">2011</option>
                  <option value="2010">2010</option>
                  <option value="2009">2009</option>
                  <option value="2008">2008</option>
                  <option value="2007">2007</option>
                  <option value="2006">2006</option>
                  <option value="2005">2005</option>
                  <option value="2004">2004</option>
                  <option value="2003">2003</option>
                  <option value="2002">2002</option>
                  <option value="2001">2001</option>
                  <option value="2000">2000</option>
                  <option value="1999">1999</option>
                  <option value="1998">1998</option>
                  <option value="1997">1997</option>
                  <option value="1996">1996</option>
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
        <select name="gender" id="gender">
            <option>Select Gender</option>
            <option value="Male">MALE</option>
            <option value="Female">FEMALE</option>
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
      <td><input name="telNo" type="text" Placeholder="Mobile Number"/></td>
      <td><select name="location" id="location">
              <option>Select Your Location</option>
              <option value="Gayaza">Gayaza</option>
              <option value="Mengo">Mengo</option>
              <option value="Rubaga">Rubaga</option>
              <option value="Seeta">Seeta</option>
              <option value="Mukono">Mukono</option>
              <option value="Kawempe">Kawempe</option>
              <option value="Ggaba">Ggaba</option>
              <option value="Bukasa">Bukasa</option>
              <option value="Ntinda">Ntinda</option>
                  </select></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>Your Current Email Address </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><input name="email" type="text" Placeholder="Email Address" /></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><br />
</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><div align="center"><br />
</div></td>
      <td><div align="center">
        <input name="Submit2" value="Cancel" type="submit" />
      </div></td>
      <td><div align="center">
        <input name="Continue" value="Continue" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </tbody></table>
    </form>
</div>
    
</body></html>