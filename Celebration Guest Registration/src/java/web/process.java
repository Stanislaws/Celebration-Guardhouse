package web;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
/**
 * The ManagedBean for the Registration form
 * @author Jan Zajaczkowski
 */
public class process {

    /**
     * Creates a new instance of process
     */
    public process() {
    }
    
    private String time, plate, destnum, deststreet, comments, commercial, response;

    /**
     * Sends the form data to print.jsp
     */
    public void print(){
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();
        try{
            
            ec.redirect("pass.jsp?time="+getTime()
                    +"&plate="+getPlate()
                    +"&destnum="+getDestnum()
                    +"&deststreet="+getDeststreet()
                    +"&comments="+getComments());
        }
        catch(IOException e){
            setResponse(e.toString());
        }
       
    }
    
    /**
     * Method to save the data to the DB
     * @throws SQLException thrown if the SQL is incorrectly expressed
     * @throws ClassNotFoundException thrown if ojdbc6.jar is not found
     */
    public void save() throws SQLException, ClassNotFoundException {
        //get data from the form
        String t = getTime();
        String p = getPlate();
        String d = getDestnum() + " " + getDeststreet();
        String c = getComments();
        
        String com = getCommercial();
        
        //avoid NullPointerException by converting null values to blank spaces
        if(t==null)t=" ";
        if(p==null)p=" ";
        if(d==null)d=" ";
        if(c==null)c=" ";
        
        //check if commercial entry
        if("true".equals(com)){
            //insert the data into the db commercial registration table
            db.DB.connects("insert into cr(t,p,d,c) values('"
                +t+"','"+p+"','"+d+"','"+c+"')");            
        }
        else{
            //insert the data in the db regular registration table
            db.DB.connects("insert into r(t,p,d,c) values('"
                +t+"','"+p+"','"+d+"','"+c+"')");            
        }
        
        //clear the form
        clear();
    }

    /**
     * Clears the form
     */
    public void clear(){
        setPlate("");
        setDestnum("");
        setDeststreet("Skyline Drive");
        setComments("");
        setCommercial("false");
    }
    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate.toUpperCase();
    }

    /**
     * @return the destnum
     */
    public String getDestnum() {
        return destnum;
    }

    /**
     * @param destnum the destnum to set
     */
    public void setDestnum(String destnum) {
        this.destnum = destnum.toUpperCase();
    }

    /**
     * @return the deststreet
     */
    public String getDeststreet() {
        return deststreet;
    }

    /**
     * @param deststreet the deststreet to set
     */
    public void setDeststreet(String deststreet) {
        this.deststreet = deststreet;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments.toUpperCase();
    }

    /**
     * @return the commercial
     */
    public String getCommercial() {
        return commercial;
    }

    /**
     * @param commercial the commercial to set
     */
    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    /**
     * @return the response
     */
    public String getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * @return the time
     */
    public String getTime() {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yy hh:mm a");
        String t = sdf.format(date.getTime());
        return t;
    }
}
