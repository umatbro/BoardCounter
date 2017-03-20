package com.example.android.boardcounter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.list_view_main);
        generateListContent();
        lv.setAdapter(new MyListAdapter(this, R.layout.player_list_item, data));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "List item was clicked at " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateListContent(){
        for (int i = 0; i < 10; i++){
            data.add("This is row number " + i);
        }
    }


    /**
     * Video from https://www.youtube.com/watch?v=ZEEYYvVwJGY
     */

    private class MyListAdapter extends ArrayAdapter<String> {
        private int layout;
        public MyListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects) {
            super(context, resource, objects);
            layout = resource;
        }

        @NonNull
        @Override
        public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            ViewHolder mainViewHolder = null;
            if(convertView == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(layout, parent, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.thumbnail = (View) convertView.findViewById(R.id.list_item_image);
                viewHolder.title = (TextView) convertView.findViewById(R.id.list_item_text);
                viewHolder.score = (TextView) convertView.findViewById(R.id.list_item_score);
                viewHolder.buttonMinus = (Button) convertView.findViewById(R.id.list_item_button_minus);
                viewHolder.buttonPlus = (Button) convertView.findViewById(R.id.list_item_button_plus);
                convertView.setTag(viewHolder);
            }
            mainViewHolder = (ViewHolder) convertView.getTag();
            mainViewHolder.buttonPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Button was clicked for list item " + position, Toast.LENGTH_SHORT).show();
                }
            });
            mainViewHolder.title.setText(getItem(position));
            return convertView;
        }
    }


    public class ViewHolder {
        View thumbnail;
        TextView title;
        TextView score;
        Button buttonMinus;
        Button buttonPlus;
    }


}
