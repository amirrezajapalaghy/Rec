package com.example.amirreza.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*
    list for send names to RecyclerView
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> list=new ArrayList<>();
        list.add("amirreza japalaghy");
        list.add("parsa safavi");
        list.add("mohamad reza zahiri");
        list.add("mohamad haji");
        list.add("shahbaz sarkhosh");
        list.add("reza ghotbi");
        list.add("nariman mohajer");
        list.add("danial karami");
        list.add("amirhossien imanvand");
        list.add("hossein ahmadi");

        /*
        finded RecyclerView for set adapter and
        set layoutManager
        */

        RecyclerView recycler=findViewById(R.id.recview);
        RecAdapter recAdapter=new RecAdapter(list);
        recycler.setAdapter(recAdapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));


    }
}
