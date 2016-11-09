package com.example.clarinetmaster.testlistview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.clarinetmaster.testlistview.Adapters.listAdapter;

public class MainActivity extends AppCompatActivity{

    private ListView listView;
    private ListAdapter adapter;
    private final String[] dataset = {"Android", "iOS", "Windows", "Linux", "MacOS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        adapter = new listAdapter(this, R.layout.list_item, dataset);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = (String) parent.getItemAtPosition(position);
                dialog(s);
            }
        });

    }

    private void dialog(String msg){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Results");
        dialog.setMessage(msg);
        dialog.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}
