package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        ArrayList<CourseModel> courseList = new ArrayList<CourseModel>();
        courseList.add(new CourseModel("The Complete Android 12 course", R.drawable.course1));
        courseList.add(new CourseModel("The Complete Java Developer Course", R.drawable.course2));
        courseList.add(new CourseModel("The Complete Kotlin Course", R.drawable.course3));
        courseList.add(new CourseModel("The Complete Data Structure and Algorithms Course", R.drawable.course4));

        MyAdapter myAdapter = new MyAdapter(this, courseList);

        gridView.setAdapter(myAdapter);
    }
}