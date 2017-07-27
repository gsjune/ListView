package com.hckim.listview_adapterview.adapterview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hckim.listview_adapterview.R;

import java.util.List;

/**
 * Created by K on 2017-07-26.
 */

public class PeopleAdapter extends BaseAdapter { // (1) BaseAdapter를 상속받는다
    private final List<People> mData; // (4)' (4)의 결과
    private final Context mContext; // (8)''' (8)''의 결과

    public PeopleAdapter(Context context, List<People> data) { // (3) 데이터 받는 것도 만들어 줘야. 생성자로 Constructor. 괄호 안. // (8)' Context
        mContext = context; // (8)'' Create field 'mContext'
        mData = data; // (4) Create field 'mData'
    }

    // 데이터 갯수
   @Override // (2) BaseAdapter가 추상클래스. 정의 안된 메소드를 구현. Implement methods 결과
    public int getCount() {
//        return 0;
        return mData.size(); // (5)
    }

    // 몇 번째 position에 어떤 데이터가 있는지 알려 줘야 함
    @Override
    public Object getItem(int position) {
//        return null;
        return mData.get(position); // (6)
    }

    // 데이터베이스의 id
    @Override
    public long getItemId(int position) {
//        return 0;
        return position; // (7)
    }

    // position 번째의 레이아웃 완성해서 알려 줘야 함
    // convertView는 position 번째 레이아웃의 레퍼런스
    // parent는 이 어댑터가 붙을 부모의 레퍼런스(ListView, GridView)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder; // B(2)
        if (convertView == null) { // (8)
            // 최초
            // 레이아웃 가지고 오기 네 줄 -> Xml id 줘야
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_exam, parent, false);

            holder = new ViewHolder(); // B(3)

            ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);
            TextView nameTextView = (TextView) convertView.findViewById(R.id.name_text);
            TextView phoneTextView = (TextView) convertView.findViewById(R.id.phone_text);

            holder.image = imageView; // B(4) 세 가지를 viewHolder에 넣음
            holder.name = nameTextView;
            holder.phone = phoneTextView;

            convertView.setTag(holder); // B(5)

        } else {
            // 재사용
            holder = (ViewHolder) convertView.getTag(); // B(6)
        }

        // Data
        People people = (People) getItem(position);

        // 뿌리기
        holder.image.setImageResource(people.getPicture());
        holder.name.setText(people.getName());
        holder.phone.setText(people.getPhone());

//        return null;
        return convertView;
    }

    // class 안에 class static 붙이기. 앞에 private으로 막아도 됨
    static class ViewHolder { // B(1)
        ImageView image;
        TextView name;
        TextView phone;
    }
}
