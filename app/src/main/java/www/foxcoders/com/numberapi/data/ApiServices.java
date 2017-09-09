package www.foxcoders.com.numberapi.data;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Ray on 9/9/2017.
 */


public interface ApiServices {
    String BASE_URL = "http://numbersapi.com";

    @GET("/random/{dataType}?json")
    Call<Quote> getData(@Path("dataType") String dataType);

    class Factory {
        private static ApiServices service;

        public static ApiServices getService() {
            OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .readTimeout(20, TimeUnit.SECONDS)
                    .writeTimeout(20, TimeUnit.SECONDS)
                    .build();

            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder().
                        addConverterFactory(GsonConverterFactory.create())
                        .addConverterFactory(ScalarsConverterFactory.create())
                        .client(okHttpClient)
                        .baseUrl(BASE_URL).build();
                service = retrofit.create(ApiServices.class);

                return service;
            } else return service;


        }


    }
}




