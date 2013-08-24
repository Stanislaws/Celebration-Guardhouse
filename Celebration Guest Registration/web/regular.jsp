<%-- 
    Document   : regular
    Created on : Aug 16, 2013, 3:06:04 PM
    Author     : Jan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.listregs"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Celebration Regular Registrations</title>
    </head>
    <body onload="javascript:window.scrollTo(0, document.body.scrollHeight);">       
        <a href="/Celebration_Guest_Registration/" onclick="javascript:window.close();" title="Return to the registration page.">Registration</a> | Regular | <a href="./commercial.jsp" title="View commercial registrations.">Commercial</a>
        <h1>Regular Registrations</h1>
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
                String[] r = listregs.rReg();
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
        <a href="/Celebration_Guest_Registration/" onclick="javascript:window.close();" title="Return to the registration page.">Registration</a> | Regular | <a href="./commercial.jsp" title="View commercial registrations.">Commercial</a>
    </body>
</html>
