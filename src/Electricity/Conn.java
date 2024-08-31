package Electricity;
import com.mysql.jdbc.Driver;

import java.sql.*;

public  class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Sattu@#123");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}