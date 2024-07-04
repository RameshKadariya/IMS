package com.example.rahulsir_app1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.rahulsir_app1.LoginPage;
import com.example.rahulsir_app1.R;
import com.example.rahulsir_app1.singup;

public class List_Page extends AppCompatActivity {
    ListView listview;

    String[] List_of_Data = {"Nepal", "India", "pakistan", "Bhutan", "KTM", "Chitwan",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_page);

        listview = findViewById(R.id.list);

        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this, androidx
                .appcompat.R.layout.support_simple_spinner_dropdown_item,List_of_Data);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if (i == 0) {
                    Intent intent1 = new Intent(getApplicationContext(), LoginPage.class);
                    startActivity(intent1);
                    Toast.makeText(List_Page.this, "click on nepal", Toast.LENGTH_SHORT).show();
                }else if(i==1){
                    Intent intent2= new Intent(getApplicationContext(), singup.class);
                    startActivity(intent2);
                }
                else if(i==2){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.puthon.org/"));
                    startActivity(intent);
                }
            }
        });
    }

}