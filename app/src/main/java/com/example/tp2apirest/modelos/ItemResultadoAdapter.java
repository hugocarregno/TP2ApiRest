package com.example.tp2apirest.modelos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tp2apirest.R;

import java.util.List;

public class ItemResultadoAdapter extends ArrayAdapter<Provincia> {
    private Context context;
    private List<Provincia> lista;
    private LayoutInflater li;

    public ItemResultadoAdapter(@NonNull Context context, int resource, @NonNull List<Provincia> objects, LayoutInflater li){
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li = li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null){
            itemView = li.inflate(R.layout.item_resultado,parent,false);
        }
        Provincia item = lista.get(position);
        TextView tvId= itemView.findViewById(R.id.tvId);
        TextView tvNombre = itemView.findViewById(R.id.tvNombre);
        tvId.setText(item.getId()+"");
        tvNombre.setText(item.getNombre());

        return itemView;
    }
}
