package codeclan.com.classic_80s;

import java.util.ArrayList;

/**
 * Created by user on 20/03/2018.
 */

class ClassicAlbums {
    
    private ArrayList<Album> list;
    
    public ClassicAlbums() {
        list = new ArrayList<Album>();
        list.add(new Album("Depeche Mode", "101", 1989));
        list.add(new Album("Soft Cell", "Non-Stop Erotic Cabaret", 1981));
        list.add(new Album("Kraftwerk", "Electric Cafe", 1984));

    }

    public ArrayList<Album> getList() {
        return new ArrayList<Album>(list);
    }
}
