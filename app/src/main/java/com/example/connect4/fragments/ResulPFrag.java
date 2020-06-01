package com.example.connect4.fragments;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.connect4.R;
import com.example.connect4.bd.PartidesSQLiteHelper;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResulPFrag extends Fragment {

    String result;
    ImageView imagen;

    public ResulPFrag() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resul_p, container, false);
        imagen = view.findViewById(R.id.imagen);

        if(getArguments() != null){
            result = getArguments().getString("estado");

            if(result == "Empat"){
                imagen.setImageResource(R.drawable.empate);
            }else if(result == "Victoria") {
                imagen.setImageResource(R.drawable.victoria);
            }else if(result == "Derrota"){
                imagen.setImageResource(R.drawable.derrota);
            }else if(result == "Temps esgotat"){
                imagen.setImageResource(R.drawable.tiempoagotado);
            }

        }else{
            Toast.makeText(getContext(), "NO HAY ARGUMENTOS", Toast.LENGTH_SHORT).show();
        }

        return view;
    }

}
