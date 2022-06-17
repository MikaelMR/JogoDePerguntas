package br.com.othonbatista.jogodeperguntas;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class JogarFragment extends Fragment {

    public JogarFragment() {
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
        return inflater.inflate(R.layout.fragment_jogar, container, false);
    }

//    private View.OnClickListener mCadastrarListener = new View.OnClickListener()	{
//        public void	onClick(View v)	{
//            getActivity().getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.frameLayout, new CadastrarFragment())
//                    .commit();
//        }
//    };
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        View editTextPergunta = getActivity().findViewById(R.id.editTextPergunta);
//        View editTextResposta = getActivity().findViewById(R.id.editTextResposta);
//        Button mButtonJogar = getActivity().findViewById(R.id.buttonCadastrar);
//        mButtonJogar.setOnClickListener(mCadastrarListener);
//    }

}