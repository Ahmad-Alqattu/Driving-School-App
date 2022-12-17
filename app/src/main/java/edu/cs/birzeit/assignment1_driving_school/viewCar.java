package edu.cs.birzeit.assignment1_driving_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

import edu.cs.birzeit.assignment1_driving_school.model.Car;
import edu.cs.birzeit.assignment1_driving_school.model.CarData;

public class viewCar extends AppCompatActivity {

    private Spinner spinner;
    private ListView listView;
    CarData data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_car);

        spinner = findViewById(R.id.spinner);
        listView = findViewById(R.id.listView);

        data = new CarData();
        List<String> cats = data.getCategories();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);


    }


    public void btnSelect(View view) {
        String str = spinner.getSelectedItem().toString();
        List<Car> res = data.getItems(str);
        ArrayAdapter<Car> adapterItems = new ArrayAdapter<Car>(viewCar.this,
                android.R.layout.simple_list_item_1,res);
        listView.setAdapter(adapterItems);
    }



    public void btnAddCar(View view) {
        Intent vAddCar = new Intent( this,addNewCar.class);
        startActivity(vAddCar);
    }


}