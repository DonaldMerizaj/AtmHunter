package com.estcreative.atmhunter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.estcreative.atmhunter.R;
import com.estcreative.atmhunter.model.Bank;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by ie on 04/09/16.
 */
public class BankListRecyclerAdapter extends RecyclerView.Adapter<BankListRecyclerViewHolder> {


    ArrayList<Bank> mBanks;
    LayoutInflater mInlater;
    Context mContext;

    public BankListRecyclerAdapter(ArrayList<Bank> mBanks, Context mContext) {
        this.mBanks = mBanks;
        this.mContext = mContext;
        this.mInlater = LayoutInflater.from(mContext);
    }

    @Override
    public BankListRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = mInlater.inflate(R.layout.row_bank_list, parent, false);
        return new BankListRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BankListRecyclerViewHolder holder, int position) {

        holder.bind(mBanks.get(position), mContext);

    }

    @Override
    public int getItemCount() {
        return mBanks.size();
    }

    public ArrayList<Bank> getAll() {
        return mBanks;
    }
}
