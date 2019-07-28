package com.example.cardviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private List<Mahasiswa> mhsList;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

            mhsList = new ArrayList<>();
            adapter = new MahasiswaAdapter(this, mhsList);

            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(adapter);

            data();
        }

        private void data () {
            int[] photos = new int[]{
                    R.drawable.dsc_1,
                    R.drawable.dsc_2,
                    R.drawable.dsc_3,
                    R.drawable.dsc_4,
                    R.drawable.dsc_5,
                    R.drawable.dsc_6,
            };

            mhsList.add(new Mahasiswa("1022311", "Laela Lavi Virlian", photos[0]));
            mhsList.add(new Mahasiswa("1022312", "Diana Putri Asih", photos[1]));
            mhsList.add(new Mahasiswa("1022313", "Vitaloka Andriyani", photos[2]));
            mhsList.add(new Mahasiswa("1022314", "Uswatun Khasanah", photos[3]));
            mhsList.add(new Mahasiswa("1022315", "Siti Nurjanah", photos[4]));
            mhsList.add(new Mahasiswa("1022316", "Ambarwati Dewi", photos[5]));

            adapter.notifyDataSetChanged();

        }
    }


