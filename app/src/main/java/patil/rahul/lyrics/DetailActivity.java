package patil.rahul.lyrics;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DetailActivity extends AppCompatActivity {

    private TextView mLyricsView;

    private InputStream mInputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mLyricsView = findViewById(R.id.lyrics);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            String songName = intent.getExtras().getString("song_name");

            if (songName != null) {
                toolbar.setTitle(songName);
                switch (songName) {
                    case "Dusk Till Dawn ft. Sia":
                        setTitle(R.string.dusktilldown);
                        mInputStream = getBaseContext().getResources().openRawResource(R.raw.dusktilldown);
                        stringBuilder();
                        break;

                    case "Still Got Time ft. PartyNextDoor":
                        setTitle(R.string.partynextdoor);
                        mInputStream = getBaseContext().getResources().openRawResource(R.raw.partynextdoor);
                        stringBuilder();
                        break;

                    case "I Don't Wanna Live Forever ft. Taylor Swift":
                        setTitle(R.string.idwlf);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.idwlf);
                        stringBuilder();
                        break;

                    case "PillowTalk":
                        setTitle(R.string.pillowtalk);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.pillowtalk);
                        stringBuilder();
                        break;

                    case "Like I Would":
                        setTitle(R.string.likeiwould);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.likeiwould);
                        stringBuilder();
                        break;

                    case "BeFoUr":
                        setTitle(R.string.befour);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.befour);
                        stringBuilder();
                        break;
                    case "iT's YoU":
                        setTitle(R.string.itsyou);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.itsyou);
                        stringBuilder();
                        break;
                    case "dRuNk":
                        setTitle(R.string.drunk);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.drunk);
                        stringBuilder();
                        break;
                    case "She Don't Love Me":
                        setTitle(R.string.shedontloveme);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.shedontloveme);
                        stringBuilder();
                        break;
                    case "Snakehips - Cruel ft. Zayn":
                        setTitle(R.string.cruel);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.cruel);
                        stringBuilder();
                        break;
                    case "Mine of mine(Intro)":
                        setTitle(R.string.minofmine);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.mindofmine);
                        stringBuilder();
                        break;
                    case "lUcOzAdE":
                        setTitle(R.string.lucozade);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.lucozade);
                        stringBuilder();
                        break;
                    case "Do Something Good":
                        setTitle(R.string.dosomethinggood);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.dosomethinggood);
                        stringBuilder();
                        break;
                    case "sHe":
                        setTitle(R.string.she);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.she);
                        stringBuilder();
                        break;
                    case "FOoL fOr YoU":
                        setTitle(R.string.foolforyou);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.foolforyou);
                        stringBuilder();
                        break;
                    case "Wrong ft. Kehlani":
                        setTitle(R.string.wrong);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.wrong);
                        stringBuilder();
                        break;
                    case "rEaR vIeW":
                        setTitle(R.string.rearview);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.rearview);
                        stringBuilder();
                        break;
                    case "TiO":
                        setTitle(R.string.tio);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.tio);
                        stringBuilder();
                        break;
                    case "Who":
                        setTitle(R.string.who);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.who);
                        stringBuilder();
                        break;
                    case "fLoWer":
                        setTitle(R.string.flower);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.flower);
                        stringBuilder();
                        break;
                    case "BoRdErZ":
                        setTitle(R.string.borderez);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.borderez);
                        stringBuilder();
                        break;
                    case "Golden":
                        setTitle(R.string.golden);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.golden);
                        stringBuilder();
                        break;
                    case "Bright":
                        setTitle(R.string.bright);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.bright);
                        stringBuilder();
                        break;
                    case "I won't mind":
                        setTitle(R.string.iwontmind);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.iwontmind);
                        stringBuilder();
                        break;
                    case "Blue":
                        setTitle(R.string.blue);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.blue);
                        stringBuilder();
                        break;
                    case "tRuTh":
                        setTitle(R.string.truth);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.truth);
                        stringBuilder();
                        break;

                    case "Back to Life":
                        setTitle(R.string.backtolife);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.backtolife);
                        stringBuilder();
                        break;
                    case "Fingers":
                        setTitle(R.string.fingers);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.finger);
                        stringBuilder();
                        break;
                    case "Flight of the Stars":
                        setTitle(R.string.flightfthestars);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.flightofthestars);
                        stringBuilder();
                        break;
                    case "Good Guy":
                        setTitle(R.string.goodguy);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.goodguy);
                        stringBuilder();
                        break;
                    case "Good Years":
                        setTitle(R.string.goodyears);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.goodyears);
                        stringBuilder();
                        break;
                    case "Icarus Interlude":
                        setTitle(R.string.icarusinterlude);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.icarusinterlude);
                        stringBuilder();
                        break;
                    case "If I Got You":
                        setTitle(R.string.ifigotyou);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.ifigotyou);
                        stringBuilder();
                        break;
                    case "Imprint":
                        setTitle(R.string.imprint);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.imprint);
                        stringBuilder();
                        break;
                    case "Insomnia":
                        setTitle(R.string.insomnia);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.insomnia);
                        stringBuilder();
                        break;
                    case "Let Me":
                        setTitle(R.string.letme);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.letme);
                        stringBuilder();
                        break;
                    case "Natural":
                        setTitle(R.string.natural);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.natural);
                        stringBuilder();
                        break;
                    case "Rainberry":
                        setTitle(R.string.rainberry);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.rainberry);
                        stringBuilder();
                        break;
                    case "Satisfaction":
                        setTitle(R.string.satisfaction);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.satisfaction);
                        stringBuilder();
                        break;
                    case "Scripted":
                        setTitle(R.string.scripted);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.scripted);
                        stringBuilder();
                        break;
                    case "Sour Diesel":
                        setTitle(R.string.sourdiesel);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.sourdiesel);
                        stringBuilder();
                        break;
                    case "Stand Still":
                        setTitle(R.string.standstill);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.standstill);
                        stringBuilder();
                        break;
                    case "There you are":
                        setTitle(R.string.thereyouare);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.thereyouare);
                        stringBuilder();
                        break;
                    case "Tonight":
                        setTitle(R.string.tonight);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.tonight);
                        stringBuilder();
                        break;
                    case "Too Much":
                        setTitle(R.string.toomuch);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.toomuch);
                        stringBuilder();
                        break;
                    case "Better":
                        setTitle(R.string.better);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.better);
                        stringBuilder();
                        break;
                    case "Calamity":
                        setTitle(R.string.calamity);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.calamity);
                        stringBuilder();
                        break;
                    case "Connexion":
                        setTitle(R.string.connexion);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.connexion);
                        stringBuilder();
                        break;
                    case "When Love's Around":
                        setTitle(R.string.whenlovesaround);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.lovesaround);
                        stringBuilder();
                        break;
                    case "Outside":
                        setTitle(R.string.outside);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.outside);
                        stringBuilder();
                        break;
                    case "River Road":
                        setTitle(R.string.riverroad);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.riverroad);
                        stringBuilder();
                        break;
                    case "Sweat":
                        setTitle(R.string.sweat);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.sweat);
                        stringBuilder();
                        break;
                    case "Tightrope":
                        setTitle(R.string.tightrope);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.tightrope);
                        stringBuilder();
                        break;
                    case "Unfuckwitable":
                        setTitle(R.string.unfuckwitable);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.unfuckwitable);
                        stringBuilder();
                        break;
                    case "Vibez":
                        setTitle(R.string.vibez);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.vibez);
                        stringBuilder();
                        break;
                    case "Windowsill":
                        setTitle(R.string.windowsill);
                        mInputStream = getApplicationContext().getResources().openRawResource(R.raw.windowsill);
                        stringBuilder();
                        break;

                }
            }
        }
    }

    public void stringBuilder() {
        InputStreamReader reader = new InputStreamReader(mInputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
            String lyrics = stringBuilder.toString();
            mLyricsView.setText(lyrics);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}