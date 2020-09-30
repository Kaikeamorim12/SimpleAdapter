package com.example.simpleadapter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.simpleadapter.R;
import com.example.simpleadapter.debug.DebugActivity;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibir(View view) {
        //
        int opcao = view.getId();
        Intent intent;

        switch (opcao){
            case R.id.btnAddres:
                intent = new Intent(this ,AddresActivity.class);
                startActivity(intent);
                break;
            case R.id.btnUse:
                intent = new Intent(this ,UserActivity.class);
                startActivity(intent);
                break;
            case R.id.btnPessoa:
                intent = new Intent(this ,PessoaActivity.class);
                startActivity(intent);
                break;
            case R.id.btnPost:
                intent = new Intent(this,PostActivity.class);
                startActivity(intent);
                break;
            case R.id.btnComments:
                intent = new Intent(this,CommentsActivity.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "Opção inválida.", Toast.LENGTH_LONG).show();
                break;
        }
    }
}