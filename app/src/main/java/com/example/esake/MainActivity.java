package com.example.esake;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.esake.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private ArrayList<String> teams = new ArrayList<>();
    private final String myIP = "192.168.1.88";
    private tList cb = new tList(myIP);
    private ArrayList<String> temp= new ArrayList<>();
    BufferedInputStream is=null;
    String line=null;
    String res=null;
    String[] data ;
    ArrayAdapter adapter;
    private tList cbl;
    private SQLiteConnection lite;


    private String omada1;
    private String omada2;
    private tList teamList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cbl = new tList();
        lite = new SQLiteConnection(getApplicationContext());

        // Button b1 = (Button) findViewById(R.id.button3);
        //Spinner s1 = (Spinner) findViewById(R.id.spinner);

        /// ArrayAdapter<String> arrayAdapter =
        ///      new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
        ///          cbl.getAllTeams());
        ///s1.setAdapter(arrayAdapter);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

//        /*try {
//            URL link= new URL(url);
//            HttpURLConnection con = (HttpURLConnection) link.openConnection();
//            con.setRequestMethod("GET");
//            BufferedInputStream is = new BufferedInputStream(con.getInputStream());
//
//
//
//        } catch (MalformedURLException e) {
//            System.out.println("Connection problem1");
//
//        } catch (IOException e) {
//            System.out.println("Connection problem2");
//        }
//        try {
//            OkHttp okHttp= new OkHttp();
//            okHttp.loghis(url);
//            //CHANGE TEXT HERE ?
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        StringBuilder sb = new StringBuilder();
//
//        while(true) {
//            try {
//                if ((line=reader.readLine())!= null)
//                {
//                    sb.append(line+"\n");
//                }
//                else
//                    break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        try {
//            is.close();
//            res=sb.toString();
//        } catch (IOException e) {
//            System.out.println("Closing con problem2");
//
//        }
//
//        try {
//            JSONArray js = new JSONArray(res);
//            JSONObject jo=null;
//            data = new String[js.length()];
//
//
//            for(int i=0;i<js.length();i++)
//            {
//                jo=js.getJSONObject(i);
//                data[i]=jo.getString("name1");
//
//            }
//
//        } catch (JSONException e) {
//            System.out.println("JSON ARRAY problem");
//
//
//        }
//        ListView x = (ListView) findViewById(R.id.list);
//        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
//        AlertDialog.Builder x;
//        x.setAdapter(adapter);
//
//


        //R5 PANOS GATSIOS CODE
        /*
        ArrayList<String> temparray = new ArrayList<>();

        OkHttpClient client = new OkHttpClient();
        String adress = ""; //ip here

        Request request = new Request.Builder()
                .url(adress)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    MainActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            TextView omada1 = (TextView) findViewById(R.id.textView);
                           // teamList = new tList(adress);
                           // omada1.setText(tList.getTeamNames().get(0));

                        }
                    });
                }
            }
        });

         */
    }







@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}