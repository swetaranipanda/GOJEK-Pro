package golife.com.gojek.activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import golife.com.gojek.R;
import golife.com.gojek.utils.AppUtils;


/**
 * Created by Girish on 06/12/2017.
 */
public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {


    private Context context;
    private ArrayList<String> dayList;
    private ArrayList<String> tempList;

    public WeatherAdapter(Context context, ArrayList<String> days, ArrayList<String> temps) {
        this.context = context;
        dayList = days;
        tempList = temps;

    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        WeatherViewHolder rcv;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_frag, null);

        rcv = new WeatherViewHolder(layoutView, context);

        return rcv;
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

        holder.tempTextView.setText(tempList.get(position) +" C");
        holder.dayTextView.setText(AppUtils.convertDateToDay(dayList.get(position)));
        holder.getView().setTag(position);

    }


    @Override
    public int getItemCount() {

        return this.dayList.size();


    }


}