package www.foxcoders.com.numberapi.home_activity;

import www.foxcoders.com.numberapi.base.BaseView;

/**
 * Created by Ray on 9/9/2017.
 */

public interface HomeContract {

    interface DateAction {
        void getDateData();

    }

    interface DateView extends BaseView{

    }

    interface NumberAction {
        void getNumberDate();



    }

    interface NumberView extends BaseView{

    }

    interface TriviaAction {

        void getTriviaDate();

    }

    interface TriviaView extends BaseView{

    }
}
