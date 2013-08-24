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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Class responsible for listing table rows of registration data
 * @author Jan
 */
public class listregs {
   public listregs(){}
   /**
    * Method to get regular registration data
    * @return a table row of the requested data
    * @throws SQLException
    * @throws ClassNotFoundException 
    */
   public static String[] rReg() throws SQLException, ClassNotFoundException{
       ArrayList<String> a = new ArrayList<String>();
       ResultSet rs = db.DB.connects("select * from r");
       while(rs.next()){
           String w = rs.getString(1);
           String x = rs.getString(2);
           String y = rs.getString(3);
           String z = rs.getString(4);
           
           if(w==null)w=" ";
           if(x==null)x=" ";
           if(y==null)y=" ";
           if(z==null)z=" ";
           
           a.add("<tr><td>"+w+"</td><td>"+x+"</td><td>"+y+"</td><td>"+z+"</td></tr>");
       }
       
       String[] b = new String[a.size()];
       b = a.toArray(b);
       return b;
   }
   /**
    * Method to get commercial registration data
    * @return a table row of the requested data
    * @throws SQLException
    * @throws ClassNotFoundException 
    */
   public static String[] cReg() throws SQLException, ClassNotFoundException{
       ArrayList<String> a = new ArrayList<String>();
       ResultSet rs = db.DB.connects("select * from cr");
       while(rs.next()){
           String w = rs.getString(1);
           String x = rs.getString(2);
           String y = rs.getString(3);
           String z = rs.getString(4);
           
           if(w==null)w=" ";
           if(x==null)x=" ";
           if(y==null)y=" ";
           if(z==null)z=" ";
           
           a.add("<tr><td>"+w+"</td><td>"+x+"</td><td>"+y+"</td><td>"+z+"</td></tr>");
       }
       
       String[] b = new String[a.size()];
       b = a.toArray(b);
       return b;
   }   
}
