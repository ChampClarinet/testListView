package com.example.clarinetmaster.testlistview.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.clarinetmaster.testlistview.R;

public class listAdapter extends ArrayAdapter<String>{

    private Context context;
    private int resId;
    private String[] dataSet;

    public listAdapter(Context context,int resId, String[] dataSet) {
        super(context, resId, dataSet);
        this.context = context;
        this.resId = resId;
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemLayout = convertView;

        if(itemLayout == null) itemLayout = View.inflate(context, resId, null);

        TextView name = (TextView) itemLayout.findViewById(R.id.text);
        String s = dataSet[position];
        name.setText(s);

        return itemLayout;
    }
}
