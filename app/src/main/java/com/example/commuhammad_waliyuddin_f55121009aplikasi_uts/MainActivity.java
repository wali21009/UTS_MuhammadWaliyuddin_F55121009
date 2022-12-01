package com.example.commuhammad_waliyuddin_f55121009aplikasi_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.wali1, R.drawable.riyan, R.drawable.rayhan, R.drawable.monet, R.drawable.kolek,R.drawable.arifatul};
    String[] Nama = {"muhammad waliyuddin", "Riyan Astrawan", "muh rayhan firdaus", "Chandra Ariansyah",
            "muhammad nur cholek", "Arifatul Khasanah"};
    String[] Descriptions = {"saya adalah muhammad waliyuddin dengan NIm F55121009 saat ini sedang belajar di Universitas Tadulako Pada Jurusan Teknik Informatika",
            "Salah satu mahasiswa universitas Tadulako yang mengambil jurusan Teknik Geologi",
            "Sama seperti riyan, rayhan adalah Salah satu mahasiswa universitas Tadulako yang mengambil jurusan Teknik Geologi",
            "Salah satu mahasiswa Universitas Tadulako yang mengambil jurusan Agroteknologi",
            "sama seperti chandra, cholek adalah Salah satu mahasiswa Universitas Tadulako yang mengambil jurusan Agroteknologi",
            "salah satu mahasiswi yang mengambil jurusan Bahasa inggris"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new CustomAdapter());
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Nama.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.item, null);

            ImageView image = v.findViewById(R.id.image);
            TextView Name = v.findViewById(R.id.Name);
            TextView Deskripsi = v.findViewById(R.id.Deskripsi);

            image.setImageResource(images[i]);
            Name.setText(Nama[i]);
            Deskripsi.setText(Descriptions[i]);
            return v;
        }
    }
}