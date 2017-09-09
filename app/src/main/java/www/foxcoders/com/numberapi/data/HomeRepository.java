package www.foxcoders.com.numberapi.data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ray on 9/9/2017.
 */

public class HomeRepository   {
    public void getData(String dataType, final ResponseResult<Object> responseResult)
    {
        ApiServices.Factory.getService().getData(dataType).enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                if(response.isSuccessful())
                {
                    responseResult.onSuccess(response.body());
                }
                else responseResult.onFailure(response.headers().toString());


            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                responseResult.onFailure(t);
            }
        });
    }
}
