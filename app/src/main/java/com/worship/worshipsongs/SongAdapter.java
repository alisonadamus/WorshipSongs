package com.worship.worshipsongs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Клас-адаптер, який наслідує ArrayAdapter
 */
public class SongAdapter extends ArrayAdapter<Song> {
        public SongAdapter(Context context, List<Song> songs) {
            super(context, 0, songs);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Отримання даних для цього рядка
            Song song = getItem(position);

            // Перевірка, чи існуючий view використовується повторно, інакше створення нового view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout,
                        parent, false);
            }

            // Пошук view для заповнення даними
            ImageView imageView = convertView.findViewById(R.id.itemImage);
            TextView textView = convertView.findViewById(R.id.itemText);

            // Заповнення даними
            imageView.setImageResource(R.drawable.music_heart);
            textView.setText(song.getSongName());

            // Повернення завершеного view для відображення на екрані
            return convertView;
        }
}