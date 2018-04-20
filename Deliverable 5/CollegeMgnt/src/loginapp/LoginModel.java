package loginapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbUtil.dbConnection;

public class LoginModel {
    Connection connection;

    public LoginModel(){
        try{
            this.connection = dbConnection.getConnection();
        }
        catch (SQLException ex){
            ex.fillInStackTrace();
        }
        if(this.connection == null){
            System.exit(1);
        }
    }

    public boolean isDatabaseConnection(){
        return this.connection != null;
    }

    public boolean isLogin(String user, String pass, String opt) throws Exception {
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM login where username = ? and password = ? and division = ?";

        try{
            pr = this.connection.prepareStatement(sql);
            pr.setString(1, user);
            pr.setString(2, pass);
            pr.setString(3, opt);

            rs = pr.executeQuery();

            boolean bolli;

            if(rs.next()){
                return true;
            }
            return false;
        }
        catch (SQLException ex){
            return false;
        }

        finally {
            {
                pr.close();
                rs.close();
            }
        }
    }
}
