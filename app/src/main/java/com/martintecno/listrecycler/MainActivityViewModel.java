package com.martintecno.listrecycler;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.martintecno.listrecycler.modelo.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<List<Pokemon>> listaMutable;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.context=application.getApplicationContext();
    }

    public LiveData<List<Pokemon>> getListaMutable(){
        if(listaMutable==null){

            listaMutable=new MutableLiveData<>();
        }
        return listaMutable;

    }

    public void armarLista() {

        List<Pokemon> lista=new ArrayList<>();



        lista.add(new Pokemon("Pikachu", "https://assets.megamediaradios.fm/2017/10/pikachu-200x200.jpg", "Pikachu es un Pokémon eléctrico conocido por su carisma y la capacidad de generar electricidad en sus mejillas."));
        lista.add(new Pokemon("Charizard", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-iU8sX9IlO657POems1RnJI628zH8FTLTug&usqp=CAU", "Charizard es un poderoso Pokémon tipo fuego y volador con la habilidad de lanzar llamas ardientes desde su boca."));
        lista.add(new Pokemon("Bulbasaur", "https://cdn.myminifactory.com/assets/object-assets/5e9e5f15b5bc2/images/720X720-bulbasaur-original.jpg", "Bulbasaur es un Pokémon de tipo planta y veneno que lleva una planta en su espalda que crece a medida que evoluciona."));
        lista.add(new Pokemon("Mewtwo", "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/b/bf/latest/20160311010530/Mew.png/800px-Mew.png", "Mewtwo es un Pokémon legendario psíquico creado en un laboratorio, conocido por su poder mental sobrenatural."));
        lista.add(new Pokemon("Gyarados", "https://static.pokemonpets.com/images/monsters-images-800-800/10130-Shiny-Mega-Gyarados.webp", "Gyarados es un Pokémon de tipo agua y volador que se transforma de un Magikarp inútil en un dragón feroz."));
        lista.add(new Pokemon("Snorlax", "https://i.pinimg.com/originals/c4/60/c2/c460c27019329e8d57532b11eb2650ff.jpg", "Snorlax es un Pokémon normal conocido por su inmensa cantidad de sueño y su capacidad para bloquear caminos enteros."));
        lista.add(new Pokemon("Gengar", "https://w7.pngwing.com/pngs/286/800/png-transparent-gengar-funny-monster-thumbnail.png", "Gengar es un Pokémon fantasma y veneno que se esconde en las sombras y asusta a los desprevenidos."));
        lista.add(new Pokemon("Eevee", "https://static1-es.millenium.gg/articles/4/43/51/4/@/226967-eevee-article_image_t-2.jpg", "Eevee es un Pokémon normal que puede evolucionar en varias formas diferentes, dependiendo de factores como la amistad y el entorno."));
        lista.add(new Pokemon("Squirtle", "https://pm1.aminoapps.com/6105/f6ffe7b8b18b56d6fb99f9eb511c03e6478d9049_hq.jpg", "Vamo a calmarno."));



        listaMutable.setValue(lista);


    }

}