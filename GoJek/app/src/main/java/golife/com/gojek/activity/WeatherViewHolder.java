package golife.com.gojek.activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import golife.com.gojek.R;
import golife.com.gojek.view.RobotoRegularTextView;

/**
 * Created by Girish on 07/12/2017.
 */
public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    private Context context;
    public RobotoRegularTextView dayTextView, tempTextView;


    public WeatherViewHolder(View itemView, Context context) {
        super(itemView);
        itemView.setOnClickListener(this);
        this.context = context;
        dayTextView = itemView.findViewById(R.id.day_tv);
        tempTextView = itemView.findViewById(R.id.temp_tv);
    }


    public View getView() {
        return this.itemView;
    }

    @Override
    public void onClick(View view) {


    }

}

