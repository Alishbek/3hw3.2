package com.example.a3hw32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> addresses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        addresses.add("Пушкина, 4, 1");
        addresses.add("Токтогул, 6б, 5");
        addresses.add("Чадаева, 33, 4");
        addresses.add("Нансена, 16, 37");
        addresses.add("Победная, 9, 9");
        addresses.add("Арбад, 1, 1");
        addresses.add("Сретенко, 12а, 2");
        addresses.add("Первая Парковая, 7, 4");
        addresses.add("Гитлер, 6, 66");
        addresses.add("Полянка, 2, 8");
        addresses.add("Щусёва, 0, 12");
        addresses.add("Жигули, 6, 9");
        AddressAdapter addressAdapter = new AddressAdapter(addresses);
        recyclerView.setAdapter(addressAdapter);
    }
}