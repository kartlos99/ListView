package diakonidze.kartlos.task2_2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import diakonidze.kartlos.task2_2.model.Cars;


public class newactivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diteilspage);

        Cars currcar = (Cars) getIntent().getExtras().getSerializable("pos");

        TextView tt = (TextView) findViewById(R.id.tname);
        ImageView sur = (ImageView) findViewById(R.id.imageView2);
        TextView ttname = (TextView) findViewById(R.id.name);

        Picasso.with(this)
                .load(currcar.getImig())
                .resize(750, 400)
                .centerInside()
                .into(sur);



        ttname.setText(currcar.getMarka()+" "+currcar.getModeli());
        tt.setText(currcar.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_newactivity, menu);
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
