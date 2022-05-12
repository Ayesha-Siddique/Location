package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {

    TextView n, c, con, b;
    EditText name, city, Contact, blood_group;
    Button submit;


    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.editTextTextPersonName);
        city = findViewById(R.id.editTextTextPersonName2);
        Contact = findViewById(R.id.editTextTextPersonName3);
        blood_group = findViewById(R.id.editTextTextPersonName4);
        submit = findViewById(R.id.button4);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("Name", name.getText().toString());
                m.put("City", city.getText().toString());
                m.put("Contact", Contact.getText().toString());
                m.put("Blood Group", blood_group.getText().toString());
                firebaseDatabase.getInstance().getReference().child("User").setValue(m);


            }
        });


    }

}