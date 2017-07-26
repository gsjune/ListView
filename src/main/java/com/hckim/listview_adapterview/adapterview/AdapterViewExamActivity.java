package com.hckim.listview_adapterview.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hckim.listview_adapterview.R;

import java.util.ArrayList;

public class AdapterViewExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view_exam);

        // View
        ListView listView = (ListView) findViewById(R.id.list_view); // (1) ListView 가져오기

        // Data
        ArrayList<String> data = new ArrayList<>(); // (2)
        for (int i = 0; i < 100; i++) {
            data.add("데이터 " + i);
        }

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AdapterViewExamActivity.this,
                android.R.layout.simple_list_item_1, data); // (3) ArrayAdapter 잘 안쓰임

        listView.setAdapter(adapter); // (4)
    }
}
