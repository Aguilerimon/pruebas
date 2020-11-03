package com.example.agrosmart.Drawer;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agrosmart.R;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment
{
    ListView notificaciones;
    ArrayList<String> notifications;


    public void onCreate(View view, @Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        notificaciones = (ListView) view.findViewById(R.id.list_Notifications);
        notifications = new ArrayList<String>();
        notifications.add("Notificacion 1");
        notifications.add("Notificacion 2");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.fragment_notifications,notifications);
        notificaciones.setAdapter(adapter);
    }
}
