package patil.rahul.lyrics;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ShareCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<String> tabList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabList.add("Nobody is Listening");
        tabList.add("Icarus Falls");
        tabList.add("Mind of Mine");

        ViewPager2 viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        LyricsPagerAdapter lyricsPagerAdapter = new LyricsPagerAdapter(this);

        viewPager.setAdapter(lyricsPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) ->
                tab.setText(tabList.get(position))
        ).attach();

       // MobileAds.initialize(this, "ca-app-pub-3203412101337273~6540217882");

     /*   mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);*/
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


    void shareIt() {
        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=patil.rahul.lyrics");
        String mimeType = "text/plain";
        String title = "Share with/via";
        String textToShare = "Checkout Zayn Malik lyrics app on Google Play Store. Download it today from " + uri;

        ShareCompat.IntentBuilder builder = new ShareCompat.IntentBuilder(MainActivity.this);
        builder.setType(mimeType).setChooserTitle(title).setText(textToShare).startChooser();
    }

    static class LyricsPagerAdapter extends FragmentStateAdapter{

        public LyricsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return AlbumFragment.newInstance(position);
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}
