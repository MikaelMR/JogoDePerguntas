package br.com.othonbatista.jogodeperguntas;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarFragment extends Fragment {

    public CadastrarFragment() {
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
        return inflater.inflate(R.layout.fragment_cadastrar, container, false);
    }

//    private View.OnClickListener mJogarListener = new View.OnClickListener()	{
//        public void	onClick(View v)	{
//            getActivity().getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.frameLayout, new JogarFragment())
//                    .commit();
//        }
//    };
//    private View.OnClickListener mInserirListener = new View.OnClickListener()	{
//        public void onClick(View v)	{
//
//            EditText mEditTextPergunta = getActivity().findViewById(R.id.editTextPergunta);
//            EditText mEditTextResposta = getActivity().findViewById(R.id.editTextResposta);
//            String pergunta = mEditTextPergunta.getText().toString();
//            String resposta = mEditTextResposta.getText().toString();
//            if ((!pergunta.isEmpty()) && (!resposta.isEmpty())) {
//
//                // Cria um objeto do tipo Questoes com os valores digitados pelo usuário
//                Questoes questoes = new Questoes(pergunta, resposta);
//
//                // Através da classe DAO, insere a Questão no banco de dados
//                BancoDeDados.getBancoDeDadosInstancia(getActivity()).getDAO().inserirQuestao(questoes);
//
//                // Limpa os EditText após inserir a questao
//                mEditTextPergunta.setText("");
//                mEditTextResposta.setText("");
//
//                // Exibe uma mensagem para o usuário
//                Toast.makeText(getActivity(), "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
//            }
//        }
//    };
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        View editTextPergunta = getActivity().findViewById(R.id.editTextPergunta);
//        View editTextResposta = getActivity().findViewById(R.id.editTextResposta);
//
//        Button mButtonJogar = getActivity().findViewById(R.id.buttonJogar);
//        mButtonJogar.setOnClickListener(mJogarListener);
//        Button mButtonInserir = getActivity().findViewById(R.id.buttonCadastrar);
//        mButtonInserir.setOnClickListener(mInserirListener);
//    }
}