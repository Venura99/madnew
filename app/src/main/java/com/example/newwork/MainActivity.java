package com.example.newwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText name_enter;
    EditText address_enter;
    EditText address_entertwo;
    EditText address_enterthree;
    EditText phone_enter;
    EditText email_enter;
    Button btn_save;

    DatabaseReference customerDbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_enter = findViewById(R.id.name_enter);
        address_enter = findViewById(R.id.address_enter);
        address_entertwo = findViewById(R.id.address_entertwo);
        address_enterthree = findViewById(R.id.address_enterthree);
        phone_enter = findViewById(R.id.phone_enter);
        email_enter = findViewById(R.id.email_enter);
        btn_save = findViewById(R.id.btn_save);

        customerDbRef = FirebaseDatabase.getInstance().getReference().child("Customer");

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertCustomerData();
            }
        });
    }

    private void insertCustomerData(){

        String name = name_enter.getText().toString();
        String address1 = address_enter.getText().toString();
        String address2 = address_entertwo.getText().toString();
        String address3 = address_enterthree.getText().toString();
        String phone = phone_enter.getText().toString();
        String email = email_enter.getText().toString();

        Customer customer = new Customer(name,address1,address2,address3,phone,email);

        customerDbRef.push().setValue(customer);
        Toast.makeText(MainActivity.this,"Customer Added",Toast.LENGTH_SHORT).show();
    }
}