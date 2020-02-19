package com.example.catservice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.productViewHolder> {

    private Context context;
    private List<Product>products;

    public Adapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public Adapter.productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( context );
        View view = inflater.inflate( R.layout.list,null );
        productViewHolder holder = new productViewHolder( view );
        return new productViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.productViewHolder holder, int position) {

        Product product =products.get( position );

        holder.image.setImageResource( products.get( position ).getImage() );
        holder.title.setText( products.get( position ).getTitle() );
        holder.price_title.setText( products.get( position ).getPrice_title() );

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, price_title;
        Button btn;

        public productViewHolder(@NonNull View itemView) {
            super( itemView );

            image =itemView.findViewById( R.id.image );
            title = itemView.findViewById( R.id.title );
            price_title = itemView.findViewById( R.id.price_title );
        }
    }
}
