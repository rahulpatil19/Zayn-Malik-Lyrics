package patil.rahul.lyrics;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by rahul on 26/9/17.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    List<Integer> mSong;

    private OnSongClick mSongClick;

    public interface OnSongClick{
        void onClick(int position);
    }

    public SongAdapter(OnSongClick songClick, List<Integer> song){
        mSong = song;
        mSongClick = songClick;
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        boolean shouldImmediatelyAttachToParent = false;

        int layoutIdForItem = R.layout.list_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForItem, parent, shouldImmediatelyAttachToParent);

        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {

       int pos =  mSong.get(position);
        holder.mSongTextView.setText(pos);
    }

    @Override
    public int getItemCount() {
        return mSong.size();
    }

    class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mSongTextView;
        public SongViewHolder(View itemView) {
            super(itemView);
            mSongTextView = itemView.findViewById(R.id.song_text);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int itemClick = getAdapterPosition();
            mSongClick.onClick(itemClick);
        }
    }
}
