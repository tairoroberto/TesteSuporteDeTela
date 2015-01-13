package br.com.tairoroberto.testesuportedetela;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    private List<Line> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<Line>();
        list.add(new Line(R.drawable.amazon_web_service,"Amazon Web Service"));
        list.add(new Line(R.drawable.android,"Android"));
        list.add(new Line(R.drawable.apple,"Apple"));
        list.add(new Line(R.drawable.behance,"Behance"));
        list.add(new Line(R.drawable.deviantart,"Deviantart"));
        list.add(new Line(R.drawable.drupal,"Drupal"));
        list.add(new Line(R.drawable.facebook,"Facebook"));
        list.add(new Line(R.drawable.git,"Git"));
        list.add(new Line(R.drawable.reddit,"Reddit"));
        list.add(new Line(R.drawable.windows,"Windows"));
        list.add(new Line(R.drawable.you_tube,"You Tube"));

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter(this,list));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,list.get(position).getLabel(),Toast.LENGTH_SHORT).show();
            }
        });

        //Calculo de Densidades de Pixels
        float scale = getResources().getDisplayMetrics().density;
        int value = (int) (1 * scale + 0.5f);
        Log.i("Script","Valor de DP:" + value);
    }


}
