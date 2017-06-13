package com.rrmtechnology.ronald.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ronald on 28/05/2017.
 */
public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ProductosViewHolder> {

    private List<Productos> item;

    public static class ProductosViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView  texto;

              public ProductosViewHolder(View v){
                  super(v);
                  imagen= (ImageView) v.findViewById(R.id.imagen);
                  texto= (TextView) v.findViewById(R.id.nombremascota);

      }
    }

    public ProductosAdapter(List<Productos> item){this.item=item;}


    public int GetItemCount(){return item.size();}

    @Override
    public ProductosViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.productos, viewGroup, false);
        ProductosViewHolder producto= new ProductosViewHolder(v);
        return producto;
    }

    @Override
    public void onBindViewHolder(ProductosViewHolder holder, int i) {
        holder.imagen.setImageResource(item.get(i).getImagen());
        holder.texto.setText(item.get(i).getNombre());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }


}
