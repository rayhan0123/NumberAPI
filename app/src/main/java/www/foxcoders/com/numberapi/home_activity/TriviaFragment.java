package www.foxcoders.com.numberapi.home_activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import www.foxcoders.com.numberapi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TriviaFragment extends Fragment implements HomeContract.TriviaView {


    public TriviaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trivia, container, false);
    }

    @Override
    public void showError(Object o) {

    }
}
