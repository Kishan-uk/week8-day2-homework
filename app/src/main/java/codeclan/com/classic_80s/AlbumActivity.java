package codeclan.com.classic_80s;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by user on 20/03/2018.
 */

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Intent intent = getIntent();
        Album selectedAlbum = (Album) intent.getSerializableExtra("album");
        Log.d("AlbumActivity", selectedAlbum.getTitle());
    }

}
