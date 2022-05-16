package diakonidze.kartlos.task2_2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import diakonidze.kartlos.task2_2.adapters.carAdapter;
import diakonidze.kartlos.task2_2.model.Cars;


public class MainActivity extends ActionBarActivity {

    // it's too old
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Cars> datalist = initadapter();

        carAdapter adapteri = new carAdapter(this, datalist);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapteri);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), datalist.get(position).toString(), Toast.LENGTH_LONG).show();

                Intent detailpage = new Intent(getApplicationContext(), newactivity.class);

                Cars detailcar = (Cars) parent.getAdapter().getItem(position);

                detailpage.putExtra("pos", detailcar );

                startActivity(detailpage);

            }
        });

    }


    private ArrayList<Cars> initadapter(){

        ArrayList<Cars> carlist = new ArrayList<>();


        for(int i=0; i<7; i++){
            carlist.add(new Cars("mers", "E klass", "petre", "899121212", "ise ra", "shavi", 1980+i, 10000+i*145, i+55000, "http://cyprus-mail.com/wp-content/uploads/2013/06/story.jpg"));
            carlist.add(new Cars("Toyota", "Corsa", "petre", "899121212", "ise ra", "shavi", 1980+i, 10000+i*145, i+55000, "http://pictures.topspeed.com/IMG/crop/201011/toyota-supra_800x0w.jpg"));
            carlist.add(new Cars("Lamborghini", "Diablo", "roberto", "899xxxxxx", "kargi", "shavi", 2001+i, 99000+i*145, i+55000, "http://fireballtim.com/wp-content/uploads/2014/03/Lamborghini-Rat-Rod-2.jpg"));
        }


        return carlist;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
