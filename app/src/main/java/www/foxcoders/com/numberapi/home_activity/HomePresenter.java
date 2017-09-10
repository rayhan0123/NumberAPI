package www.foxcoders.com.numberapi.home_activity;

import android.content.Context;

import www.foxcoders.com.numberapi.data.HomeRepository;
import www.foxcoders.com.numberapi.data.ResponseResult;

/**
 * Created by Ray on 9/9/2017.
 */

public class HomePresenter implements HomeContract.DateAction, HomeContract.NumberAction, HomeContract.TriviaAction {

    private  Context context;
    private HomeContract.DateView dateView;
    private HomeContract.TriviaView triviaView;
    private HomeContract.NumberView numberView;

    public HomePresenter(Context context,  HomeContract.DateView dateView )
    {
        this.context=context;
        this.dateView=dateView;

    }
    public HomePresenter(Context context,  HomeContract.TriviaView triviaView )
    {
        this.context=context;
        this.triviaView=triviaView;

    }
    public HomePresenter(Context context,  HomeContract.NumberView numberView )
    {
        this.context=context;
        this.numberView=numberView;

    }

    private HomeRepository repository = new HomeRepository();

    @Override
    public void getDateData() {

        repository.getData("Date", new ResponseResult<Object>() {
            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onFailure(Object o) {

            }
        });
    }

    @Override
    public void getNumberDate() {
        repository.getData("Number", new ResponseResult<Object>() {
            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onFailure(Object o) {

            }
        });

    }

    @Override
    public void getTriviaDate() {
        repository.getData("Trivia", new ResponseResult<Object>() {
            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onFailure(Object o) {

            }
        });

    }
}
