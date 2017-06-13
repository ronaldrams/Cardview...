package com.rrmtechnology.ronald.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ronald on 07/06/2017.
 */
public class Favoritos extends AppCompatActivity {

    private RecyclerView recyclerview;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rvfavoritos);



        List<Productos> favorit= new ArrayList<>();
        favorit.add(new Productos(getIntent().getExtras().getInt("perro 1"),getIntent().getExtras().getString("nombre 1")));
        favorit.add(new Productos(getIntent().getExtras().getInt("perro 2"),getIntent().getExtras().getString("nombre 2")));
        favorit.add(new Productos(getIntent().getExtras().getInt("perro 3"),getIntent().getExtras().getString("nombre 3")));
        favorit.add(new Productos(getIntent().getExtras().getInt("perro 4"),getIntent().getExtras().getString("nombre 4")));
        favorit.add(new Productos(getIntent().getExtras().getInt("perro 5"),getIntent().getExtras().getString("nombre 5")));


        recyclerview = (RecyclerView) findViewById(R.id.rvfav);
        recyclerview.setHasFixedSize(true);

        manager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerview.setLayoutManager(manager);

        adapter= new ProductosAdapter(favorit);
        recyclerview.setAdapter(adapter);
    }



}
