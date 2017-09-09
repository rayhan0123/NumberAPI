package www.foxcoders.com.numberapi.base;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Ray on 9/9/2017.
 */

public class BaseActivity extends AppCompatActivity {
    public void showSnackbar(View Conteiner, String s) {
        Snackbar mSnackbar = Snackbar.make(Conteiner, s, Snackbar.LENGTH_SHORT);
        mSnackbar.show();
    }
}
