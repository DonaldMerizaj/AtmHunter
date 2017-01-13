package com.estcreative.atmhunter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.estcreative.atmhunter.R;
import com.estcreative.atmhunter.model.Atm;
import com.estcreative.atmhunter.model.Bank;
import com.squareup.picasso.Picasso;

/**
 * Created by ie on 04/09/16.
 */
public class AtmListRecyclerViewHolder extends RecyclerView.ViewHolder {


    TextView  address;

    public AtmListRecyclerViewHolder(View itemView) {
        super(itemView);

        address = (TextView) itemView.findViewById(R.id.atm_address);
    }

    public void bind(Atm atm, Context mContext)
    {

        address.setText(atm.getAddress());


    }


}
