package com.thedeveloperworldisyours.omdb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by javierg on 08/08/16.
 */
public class Episode {

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Released")
    @Expose
    private String released;
    @SerializedName("Episode")
    @Expose
    private String episode;
    @SerializedName("imdbRating")
    @Expose
    private String imdbRating;
    @SerializedName("imdbID")
    @Expose
    private String imdbID;

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The released
     */
    public String getReleased() {
        return released;
    }

    /**
     *
     * @param released
     * The Released
     */
    public void setReleased(String released) {
        this.released = released;
    }

    /**
     *
     * @return
     * The episode
     */
    public String getEpisode() {
        return episode;
    }

    /**
     *
     * @param episode
     * The Episode
     */
    public void setEpisode(String episode) {
        this.episode = episode;
    }

    /**
     *
     * @return
     * The imdbRating
     */
    public String getImdbRating() {
        return imdbRating;
    }

    /**
     *
     * @param imdbRating
     * The imdbRating
     */
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    /**
     *
     * @return
     * The imdbID
     */
    public String getImdbID() {
        return imdbID;
    }

    /**
     *
     * @param imdbID
     * The imdbID
     */
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

}
