package com.example.esake;

import java.util.ArrayList;

public class tList {

    ArrayList<String> tList = new ArrayList<>();

    public tList(String ip){
        String url= "http://localhost/db.php";

        try {
            OkHttp okHttpHandler = new OkHttp();
            tList = okHttpHandler.db(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public tList() {

    }

    public ArrayList<String> getTeam(){
        return tList;

    }

    ArrayList<String> temparray = new ArrayList<String>();
    public ArrayList<String> getTeamNames() {


        for (int i=0; i<tList.size(); i++){
            temparray.addAll(tList);
        }
        return temparray;
    }



}
