package www.foxcoders.com.numberapi.home_activity;

import android.os.Bundle;

import www.foxcoders.com.numberapi.base.BaseActivity;
import www.foxcoders.com.numberapi.R;
import www.foxcoders.com.numberapi.base.BaseView;

public class HomeActivity extends BaseActivity implements BaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void showError(Object o) {

    }

}
