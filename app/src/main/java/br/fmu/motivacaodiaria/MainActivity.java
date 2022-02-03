package br.fmu.motivacaodiaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mudarFrase(View view){
        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String[] frases = {"O que me preocupa não é o grito dos maus. É o silêncio dos bons.\n" +
                "\n" +
                "Martin Luther King", "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez.\n" +
                "\n" +
                "Thomas Edison", "Se fracassar, ao menos que fracasse ousando grandes feitos, de modo que a sua postura não seja nunca a dessas almas frias e tímidas que não conhecem nem a vitória nem a derrota.\n" +
                "\n" +
                "Theodore Roosevelt", "Quem comete uma injustiça é sempre mais infeliz que o injustiçado.\n" +
                "\n" +
                "Platão", "Tente mover o mundo – o primeiro passo será mover a si mesmo.\n" +
                "\n" +
                "Platão", "O maior castigo consiste em ser governado por alguém ainda pior do que nós, quando não queremos ser nós a governar.\n" +
                "\n" +
                "Platão", "Faz bem a sua alma quem é misericordioso; quem é cruel, aflige sua própria carne\n"+ "(Provérbio 11: 17)",
                "Em todo o tempo ama o amigo e para a hora da angústia nasce o irmão\n" + "Provérbio 17:17", "O temor do Senhor é o princípio do conhecimento, mas os insensatos desprezam a sabedoria e a disciplina.\n" +
                "\n" +
                "Provérbios 1:7", "Ouça, meu filho, a instrução de seu pai e não despreze o ensino de sua mãe.\n" +
                "\n" +
                "Provérbios 1:8", "É sábio o homem que pôs em si tudo que leva à felicidade ou dela se aproxima. \n" + "Sócrates"};

        int n = new Random().nextInt(frases.length);
        textFrases.setText(frases[n]);
    }
}