package org.example.tvshow;

public class TvShow {
    private String showName;
    private int episodeCount;
    private String genre;

    //constructor
    public TvShow(String showName, int episodeCount, String genre) {
        this.showName = showName;
        this.episodeCount = episodeCount;
        this.genre = genre;

    }

    //getter for name
    public String getShowName() {
        return showName;
    }

    //getter for count
    public int getEpisodeCount() {
        return episodeCount;
    }

    //getter for genre
    public String getGenre() {
        return genre;
    }

    //string method
    @Override
    public String toString() {
        return "TV Show: " + getShowName() + ", Episodes: " + getEpisodeCount() + ", Genre: " + getGenre();

    }
}
