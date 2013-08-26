<%-- 
   Celebration Guest Registration - handles keeping essential data and preparing guest passes for printing
   Copyright (C) 2013  Jan Zajaczkowski
 
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
 
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
 
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

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
