package com.example.tenzin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge, editTextOccupation, editTextAddress;
    private ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextOccupation = findViewById(R.id.editTextOccupation);
        editTextAddress = findViewById(R.id.editTextAddress);

        // Initialize dataList
        dataList = new ArrayList<>();
    }

    public void submitForm(View view) {
        String name = editTextName.getText().toString();
        String age = editTextAge.getText().toString();
        String occupation = editTextOccupation.getText().toString();
        String address = editTextAddress.getText().toString();

        String formData = "Name: " + name + "\nAge: " + age + "\nOccupation: " + occupation + "\nAddress: " + address;
        Toast.makeText(this, formData, Toast.LENGTH_LONG).show();
    }

    public void addToList(View view) {
        String name = editTextName.getText().toString();
        String age = editTextAge.getText().toString();
        String occupation = editTextOccupation.getText().toString();
        String address = editTextAddress.getText().toString();

        String formData = "Name: " + name + ", Age: " + age + ", Occupation: " + occupation + ", Address: " + address;
        dataList.add(formData);
        Toast.makeText(this, "Data added to list", Toast.LENGTH_SHORT).show();
    }

    public void showListView(View view) {
        Intent intent = new Intent(this, ListViewActivity.class);
        intent.putStringArrayListExtra("dataList", dataList);
        startActivity(intent);
    }

    public void showGridView(View view) {
        Intent intent = new Intent(this, GridViewActivity.class);
        intent.putStringArrayListExtra("dataList", dataList);
        startActivity(intent);
    }

    public void showRecyclerView(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        intent.putStringArrayListExtra("dataList", dataList);
        startActivity(intent);
    }
}
