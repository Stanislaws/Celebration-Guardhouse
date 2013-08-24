<%-- 
    Document   : commercial
    Created on : Aug 16, 2013, 3:06:19 PM
    Author     : Jan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.listregs"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Celebration Commercial Registrations</title>
    </head>
    <body onload="javascript:window.scrollTo(0, document.body.scrollHeight);">
        <a href="/Celebration_Guest_Registration/" onclick="javascript:window.close();" title="Return to the registration page.">Registration</a> | <a href="./regular.jsp" title="View non-commercial registrations.">Regular</a> | Commercial
        <h1>Commercial Registrations</h1>
        <table border="1">
            <tr>
                <th>
                    Time
                </th>
                <th>
                    Plate
                </th>
                <th>
                    Destination
                </th>
                <th>
                    Comment
                </th>                
            </tr>
            <%
                String[] r = listregs.cReg();
                for(int i=0;i<r.length;i++){
                    out.println(r[i]);
                }
            %>
            <tr>
                <th>
                    Time
                </th>
                <th>
                    Plate
                </th>
                <th>
                    Destination
                </th>
                <th>
                    Comment
                </th>                 
            </tr>
        </table>
        <a href="/Celebration_Guest_Registration/" onclick="javascript:window.close();" title="Return to the registration page.">Registration</a> | <a href="./regular.jsp" title="View non-commercial registrations.">Regular</a> | Commercial
    </body>
</html>
