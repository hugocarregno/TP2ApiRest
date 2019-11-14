package com.example.tp2apirest.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.tp2apirest.R;
import com.example.tp2apirest.modelos.ItemResultadoAdapter;
import com.example.tp2apirest.modelos.Provincia;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnBuscar;
    private ListView lvResultado;
    private EditText etFiltro;
    private MainViewModel mvm;
    private ArrayAdapter<Provincia> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
    }

    public void inicializar(){
        btnBuscar = findViewById(R.id.btnBuscar);
        lvResultado = findViewById(R.id.lvResultado);
        etFiltro = findViewById(R.id.etFiltro);
        mvm = ViewModelProviders.of(this).get(MainViewModel.class);
        mvm.getLista().observe(this, new Observer<List<Provincia>>() {
                    @Override
                    public void onChanged(List<Provincia> provincias) {
                        adapter = new ItemResultadoAdapter(getApplicationContext(),R.layout.item_resultado,provincias,getLayoutInflater());
                        lvResultado.setAdapter(adapter);
                    }
                }
        );
    }

    public void buscar(View v){
        mvm.buscarVM(etFiltro.getText().toString().toLowerCase());
    }

}
