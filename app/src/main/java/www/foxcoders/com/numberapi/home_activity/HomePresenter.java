package www.foxcoders.com.numberapi.home_activity;

import www.foxcoders.com.numberapi.data.HomeRepository;
import www.foxcoders.com.numberapi.data.ResponseResult;

/**
 * Created by Ray on 9/9/2017.
 */

public class HomePresenter implements  HomeContract.DateAction, HomeContract.NumberAction, HomeContract.TriviaAction {
    HomeRepository repository=new HomeRepository();
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
