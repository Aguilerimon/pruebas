package com.example.agrosmart.NavigationDrawer;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.agrosmart.R;


public class AccountFragment extends Fragment
{
    String  name, email, phoneNumber, password;

    /*public AccountFragment(String nombre, String correo, String phone, String pass)
    {
        this.name = nombre;
        this.email = correo;
        this.phoneNumber = phone;
        this.password = pass;
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_account,container,false);

        TextView textViewNombre = view.findViewById(R.id.textViewNombre);
        TextView textViewCorreo = view.findViewById(R.id.textViewCorreo);
        TextView textViewTelefono = view.findViewById(R.id.textViewPhone);
        TextView textViewPass = view.findViewById(R.id.textViewPass);

        textViewNombre.setText(name);
        textViewCorreo.setText(email);
        textViewTelefono.setText(phoneNumber);
        textViewPass.setText(password);


        return view;
    }


}
