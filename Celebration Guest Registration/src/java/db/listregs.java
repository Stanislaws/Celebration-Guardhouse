/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
