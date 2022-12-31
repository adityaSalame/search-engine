package com.example.search_engine;

import java.sql.*;

public class DatabaseConnection {

    String MySQLURL="jdbc:mysql://localhost:3306/Search_Engine?useSSL=false";

    String DatabaseUserName= "root";

    String DatabasePassword= "@disumPix97";

    Connection con= null;

    DatabaseConnection() throws SQLException{
        con=DriverManager.getConnection(MySQLURL,DatabaseUserName,DatabasePassword);
        System.out.println("Connection to the Database is successful");
    }
    public ResultSet executeQuery(String query) throws SQLException{
        //for reading
        ResultSet ans= null;
        Statement statement=con.createStatement();
        ans=statement.executeQuery(query);
        return ans;
    }
    public int executeUpdate(String query) throws SQLException{
       // this must be an update query or write query
        int ans=0;
        Statement statement =con.createStatement();
        ans= statement.executeUpdate(query);
        return ans;
    }
}
