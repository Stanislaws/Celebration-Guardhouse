<%-- 
    Document   : pass
    Created on : Jul 12, 2013, 8:48:00 PM
    Author     : Jan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>24-Hour Guest Pass</title>
        <%
            String date = request.getParameter("time");
            if(date == null)date = "";
            String destnum = request.getParameter("destnum");
            String deststreet = request.getParameter("deststreet");
            if(destnum == null)destnum = "";
            if(deststreet == null)deststreet = "";
            String dest = destnum+" "+deststreet;
            String plate = request.getParameter("plate");
            if(plate == null)plate = "";
        %>
    </head>
    <body style="text-align: center" onload="javascript:window.print()">
        <h1><%out.print(date);%></h1>
        <h3>Rainbow Hill Homeowners Association, Inc.</h3>
        <h2>24-Hour Guest Pass</h2>
        <h2>Community Speed Limit is <b>10</b> Miles Per Hour</h2>
        <h5>Address Visiting: <%out.print(dest);%></h5>
        <h5>License Plate Number: <%out.print(plate);%></h5>
            <h4>(This PASS expired 24 HOURS from DATE of Receipt)</h4>
            <h4>Please be advised that this pass is valid for <u><i>24 HOURS ONLY</i></u> for the
                above person and vehicle.</h4>
            <h5>To avoid being towed at your own expense, please display this Pass (this side up) on the
                Dashboard of your Vehicle. Visitors are ONLY allowed to park their Vehicle at curbside or in the
                Visitors Parking Spaces located on Skyline Drive.</h5>
            
            <p>&nbsp;</p>
            <img alt="" src="map.PNG"/>
    </body>
</html>
