package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<CourseModel> {
    public MyAdapter(@NonNull Context context, ArrayList<CourseModel> courseList) {
        super(context,0, courseList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;

        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_card_item, parent, false);
        }

        CourseModel courseModel = getItem(position);
        TextView courseTitle =  gridItemView.findViewById(R.id.gridViewText);
        ImageView courseImage = gridItemView.findViewById(R.id.gridImageView);
        courseTitle.setText(courseModel.getCourseName());
        courseImage.setImageResource(courseModel.getCourseImage());

        return gridItemView;
    }
}
