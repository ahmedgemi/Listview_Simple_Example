package com.example.ahmed.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button b1 ;

    EditText e1;

    ListView myList ;

    ArrayList<String> data = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myList =(ListView) findViewById(R.id.listView1);

        b1 = (Button) findViewById(R.id.button5);

        e1= (EditText)findViewById(R.id.editText);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = e1.getText().toString();

                if(str.equals("")){

                    Toast.makeText(MainActivity.this , "Empty field" , Toast.LENGTH_LONG).show();
                }
                else{

                    data.add(str);

                    ArrayAdapter adapter = new ArrayAdapter(MainActivity.this , R.layout.listview_layout,data);

                    myList.setAdapter(adapter);
                }
            }
        });


    }
}
