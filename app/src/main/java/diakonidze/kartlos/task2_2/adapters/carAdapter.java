package diakonidze.kartlos.task2_2.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import diakonidze.kartlos.task2_2.R;
import diakonidze.kartlos.task2_2.model.Cars;

/**
 * Created by kartlos on 6/12/2015.
 */
public class carAdapter extends BaseAdapter {

    private ArrayList<Cars> data;
    private LayoutInflater inflater;
    private Context context;

    public carAdapter(Context context, ArrayList<Cars> data) {
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
    }

    @Override
    public int getCount() {
        return this.data.size();
    }

    @Override
    public Object getItem(int position) {
        return this.data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemtoshow;
        Viewholder viewhold;

        String Backcolor = "#c1eeee";


        if(convertView == null) {
            itemtoshow = inflater.inflate(R.layout.new_activity, null);
            viewhold = new Viewholder();

            viewhold.marka = (TextView) itemtoshow.findViewById(R.id.textmarka);
            viewhold.year = (TextView) itemtoshow.findViewById(R.id.textyear);
            viewhold.owner = (TextView) itemtoshow.findViewById(R.id.textowner);
            viewhold.cost = (TextView) itemtoshow.findViewById(R.id.textcost);

            viewhold.imig =  (ImageView) itemtoshow.findViewById(R.id.imageView);
            //ImageView imige1 = (ImageView) itemtoshow.findViewById(R.id.imageView);

            itemtoshow.setTag(viewhold);

        }else{
            itemtoshow = convertView;
            viewhold = (Viewholder) itemtoshow.getTag();
            itemtoshow.setBackgroundColor(Color.parseColor(Backcolor));
        }

        Cars car1 = (Cars) getItem(position);

        viewhold.marka.setText(car1.getMarka() + " " + car1.getModeli());
        viewhold.year.setText( "year " + car1.getYear() );
        viewhold.owner.setText(car1.getOwner());
        viewhold.cost.setText(car1.getCost() + "$");

        Picasso.with(context)
                .load(car1.getImig())
                .resize(200,200)
                .centerInside()
                .into(viewhold.imig);



        return itemtoshow;
    }

    private class Viewholder {
        TextView marka, year, owner, cost;
        ImageView imig;
    }
}
