package com.example.android.iak;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static com.example.android.iak.DetailActivity.INTENT_DETAIL;

public class RecyclerviewAdapter extends RecyclerView.Adapter <RecyclerviewAdapter.RecyclerviewViewHolder> {

    private List<NewsPojo> list;


    @Override
    public RecyclerviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerviewViewHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_recyclerview, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(RecyclerviewViewHolder holder, int position) {
        holder.bind(list.get(position));

    }

    public void  setData (List<NewsPojo> list) {
        this.list = list;
        Log.d("Recyclerview", "getItemCount: "+this.list.get(1).getLink_gambar());
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        Log.d("Recyclerview", "getItemCount: "+list.size());
        return list.size();
    }

    public class RecyclerviewViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_image;
        private TextView tv_title;

        public RecyclerviewViewHolder(View itemView) {
            super(itemView);

            iv_image = itemView.findViewById(R.id.iv_image);
            tv_title = itemView.findViewById(R.id.tv_title);
        }

        public void bind(final NewsPojo newsPojo) {
            tv_title.setText(newsPojo.getTitle());
            Picasso.with(itemView.getContext())
                    .load(newsPojo.getLink_gambar())
                    .into(iv_image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra(DetailActivity.INTENT_DETAIL, newsPojo.getDetail());
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
