package com.rrmtechnology.ronald.cardview;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import static com.rrmtechnology.ronald.cardview.R.layout.productos;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Productos> item= new ArrayList<>();
        item.add(new Productos(R.drawable.perro ,"Kiangry"));
        item.add(new Productos(R.drawable.perro2 ,"Ronny"));
        item.add(new Productos(R.drawable.perro_3 ,"Ponny"));
        item.add(new Productos(R.drawable.perro4 ,"Lilly"));
        item.add(new Productos(R.drawable._ndice ,"Linny"));


        recyclerview = (RecyclerView) findViewById(R.id.rv);
        recyclerview.setHasFixedSize(true);

        manager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerview.setLayoutManager(manager);

        adapter= new ProductosAdapter(item);
        recyclerview.setAdapter(adapter);


    }


    public void irfavoritos(View v){
        Intent intent = new Intent(this,Favoritos.class);

        intent.putExtra("perro 1", R.drawable.perro);
        intent.putExtra("nombre 2", "Kiangry");

        intent.putExtra("perro 2", R.drawable.perro2);
        intent.putExtra("nombre 2", "Ronny");

        intent.putExtra("perro 3", R.drawable.perro_3);
        intent.putExtra("nombre 3", "Ponny");

        intent.putExtra("perro 4", R.drawable.perro4);
        intent.putExtra("nombre 4 ", "Lilly");

        intent.putExtra("perro 5", R.drawable._ndice);
        intent.putExtra("nombre 5", "Linny");



        startActivity(intent);

    }


}
