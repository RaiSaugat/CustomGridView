package com.example.rai.customgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridV;
    int position;
    String[] title = new String[] {"A", "B", "C","D","E","F"};
    String[] desc = new String[] {"HEllo", "How Are You?", "Okay","OkayASDAD","OkayASDASDASD","Gashgasd"};
    int image[] = new int[] {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridV = (GridView)findViewById(R.id.gridView);
        CustomAdapter customAdapter = new CustomAdapter(this, title, desc, image);
        gridV.setAdapter(customAdapter);
    }
}
