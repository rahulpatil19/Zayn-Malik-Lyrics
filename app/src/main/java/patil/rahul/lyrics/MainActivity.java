package patil.rahul.lyrics;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SongAdapter.OnSongClick {


    private RecyclerView mRecyclerView;

    private SongAdapter mAdapter;

    private static final String SONG_LIST = "songs";

    private List<Integer> mTitle;

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, "ca-app-pub-3203412101337273~6540217882");

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);

        if (savedInstanceState != null){
           mTitle = savedInstanceState.getIntegerArrayList(SONG_LIST);
        }

        mRecyclerView = findViewById(R.id.recyclerview);

        mTitle = new ArrayList<>();

        mTitle.add(R.string.dusktilldown);
        mTitle.add(R.string.partynextdoor);
        mTitle.add(R.string.idwlf);
        mTitle.add(R.string.pillowtalk);
        mTitle.add(R.string.likeiwould);
        mTitle.add(R.string.befour);
        mTitle.add(R.string.itsyou);
        mTitle.add(R.string.drunk);
        mTitle.add(R.string.shedontloveme);
        mTitle.add(R.string.cruel);
        mTitle.add(R.string.minofmine);
        mTitle.add(R.string.lucozade);
        mTitle.add(R.string.dosomethinggood);
        mTitle.add(R.string.she);
        mTitle.add(R.string.foolforyou);
        mTitle.add(R.string.wrong);
        mTitle.add(R.string.rearview);
        mTitle.add(R.string.tio);
        mTitle.add(R.string.who);
        mTitle.add(R.string.flower);
        mTitle.add(R.string.borderez);
        mTitle.add(R.string.golden);
        mTitle.add(R.string.bright);
        mTitle.add(R.string.iwontmind);
        mTitle.add(R.string.blue);
        mTitle.add(R.string.truth);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));

        mAdapter = new SongAdapter(this, mTitle);

        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putIntegerArrayList(SONG_LIST, (ArrayList<Integer>) mTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_download){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=patil.rahul.lyricsonedirection"));
            startActivity(intent);
        }
        else if (item.getItemId() == R.id.action_share) {
            shareIt();
        }
        else if (item.getItemId() == R.id.action_rate) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=patil.rahul.lyrics"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        if (mAdView != null){
            mAdView.destroy();
        }
        super.onDestroy();
    }

    void shareIt() {
        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=patil.rahul.lyrics");
        String mimeType = "text/plain";
        String title = "Share with/via";
        String textToShare = "Checkout Zayn Malik lyrics app on Google Play Store. Download it today from " + uri;

        ShareCompat.IntentBuilder.from(MainActivity.this)
                .setType(mimeType)
                .setChooserTitle(title)
                .setText(textToShare).startChooser();
    }
}
