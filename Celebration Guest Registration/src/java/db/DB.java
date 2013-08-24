/**
 *  Celebration Guest Registration - handles keeping essential data and preparing guest passes for printing
 *  Copyright (C) 2013  Jan Zajaczkowski
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class responsible for all database calls.
 * @author Jan
 */
public class DB {
    public DB(){}
    /**
     * The db method used across the application
     * @param query the SQL query string
     * @return a resultset of the data
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static ResultSet connects(String query) throws SQLException, 
            ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection c = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "cbdbpass");
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(query);
        return r;
    }
    
}