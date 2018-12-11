package com.example.amirreza.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHelper>  {
    /*
    Build class-level listings
    for easy access
     */

    List<String> list=new ArrayList<>();
    /*
    method RecAdapter for
    Build a constractor for a list
     */

    RecAdapter(List<String> names){

        list=names;
    }

    /*
    method onCreateViewHolder for To determine the shape and size
    of each name or information in each row
     */
    @NonNull
    @Override
    public MyViewHelper onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity2_main,parent,false);

        return null;
    }

    /*
    method onBindViewHolder for
    To send each name to the view
    belongs to herself
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHelper holder, int position) {
        String s= list.get(position);
        holder.txt.setText(s);
    }

    /*
    method getItemCount for Determine
     the number of names in the list
     */
    @Override
    public int getItemCount() {
        return 10;
    }

    
    class MyViewHelper extends RecyclerView.ViewHolder{
        TextView txt;
        public MyViewHelper(View itemView) {
            super(itemView);

            txt=itemView.findViewById(R.id.txtnames);

        }
    }
}
