package com.example.esake;

import android.os.StrictMode;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
//CODE R8 KOSTSA VASILEIADHS
public class OkHttp {

    public OkHttp() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    ArrayList<String> db(String url) throws Exception {

        ArrayList<String> teams = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        RequestBody body = RequestBody.create(MediaType.parse("text/plain"), "");
        Request request = new Request.Builder().url(url).method("POST", body).build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        //System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while (keys.hasNext()) {
                String Tname = keys.next();
                String name = json.get(Tname).toString();
                teams.add(name);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return teams;
    }

    public void loghis(String url) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        RequestBody body = RequestBody.create(MediaType.parse("text/plain"), "");
        Request request = new Request.Builder().url(url).method("POST", body).build();
        Response response = client.newCall(request).execute();
        System.out.println("My Response: " + response);
    }
}
/* CODE R5 PANOS GATSIOS
public class OkHttpHandler {

    public OkHttpHandler() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    ArrayList<String> oeoe(String ip) throws Exception {

        ArrayList<String> teamList = new ArrayList<>();

        OkHttpClient client = new OkHttpClient();


        Request request = new Request.Builder().url("http://localhost/oeoe.php").build();
        Response response = client.newCall(request).execute();

        String data = response.body().string();

        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while (keys.hasNext()) {
                String team_name = keys.next();
                teamList.add(team_name);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return teamList;
    }

}
 */
