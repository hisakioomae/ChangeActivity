package jp.app.oomae.hisaki.mychangeactivitysample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hisaki on 2017/08/27.
 */

public class Recipe {

    @SerializedName("img_url")
    public String img_url;
    @SerializedName("recipe_title")
    public String recipe_title;
    @SerializedName("time")
    public String time;

}
