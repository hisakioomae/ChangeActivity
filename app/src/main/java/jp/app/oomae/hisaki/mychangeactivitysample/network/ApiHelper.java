package jp.app.oomae.hisaki.mychangeactivitysample.network;

import android.view.Menu;

import jp.app.oomae.hisaki.mychangeactivitysample.model.Question;
import jp.app.oomae.hisaki.mychangeactivitysample.model.Recipe;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiHelper {

    // TODO: APIのドメイン設定

    @GET("question/")// TODO: APIのpathを設定
    Call<Question> question();

    @GET("recipe/")// TODO: APIのpathを設定
    Call<Recipe> recipe(@Query("tag") String tag);

    @GET("menu/")// TODO: APIのpathを設定
    Call<Menu> menu(@Query("menu") String tag);

}
