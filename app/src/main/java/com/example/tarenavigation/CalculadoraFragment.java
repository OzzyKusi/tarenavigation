package com.example.tarenavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculadoraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculadoraFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CalculadoraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculadoraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculadoraFragment newInstance(String param1, String param2) {
        CalculadoraFragment fragment = new CalculadoraFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private View view;
    private EditText et1,et2;
    private TextView tv1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculadora, container, false);
        et1 = view.findViewById(R.id.txtNro1);
        et2 = view.findViewById(R.id.txtNro2);
        tv1 = view.findViewById(R.id.tvRespuesta);
        public void Sumar(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);

            double suma = num1 + num2;

            String result = String.valueOf(suma);
            tv1.setText(result);
        }

        //Este metodo es para el boton restar
        public void Restar(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);

            double resta = num1 - num2;

            String result = String.valueOf(resta);
            tv1.setText(result);
        }

        //Este metodo es para el boton multiplicar
        public void Multiplicar(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);

            double mult = num1 * num2;

            String result = String.valueOf(mult);
            tv1.setText(result);
        }

        //Este metodo es para el boton dividir
        public void Dividir(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);

            if (num1 == 0) {
                tv1.setText("ERROR");
            } else {
                double div = num1 / num2;
                String result = String.valueOf(div);
                tv1.setText(result);
            }
        }

        //Este metodo es para el boton raiz
        public void Raiz(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Integer.parseInt(valor1);
            double num2 = Integer.parseInt(valor2);

            double raiz = Math.pow(num1, (1 / num2));

            String result = String.valueOf(raiz);
            tv1.setText(result);
        }

        //Este metodo es para el boton seno
        public void Seno(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Integer.parseInt(valor1);

            double sen = Math.sin(num1);

            String result = String.valueOf(sen);
            tv1.setText(result);
        }

        //Este metodo es para el boton coseno
        public void Coseno(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Integer.parseInt(valor1);

            double cos = Math.cos(num1);

            String result = String.valueOf(cos);
            tv1.setText(result);
        }

        //Este metodo es para el boton tangente
        public void Tangente(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Integer.parseInt(valor1);

            double tan = Math.tan(num1);

            String result = String.valueOf(tan);
            tv1.setText(result);
        }

        //Este metodo es para el boton factorial
        public void Factorial(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Integer.parseInt(valor1);
            int x;
            double fac = 1;

            for (x = 1; x <= num1; x++) {
                fac = fac * x;

                String result = String.valueOf(fac);
                tv1.setText(result);
            }

        }

        //Este metodo es para el boton potencia
        public void Potencia(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Integer.parseInt(valor1);
            double num2 = Integer.parseInt(valor2);

            double exp = Math.pow(num1, num2);

            String result = String.valueOf(exp);
            tv1.setText(result);
        }

        //Este metodo es para el boton de numero aleatorios
        public void Rnd(View view)
        {
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            double num1 = Integer.parseInt(valor1);
            double num2 = Integer.parseInt(valor2);

            double rnd = (double) Math.floor(Math.random() * (num2 - num1) + num1);
            String result = String.valueOf(rnd);
            tv1.setText(result);

        }

        //Este metodo es para el boton limpiar
        public void Limpiar(View view)
        {
            et1.setText("");
            et2.setText("");
            tv1.setText("Respuesta");

        }
    }
}