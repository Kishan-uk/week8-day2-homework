package codeclan.com.classic_80s;

import java.io.Serializable;

/**
 * Created by user on 20/03/2018.
 */

public class Album implements Serializable{

    private String artist;
    private String title;
    private Integer year;

    public Album (String artist, String title, Integer year){
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public String getArtist(){
        return artist;
    }

    public String getTitle(){
        return title;
    }

    public Integer getYear(){
        return year;
    }

}
