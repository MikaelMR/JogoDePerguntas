package br.com.othonbatista.jogodeperguntas;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new JogarFragment())
                .commit();
    }

    // Botões do Fragmento Jogar
    public void mCadastrarListener(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new CadastrarFragment())
                .commit();
    }
    public void mExibirListener(View v) {
        TextView mTextViewResposta = findViewById(R.id.textViewResposta);
        // Mostra a resposta
        mTextViewResposta.setVisibility(View.VISIBLE);
    }
    public void mPularListener(View v) {
            List<Questoes> mListQuestoes = BancoDeDados.getBancoDeDadosInstancia(MainActivity.this).getDAO().pesquisarTodasQuestoes();
            // Verifica se a lista contém questões cadastradas
            if (!mListQuestoes.isEmpty()){
                // Recupera o total de questões cadastradas
                int totalDeQuestoes = mListQuestoes.size();
                // Cria um número aleatório dentre o total de questões cadastradas
                int indexAleatorio = new Random().nextInt(totalDeQuestoes);
                // Recupera um objeto Questoes da lista de forma aleatória
                Questoes questoes = mListQuestoes.get(indexAleatorio);
                // Exibe para o usuário a pergunta e a resposta
                TextView mTextViewPergunta = findViewById(R.id.textViewPergunta);
                TextView mTextViewResposta = findViewById(R.id.textViewResposta);
                mTextViewPergunta.setText(questoes.getPergunta());
                mTextViewResposta.setText(questoes.getResposta());
                // Mantém a resposta oculta
                mTextViewResposta.setVisibility(View.GONE);
            }
    }

    // Botões do Fragmento Cadastrar
    public void mJogarListener(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new JogarFragment())
                .commit();
    }
    public void mInserirListener(View v) {
        EditText mEditTextPergunta = findViewById(R.id.editTextPergunta);
        EditText mEditTextResposta = findViewById(R.id.editTextResposta);
        String pergunta = mEditTextPergunta.getText().toString();
        String resposta = mEditTextResposta.getText().toString();
        if ((!pergunta.isEmpty()) && (!resposta.isEmpty())) {
            // Cria um objeto do tipo Questoes com os valores digitados pelo usuário
            Questoes questoes = new Questoes(pergunta, resposta);
            // Através da classe DAO, insere a Questão no banco de dados
            BancoDeDados.getBancoDeDadosInstancia(MainActivity.this).getDAO().inserirQuestao(questoes);
            // Limpa os EditText após inserir a questao
            mEditTextPergunta.setText("");
            mEditTextResposta.setText("");
            // Exibe uma mensagem para o usuário
            Toast.makeText(MainActivity.this, "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
        }
    }
}