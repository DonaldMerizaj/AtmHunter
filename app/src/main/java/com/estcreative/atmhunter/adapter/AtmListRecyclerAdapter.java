package com.estcreative.atmhunter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.estcreative.atmhunter.R;
import com.estcreative.atmhunter.model.Atm;
import com.estcreative.atmhunter.model.Atm;

import java.util.ArrayList;

/**
 * Created by ie on 04/09/16.
 */
public class AtmListRecyclerAdapter extends RecyclerView.Adapter<AtmListRecyclerViewHolder> {


    ArrayList<Atm> mAtms;
    LayoutInflater mInlater;
    Context mContext;

    public AtmListRecyclerAdapter(ArrayList<Atm> mAtms, Context mContext) {
        this.mAtms = mAtms;
        this.mContext = mContext;
        this.mInlater = LayoutInflater.from(mContext);
    }

    @Override
    public AtmListRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = mInlater.inflate(R.layout.row_atm_list, parent, false);
        return new AtmListRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AtmListRecyclerViewHolder holder, int position) {

        holder.bind(mAtms.get(position), mContext);

    }

    @Override
    public int getItemCount() {
        return mAtms.size();
    }

    public ArrayList<Atm> getAll() {
        return mAtms;
    }
}
