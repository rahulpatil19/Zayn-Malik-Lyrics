package patil.rahul.lyrics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by rahul on 26/9/17.
 */

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.SongViewHolder> {

    List<String> mSong;

    private OnSongClick mSongClick;

    public interface OnSongClick{
        void onClick(String songName);
    }

    public AlbumAdapter(OnSongClick songClick, List<String> song){
        mSong = song;
        mSongClick = songClick;
    }

    @NonNull
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
        String albumName = mSong.get(position);
        holder.mSongTextView.setText(albumName);
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
            String clickedItem = mSong.get(getAdapterPosition());
            mSongClick.onClick(clickedItem);
        }
    }
}
