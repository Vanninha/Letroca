package com.example.forca;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText inputText;
    Button Reiniciar;

    String[] dicionario = {"tropa", "grama", "bambu", "casal", "causa", "dizer", "saber", "dever", "latir", "subir", "geral", "louco", "orgia", "ontem", "meiga", "malha", "lerdo", "lugar", "fluxo", "reais", "abrir", "leite", "bravo"};
    String resposta = dicionario[(int) (Math.random() * dicionario.length)];


    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.a1);
        inputText = findViewById(R.id.tentativa);

        Reiniciar = findViewById(R.id.Reiniciar);
        Reiniciar.setOnClickListener(view -> {
            finish();
            startActivity(getIntent());
        });
    }

    public void Ajuda(View view){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Como jogar");
        alertDialog.setMessage("Você terá 5 tentativas. Cada uma delas deve ser uma palavra que exista.\n" +
                "Acentos e cedilha são ignorados, tanto nas tentativas, quanto na resposta.\n" +
                "Após chutar, as letras mudarão para indicar o quão perto você está da resposta.\n"+
                "Verde = Lugar certo\n"+
                "Amarelo = Letra certa, lugar errado\n"+
                "Vermelho = Não tem na palavra\n");
        alertDialog.show();
    }

    @SuppressLint("ResourceAsColor")
    public void Enviar(View view){
        String texto = String.valueOf(inputText.getText());
        String[] split = texto.split("");
        String[] separa = resposta.split("");
        int vitoria = 0;

        int[] viewArray_a = {R.id.a1, R.id.a2,R.id.a3, R.id.a4,R.id.a5};
        int[] viewArray_b = {R.id.b1, R.id.b2,R.id.b3, R.id.b4,R.id.b5};
        int[] viewArray_c = {R.id.c1, R.id.c2,R.id.c3, R.id.c4,R.id.c5};
        int[] viewArray_d = {R.id.d1, R.id.d2,R.id.d3, R.id.d4,R.id.d5};
        int[] viewArray_e = {R.id.e1, R.id.e2,R.id.e3, R.id.e4,R.id.e5};
        TextView checa1 = findViewById(viewArray_a[0]);
        TextView checa2 = findViewById(viewArray_b[0]);
        TextView checa3 = findViewById(viewArray_c[0]);
        TextView checa4 = findViewById(viewArray_d[0]);
        TextView checa5 = findViewById(viewArray_e[0]);


        if (checa1.getText().length() == 0) {
            for (int i = 0; i < viewArray_a.length; i++) {
                TextView veja = findViewById(viewArray_a[i]);
                veja.setText(split[i]);
                if(split[i].equals(separa[i])){
                    veja.setBackgroundResource(R.color.green);
                    vitoria = vitoria + 1;
                }else if (split[i].equals(separa[0])||split[i].equals(separa[1])||split[i].equals(separa[2])||split[i].equals(separa[3])||split[i].equals(separa[4])){
                    veja.setBackgroundResource(R.color.yellow);
                }else{
                    veja.setBackgroundResource(R.color.red);
                }
                if(vitoria == 5){
                    AlertDialog alertDialog;
                    alertDialog = new AlertDialog.Builder(this).create();
                    alertDialog.setTitle("Parabens");
                    alertDialog.setMessage("Você acertou a palavra");
                    alertDialog.show();
                }
            }
        }else if(checa2.getText().length() == 0){
            for(int i = 0; i < viewArray_b.length; i++) {
                TextView veja = findViewById(viewArray_b[i]);
                veja.setText(split[i]);
                if(split[i].equals(separa[i])){
                    veja.setBackgroundResource(R.color.green);
                    vitoria = vitoria + 1;
                }else if (split[i].equals(separa[0])||split[i].equals(separa[1])||split[i].equals(separa[2])||split[i].equals(separa[3])||split[i].equals(separa[4])){
                    veja.setBackgroundResource(R.color.yellow);
                }else{
                    veja.setBackgroundResource(R.color.red);
                }
                if(vitoria == 5){
                    AlertDialog alertDialog;
                    alertDialog = new AlertDialog.Builder(this).create();
                    alertDialog.setTitle("Parabens");
                    alertDialog.setMessage("Você acertou a palavra");
                    alertDialog.show();
                }
            }
        }else if(checa3.getText().length() == 0){
            for(int i = 0; i < viewArray_c.length; i++) {
                TextView veja = findViewById(viewArray_c[i]);
                veja.setText(split[i]);
                if(split[i].equals(separa[i])){
                    veja.setBackgroundResource(R.color.green);
                    vitoria = vitoria + 1;
                }else if (split[i].equals(separa[0])||split[i].equals(separa[1])||split[i].equals(separa[2])||split[i].equals(separa[3])||split[i].equals(separa[4])){
                    veja.setBackgroundResource(R.color.yellow);
                }else{
                    veja.setBackgroundResource(R.color.red);
                }
                if(vitoria == 5){
                    AlertDialog alertDialog;
                    alertDialog = new AlertDialog.Builder(this).create();
                    alertDialog.setTitle("Parabens");
                    alertDialog.setMessage("Você acertou a palavra");
                    alertDialog.show();
                }
            }
        }else if(checa4.getText().length() == 0){
            for(int i = 0; i < viewArray_d.length; i++) {
                TextView veja = findViewById(viewArray_d[i]);
                veja.setText(split[i]);
                if(split[i].equals(separa[i])){
                    veja.setBackgroundResource(R.color.green);
                    vitoria = vitoria + 1;
                }else if (split[i].equals(separa[0])||split[i].equals(separa[1])||split[i].equals(separa[2])||split[i].equals(separa[3])||split[i].equals(separa[4])){
                    veja.setBackgroundResource(R.color.yellow);
                }else{
                    veja.setBackgroundResource(R.color.red);
                }
                if(vitoria == 5){
                    AlertDialog alertDialog;
                    alertDialog = new AlertDialog.Builder(this).create();
                    alertDialog.setTitle("Parabens");
                    alertDialog.setMessage("Você acertou a palavra");
                    alertDialog.show();
                }
            }
        }else if(checa5.getText().length() == 0){
            for(int i = 0; i < viewArray_e.length; i++) {
                TextView veja = findViewById(viewArray_e[i]);
                veja.setText(split[i]);
                if(split[i].equals(separa[i])){
                    veja.setBackgroundResource(R.color.green);
                    vitoria = vitoria + 1;
                }else if (split[i].equals(separa[0])||split[i].equals(separa[1])||split[i].equals(separa[2])||split[i].equals(separa[3])||split[i].equals(separa[4])){
                    veja.setBackgroundResource(R.color.yellow);
                }else{
                    veja.setBackgroundResource(R.color.red);
                }
                if(vitoria == 5){
                    AlertDialog alertDialog;
                    alertDialog = new AlertDialog.Builder(this).create();
                    alertDialog.setTitle("Parabens");
                    alertDialog.setMessage("Você acertou a palavra");
                    alertDialog.show();
                }
            }
        }
    }
}