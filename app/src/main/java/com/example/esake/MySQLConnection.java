package com.example.esake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLConnection implements Runnable{

    private ArrayList<Team> tList = new ArrayList<>();

    @Override
    public void run() {
        System.out.println("Read the Cars from the MySQL Database!");
        Connection con;
        try{
            Class.forName("org.mariadb.jdbc.Driver");

            // Replace the 1st argument with the public IP of your PC -- see ipconfig from CMD
            //con = DriverManager.getConnection("jdbc:mariadb://192.168.56.1:3306/basketball","basketball","basketball");
            con = DriverManager.getConnection("http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=basketball","basketball","basketball");
            try{
                String sql;
                //sql = "SELECT brand, GROUP_CONCAT(model) AS grouped_models FROM models GROUP BY brand";
                sql = "SELECT name, GROUP_CONCAT(team) AS grouped_teams FROM teams GROUP BY name";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()){
                    tList.add(new Team(rs.getString("name"), rs.getString(2)));
                }
                preparedStatement.close();
                con.close();
            }
            catch (SQLException s){
                System.out.println("SQL statement is not executed!");
                s.printStackTrace();

            }finally {
                con.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public ArrayList<Team> getTeamList(){
        return tList;
    }
}
