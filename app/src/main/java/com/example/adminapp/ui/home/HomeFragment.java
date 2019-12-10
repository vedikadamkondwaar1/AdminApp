package com.example.adminapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.CatAndProduct;
import com.example.adminapp.Inventory;
import com.example.adminapp.Payment;
import com.example.adminapp.R;
import com.example.adminapp.Sales;

public class HomeFragment extends Fragment {
    CardView cardProduct,cardSales, cardInventory, cardPayment;
    private HomeViewModel homeViewModel;
    View view;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //homeViewModel =
               // ViewModelProviders.of(this).get(HomeViewModel.class);
        view = inflater.inflate(R.layout.fragment_home, container, false);
        cardProduct = view.findViewById(R.id.cardViewP);
        cardSales = view.findViewById(R.id.cardViewS);
        cardInventory = view.findViewById(R.id.cardViewI);
        cardPayment = view.findViewById(R.id.cardViewPa);

        cardProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(view.getContext(), CatAndProduct.class);
                startActivity(intent);

            }
        });

        cardSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(view.getContext(), Sales.class);
                startActivity(intent);

            }
        });

        cardPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(view.getContext(), Payment.class);
                startActivity(intent);

            }
        });

        cardInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(view.getContext(), Inventory.class);
                startActivity(intent);

            }
        });

        return view;


    }
}