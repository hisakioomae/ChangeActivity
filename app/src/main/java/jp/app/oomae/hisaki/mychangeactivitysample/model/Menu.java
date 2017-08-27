package jp.app.oomae.hisaki.mychangeactivitysample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hisaki on 2017/08/27.
 */

public class Menu {

    @SerializedName("recipe_title")
    public String recipe_title;
    @SerializedName("img_url")
    public String img_url;
    @SerializedName("description")
    public String description;

}
