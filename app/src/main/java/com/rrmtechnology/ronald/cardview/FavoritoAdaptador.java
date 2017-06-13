package com.rrmtechnology.ronald.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ronald on 06/06/2017.
 */

public class FavoritoAdaptador extends RecyclerView.Adapter<ProductosAdapter.ProductosViewHolder> {

    private List<Productos> favorit;

    public static class ProductosViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagenfavorit;
        public TextView textofavorit;

        public ProductosViewHolder(View v){
            super(v);
            imagenfavorit= (ImageView) v.findViewById(R.id.imagen2);
            textofavorit= (TextView) v.findViewById(R.id.nombremascota2);

        }
    }

    public FavoritoAdaptador(List<Productos> favorit){this.favorit=favorit;}


    public int GetItemCount(){return favorit.size();}

    @Override
    public ProductosAdapter.ProductosViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.favoritos, viewGroup, false);
        ProductosAdapter.ProductosViewHolder favor= new ProductosAdapter.ProductosViewHolder(v);
        return favor;
    }

    @Override
    public void onBindViewHolder(ProductosAdapter.ProductosViewHolder holder, int i) {
        holder.imagen.setImageResource(favorit.get(i).getImagen());
        holder.texto.setText(favorit.get(i).getNombre());

    }

    @Override
    public int getItemCount() {
        return favorit.size();
    }


}




