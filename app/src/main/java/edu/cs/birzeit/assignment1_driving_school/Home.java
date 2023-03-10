package edu.cs.birzeit.assignment1_driving_school;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.cs.birzeit.assignment1_driving_school.model.Teacher;

public class Home extends AppCompatActivity {
String s1[];
RecyclerView category_btn;

int img[]={R.drawable.add_user,R.drawable.drive,R.drawable.statas,R.drawable.cars};
    int pages[]={R.drawable.add_user,R.drawable.drive,R.drawable.statas,R.drawable.cars};
    private Context context;
    private SharedPreferences prefs;
    ImageView icon;
    ImageView icon1;
    ImageView icon2;
    ImageView icon3;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_home);
         icon= findViewById(R.id.icon1);
         icon1= findViewById(R.id.icon2);
         icon2= findViewById(R.id.icon3);
         icon3= findViewById(R.id.icon4);
        icon.setImageResource(R.drawable.add_user);
        icon1.setImageResource(R.drawable.drive);
        icon2.setImageResource(R.drawable.statas);
        icon3.setImageResource(R.drawable.cars);
     context = this;
        name=findViewById(R.id.teacher_text);
        name.setText("Hello Mr' "+getIntent().getStringExtra("tname"));


//        List<Teacher> Teachers = new ArrayList<Teacher>();
//        Teachers.add(new Teacher("ibrahim asfor", "123", "123"));
//        Teachers.add(new Teacher("ibrahim asfor", "ibrahim@gmail.com", "12345"));
//        Teachers.add(new Teacher("ahmad luay", "ahmadl.qatu@gmail.com", "12345"));
//        Teachers.add(new Teacher("sajed abed", "sajed@gmail.com", "12345"));
//        FirebaseDatabase fire = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = fire.getReference("teachers");
//                for (int g = 0; g < Teachers.size(); g++) {
//            myRef.child("teacher"+g).setValue(Teachers.get(g));
//        }

    }

    public void btnCar(View view) {
        Intent vCar = new Intent(context,viewCar.class);
        context.startActivity(vCar);
    }
    public void btnStatus(View view) {
        Intent vCar = new Intent(context,status.class);
        context.startActivity(vCar);
    }

    public void btnaddStudent(View view) {
        Intent add_student = new Intent(context,AddStudent.class);
        context.startActivity(add_student);
    }

    public void btnaddSession(View view) {
        Intent add_session = new Intent(context,AddSession.class);
        context.startActivity(add_session);
    }
    public void logout(View view) {
        Context ct = getApplicationContext();

        prefs = PreferenceManager.getDefaultSharedPreferences(ct);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("FLAG",false);
        editor.commit();
        Intent add_session = new Intent(context,Login.class);
        context.startActivity(add_session);
        finish();
    }



}