package com.thedeveloperworldisyours.omdb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javierg on 08/08/16.
 */
public class Movie {

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Season")
    @Expose
    private String season;
    @SerializedName("totalSeasons")
    @Expose
    private String totalSeasons;
    @SerializedName("Episodes")
    @Expose
    private List<Episode> episodes = new ArrayList<Episode>();
    @SerializedName("MovieInterceptor")
    @Expose
    private String response;

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
     * The season
     */
    public String getSeason() {
        return season;
    }

    /**
     *
     * @param season
     * The Season
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     *
     * @return
     * The totalSeasons
     */
    public String getTotalSeasons() {
        return totalSeasons;
    }

    /**
     *
     * @param totalSeasons
     * The totalSeasons
     */
    public void setTotalSeasons(String totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    /**
     *
     * @return
     * The episodes
     */
    public List<Episode> getEpisodes() {
        return episodes;
    }

    /**
     *
     * @param episodes
     * The Episodes
     */
    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    /**
     *
     * @return
     * The response
     */
    public String getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The MovieInterceptor
     */
    public void setResponse(String response) {
        this.response = response;
    }

}
