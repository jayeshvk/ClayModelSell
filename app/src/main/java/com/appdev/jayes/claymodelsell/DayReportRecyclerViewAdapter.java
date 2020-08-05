package com.appdev.jayes.claymodelsell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DayReportRecyclerViewAdapter extends RecyclerView.Adapter<DayReportRecyclerViewAdapter.viewHolder> {

    private List<DayReportItems> itemsList;

    public class viewHolder extends RecyclerView.ViewHolder {
        public TextView name, receiptNo, balance, price;
        private CheckBox cashSale, creditSale, cashPurchase, creditPurchase, expenses, financeItem;

        public viewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            receiptNo = itemView.findViewById(R.id.receiptNo);
            balance = itemView.findViewById(R.id.balance);
            price = itemView.findViewById(R.id.price);
        }

    }

    public DayReportRecyclerViewAdapter(List<DayReportItems> itemlList) {
        this.itemsList = itemlList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.date_report_list_item, parent, false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        DayReportItems item = itemsList.get(position);
        holder.name.setText(item.getName());
        if (item.getReceiptNo() != null) {
            holder.receiptNo.setText(item.getReceiptNo());
            holder.name.setText(item.getName());
            holder.price.setText(item.getPrice());
            holder.balance.setText(item.getBalance());
        }
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

}
