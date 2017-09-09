package www.foxcoders.com.numberapi.home_activity;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import www.foxcoders.com.numberapi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DateFragment extends Fragment implements HomeContract.DateView {


    public DateFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_date, container, false);
    }

    @Override
    public void showError(Object o) {

    }
}
