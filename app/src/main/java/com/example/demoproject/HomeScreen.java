package com.example.demoproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    RecyclerView image_slider_recycler_view;

    List<ImageList> imageLists = new ArrayList<>();
    LinearLayoutManager HorizontalLayout;
    ImageSliderAdapter imageSliderAdapter;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        image_slider_recycler_view = (RecyclerView) findViewById(R.id.image_slider_recycler_view);

        addImages();
        imageSliderAdapter=new ImageSliderAdapter(getApplicationContext(),imageLists);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(HomeScreen.this, LinearLayoutManager.HORIZONTAL, false);
        image_slider_recycler_view.setLayoutManager(horizontalLayoutManagaer);
        image_slider_recycler_view.setAdapter(imageSliderAdapter    );
    }


    public void addImages()
    {
        /*imageLists.add(new ImageList("https://images.unsplash.com/photo-1594008037836-5f96d75c00f3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80"));
        imageLists.add(new ImageList("https://images.unsplash.com/photo-1593481580857-e4eb53b6d8bf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80"));
        imageLists.add(new ImageList("https://images.unsplash.com/photo-1593776804558-8dc141d5be27?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"));
        imageLists.add(new ImageList("https://images.unsplash.com/photo-1593381008273-5874bf72c908?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"));
        imageLists.add(new ImageList("https://images.unsplash.com/photo-1565555334087-ef43c7c0a90e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80"));
        imageLists.add(new ImageList("https://images.unsplash.com/photo-1592500003030-7694cddc463d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"));*/

        imageLists.add(new ImageList(R.drawable.image1));
        imageLists.add(new ImageList(R.drawable.image2));
        imageLists.add(new ImageList(R.drawable.image3));
        imageLists.add(new ImageList(R.drawable.image4));
        imageLists.add(new ImageList(R.drawable.image5));
        imageLists.add(new ImageList(R.drawable.image6));
    }
}
