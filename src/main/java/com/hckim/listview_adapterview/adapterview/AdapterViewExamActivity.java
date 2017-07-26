package com.hckim.listview_adapterview.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.hckim.listview_adapterview.R;

public class AdapterViewExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view_exam);

        ListView listView = (ListView) findViewById(R.id.list_view); // (1) ListView 가져오기
    }
}
