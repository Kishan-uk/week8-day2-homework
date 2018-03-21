package codeclan.com.classic_80s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClassicAlbums classicAlbums = new ClassicAlbums();
        ArrayList<Album> list = classicAlbums.getList();

        ClassicAlbumsAdapter classicAlbumsAdapter = new ClassicAlbumsAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(classicAlbumsAdapter);
    }

    public void onListItemClick(View listItem) {
        Album selectedAlbum = (Album) listItem.getTag();

        Log.d("MainActivity", selectedAlbum.getTitle());

        Intent intent= new Intent(this, AlbumActivity.class);
        intent.putExtra("album", selectedAlbum);

        startActivity(intent);

    }
}
