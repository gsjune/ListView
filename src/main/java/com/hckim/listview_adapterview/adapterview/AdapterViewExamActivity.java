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
//        ArrayList<String> data = new ArrayList<>(); // (2)
//        for (int i = 0; i < 100; i++) {
//            data.add("데이터 " + i);
//        }

        ArrayList<People> data = new ArrayList<>(); // B(1) People로 바꾼 후 변화
        for (int i = 0; i < 100; i++) {
            int picture;
            if (i % 2 == 0) {
                picture = R.drawable.federer;
            } else {
                picture = R.mipmap.ic_launcher;
            }
            People people = new People("아무개 " + i, "전화번호 " + i, picture);
            data.add(people);
        }

        // Adapter
        ArrayAdapter<People> adapter = new ArrayAdapter<People>(AdapterViewExamActivity.this,
                android.R.layout.simple_list_item_1, data); // (3) ArrayAdapter 잘 안쓰임 B(2) 이렇게 하는 거 아님. 다시 만들어야

        listView.setAdapter(adapter); // (4)
    }
}
