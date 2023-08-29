package com.martintecno.listrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.martintecno.listrecycler.modelo.Pokemon;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {
    private List<Pokemon> ListaPokemones;
    private Context context;

    private LayoutInflater li;

    public PokemonAdapter(List<Pokemon> ListaPokemones, Context context, LayoutInflater li) {
        this.ListaPokemones = ListaPokemones;
        this.context = context;
        this.li = li;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=li.inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nombre.setText(ListaPokemones.get(position).getNombre());
        holder.descripcion.setText(ListaPokemones.get(position).getDescripcion());

        Glide.with(context)
                .load(ListaPokemones.get(position).getImagenURL())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter()
                .override(210,238)
                .into(holder.foto);

    }

    @Override
    public int getItemCount() {
        return ListaPokemones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre;
        private TextView descripcion;

        private ImageView foto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvDireccion);
            descripcion = itemView.findViewById(R.id.tvDescripcion);
            foto=itemView.findViewById(R.id.foto);

        }
    }
}