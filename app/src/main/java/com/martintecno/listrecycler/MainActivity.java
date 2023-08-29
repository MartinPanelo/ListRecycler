package com.martintecno.listrecycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.martintecno.listrecycler.modelo.Pokemon;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        mv.getListaMutable().observe(this, new Observer<List<Pokemon>>() {
            @Override
            public void onChanged(List<Pokemon> pokemonList) {
                RecyclerView rv=findViewById(R.id.rvPokemones);
                GridLayoutManager glm=new GridLayoutManager(MainActivity.this,1,GridLayoutManager.VERTICAL,false);
                rv.setLayoutManager(glm);
                PokemonAdapter pokeadapter=new PokemonAdapter(pokemonList,MainActivity.this,getLayoutInflater());
                rv.setAdapter(pokeadapter);
            }
        });
        mv.armarLista();
    }
}