package codeclan.com.classic_80s;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/03/2018.
 */

class ClassicAlbumsAdapter extends ArrayAdapter<Album> {

    public ClassicAlbumsAdapter(Context context, ArrayList<Album> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        Album currentAlbum = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);
        }

        TextView artist = listItemView.findViewById(R.id.artist);
        artist.setText(currentAlbum.getArtist().toString());

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentAlbum.getTitle().toString());

        TextView year = listItemView.findViewById(R.id.year);
        year.setText(currentAlbum.getYear().toString());

        listItemView.setTag(currentAlbum);

        return listItemView;
    }
}
