package patil.rahul.lyrics;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DetailActivity extends AppCompatActivity {

    private TextView mLyricsView;

    private TextView mTitleView;

    private InputStream mInputStream;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mAdView = (AdView) findViewById(R.id.adView1);

        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);

        mTitleView = findViewById(R.id.title);

        mLyricsView = findViewById(R.id.lyrics);

        Intent intent = getIntent();
        int currentPosition = intent.getExtras().getInt("position");


        switch (currentPosition) {
            case 0:
                mTitleView.setText(R.string.dusktilldown);
                mInputStream = getBaseContext().getResources().openRawResource(R.raw.dusktilldown);
                stringBuilder();
                break;

            case 1:
                mTitleView.setText(R.string.partynextdoor);
                mInputStream = getBaseContext().getResources().openRawResource(R.raw.partynextdoor);
                stringBuilder();
                break;

            case 2:
                mTitleView.setText(R.string.idwlf);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.idwlf);
                stringBuilder();
                break;
            case 3:
                mTitleView.setText(R.string.pillowtalk);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.pillowtalk);
                stringBuilder();
                break;
            case 4:
                mTitleView.setText(R.string.likeiwould);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.likeiwould);
                stringBuilder();
                break;
            case 5:
                mTitleView.setText(R.string.befour);
               mInputStream = getApplicationContext().getResources().openRawResource(R.raw.befour);
                stringBuilder();
                break;
            case 6:
                mTitleView.setText(R.string.itsyou);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.itsyou);
                stringBuilder();
                break;
            case 7:
                mTitleView.setText(R.string.drunk);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.drunk);
                stringBuilder();
                break;
            case 8:
                mTitleView.setText(R.string.shedontloveme);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.shedontloveme);
                stringBuilder();
                break;
            case 9:
                mTitleView.setText(R.string.cruel);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.cruel);
                stringBuilder();
                break;
            case 10:
                mTitleView.setText(R.string.minofmine);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.mindofmine);
                stringBuilder();
                break;
            case 11:
                mTitleView.setText(R.string.lucozade);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.lucozade);
                stringBuilder();
                break;
            case 12:
                mTitleView.setText(R.string.dosomethinggood);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.dosomethinggood);
                stringBuilder();
                break;
            case 13:
                mTitleView.setText(R.string.she);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.she);
                stringBuilder();
                break;
            case 14:
                mTitleView.setText(R.string.foolforyou);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.foolforyou);
                stringBuilder();
                break;
            case 15:
                mTitleView.setText(R.string.wrong);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.wrong);
                stringBuilder();
                break;
            case 16:
                mTitleView.setText(R.string.rearview);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.rearview);
                stringBuilder();
                break;
            case 17:
                mTitleView.setText(R.string.tio);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.tio);
                stringBuilder();
                break;
            case 18:
                mTitleView.setText(R.string.who);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.who);
                stringBuilder();
                break;
            case 19:
                mTitleView.setText(R.string.flower);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.flower);
                stringBuilder();
                break;
            case 20:
                mTitleView.setText(R.string.borderez);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.borderez);
                stringBuilder();
                break;
            case 21:
                mTitleView.setText(R.string.golden);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.golden);
                stringBuilder();
                break;
            case 22:
                mTitleView.setText(R.string.bright);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.bright);
                stringBuilder();
                break;
            case 23:
                mTitleView.setText(R.string.iwontmind);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.iwontmind);
                stringBuilder();
                break;
            case 24:
                mTitleView.setText(R.string.blue);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.blue);
                stringBuilder();
                break;
            case 25:
                mTitleView.setText(R.string.truth);
                mInputStream = getApplicationContext().getResources().openRawResource(R.raw.truth);
                stringBuilder();
                break;
        }
    }

    public void stringBuilder() {
        InputStreamReader reader = new InputStreamReader(mInputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
            String lyrics = stringBuilder.toString();
            mLyricsView.setText(lyrics);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}