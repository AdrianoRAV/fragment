package com.example.fragments1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Button;

import com.example.fragments1.R;
import com.example.fragments1.fragment.Contatosragment;
import com.example.fragments1.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas, buttonContato;
    private ConversasFragment conversasFragment;
    private Contatosragment contatosragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);
        conversasFragment = new ConversasFragment();

        //configurar objeto para o Fragmwento
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameConteudo,conversasFragment);
        transaction.commit();
        buttonContato = findViewById(R.id.buttonContato);
        buttonConversas = findViewById(R.id.buttonContato);
        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosragment = new Contatosragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,contatosragment);
                transaction.commit();
            }
        });

    }
}