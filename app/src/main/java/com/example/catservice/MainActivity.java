package com.example.catservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        imageView = findViewById( R.id.image );

        RecyclerView recyclerView = findViewById( R.id.mrecycler_view );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );

        adapter = new Adapter( this,getMyList() );
        recyclerView.setAdapter( adapter );

    }

    private List<Product> getMyList() {

        ArrayList<Product> products = new ArrayList<>(  );
        Product p=new Product();
        p.setTitle( "GROOMING " ) ;
        p.setPrice_title( "₹1600.00" );
        p.setImage( R.drawable.grooming );
        products.add( p );

        p=new Product();
        p.setTitle( "BATH " );
        p.setPrice_title( "₹ 500.00" );
        p.setImage( R.drawable.bath );
        products.add( p );

        p=new Product();
        p.setTitle( "COMPLETE HAIR TRIMMING " );
        p.setPrice_title( "₹ 1300.00" );
        p.setImage( R.drawable.trimming );
        products.add( p );

        p=new Product();
        p.setTitle( "GROOMING " );
        p.setPrice_title( "₹1600.00" );
        p.setImage( R.drawable.grooming );
        products.add( p );

        p=new Product();
        p.setTitle( "BATH " );
        p.setPrice_title( "₹ 500.00" );
        p.setImage( R.drawable.bath );
        products.add( p );

        p=new Product();
        p.setTitle( "COMPLETE HAIR TRIMMING " );
        p.setPrice_title( "₹ 1300.00" );
        p.setImage( R.drawable.trimming );
        products.add( p );


        return products;

    }
}
