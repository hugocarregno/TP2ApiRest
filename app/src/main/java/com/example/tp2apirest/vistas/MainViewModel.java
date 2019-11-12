package com.example.tp2apirest.vistas;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tp2apirest.modelos.Provincia;
import com.example.tp2apirest.modelos.Resultado;
import com.example.tp2apirest.request.ApiClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<Provincia>> lista;

    public LiveData<List<Provincia>> getLista(){
        if(lista==null){
            lista = new MutableLiveData<>();
        }
        return lista;
    }

    public void buscarVM(){
        Call<Resultado> datos = ApiClient.getMyApiInterface().leer();
        datos.enqueue(new Callback<Resultado>() {
            @Override
            public void onResponse(Call<Resultado> call, Response<Resultado> response) {
                if(response.isSuccessful()){
                    Resultado resultado = response.body();
                    ArrayList<Provincia> misProvincias = new ArrayList<>();
                    for(Provincia it: resultado.getProvincias()){
                        //Log.d("message",it+"");
                        misProvincias.add(it);
                    }
                    lista.postValue(misProvincias);
                }
            }

            @Override
            public void onFailure(Call<Resultado> call, Throwable t) {
                lista.postValue(new ArrayList<Provincia>());
            }
        });

    }
}
