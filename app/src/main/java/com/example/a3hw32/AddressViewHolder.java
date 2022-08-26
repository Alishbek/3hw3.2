package com.example.a3hw32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewAddress;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewAddress = itemView.findViewById(R.id.text_view_address);
    }

    public void bind(String address){
        textViewAddress.setText(address);
    }
}
