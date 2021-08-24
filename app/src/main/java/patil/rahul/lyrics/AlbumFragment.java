package patil.rahul.lyrics;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AlbumFragment extends Fragment implements AlbumAdapter.OnSongClick {

    
    private List<String> songList = new ArrayList<>();

    private AlbumAdapter albumAdapter;

    public static AlbumFragment newInstance(int tabPosition){
        AlbumFragment albumFragment = new AlbumFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("tab_position", tabPosition);
        albumFragment.setArguments(bundle);
        return albumFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Bundle bundle = getArguments();
        
        if (bundle != null){
            int position = bundle.getInt("tab_position");
            populateList(position);
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_album, container, false);

        RecyclerView albumRecyclerView = view.findViewById(R.id.list_album);
        albumAdapter = new AlbumAdapter(this, songList);

        albumRecyclerView.setHasFixedSize(true);

        albumRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(requireContext()));

        albumRecyclerView.setAdapter(albumAdapter);
        albumAdapter.mSong = songList;

        return view;
    }

    private void populateList(int position){
        switch (position){
            case 0: 
                populateNobodyIsListening();
                break;
                
            case 1:
                populateIcarusFalls();
                break;
                
            case 2:
                populateMindOfMind();
                break;
        }
    }

    private void populateIcarusFalls(){
        songList.add(getString(R.string.backtolife));
        songList.add(getString(R.string.fingers));
        songList.add(getString(R.string.flightfthestars));
        songList.add(getString(R.string.goodguy));
        songList.add(getString(R.string.goodyears));
        songList.add(getString(R.string.icarusinterlude));
        songList.add(getString(R.string.ifigotyou));
        songList.add(getString(R.string.imprint));
        songList.add(getString(R.string.insomnia));
        songList.add(getString(R.string.letme));
        songList.add(getString(R.string.natural));
        songList.add(getString(R.string.rainberry));
        songList.add(getString(R.string.satisfaction));
        songList.add(getString(R.string.scripted));
        songList.add(getString(R.string.sourdiesel));
        songList.add(getString(R.string.standstill));
        songList.add(getString(R.string.thereyouare));
        songList.add(getString(R.string.tonight));
        songList.add(getString(R.string.toomuch));
    }

    private void populateNobodyIsListening(){
        songList.add(getString(R.string.better));
        songList.add(getString(R.string.calamity));
        songList.add(getString(R.string.connexion));
        songList.add(getString(R.string.whenlovesaround));
        songList.add(getString(R.string.outside));
        songList.add(getString(R.string.riverroad));
        songList.add(getString(R.string.sweat));
        songList.add(getString(R.string.tightrope));
        songList.add(getString(R.string.unfuckwitable));
        songList.add(getString(R.string.vibez));
        songList.add(getString(R.string.windowsill));
    }

    private void populateMindOfMind(){
        songList.add(getString(R.string.dusktilldown));
        songList.add(getString(R.string.partynextdoor));
        songList.add(getString(R.string.idwlf));
        songList.add(getString(R.string.pillowtalk));
        songList.add(getString(R.string.likeiwould));
        songList.add(getString(R.string.befour));
        songList.add(getString(R.string.itsyou));
        songList.add(getString(R.string.drunk));
        songList.add(getString(R.string.shedontloveme));
        songList.add(getString(R.string.cruel));
        songList.add(getString(R.string.minofmine));
        songList.add(getString(R.string.lucozade));
        songList.add(getString(R.string.dosomethinggood));
        songList.add(getString(R.string.she));
        songList.add(getString(R.string.foolforyou));
        songList.add(getString(R.string.wrong));
        songList.add(getString(R.string.rearview));
        songList.add(getString(R.string.tio));
        songList.add(getString(R.string.who));
        songList.add(getString(R.string.flower));
        songList.add(getString(R.string.borderez));
        songList.add(getString(R.string.golden));
        songList.add(getString(R.string.bright));
        songList.add(getString(R.string.iwontmind));
        songList.add(getString(R.string.blue));
        songList.add(getString(R.string.truth));
    }

    @Override
    public void onClick(String songName) {
        Intent intent = new Intent(requireContext(), DetailActivity.class);
        intent.putExtra("song_name", songName);
        startActivity(intent);
    }
}
