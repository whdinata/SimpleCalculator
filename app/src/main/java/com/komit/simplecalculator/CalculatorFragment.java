package com.komit.simplecalculator;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by whdinata on 09/02/2018.
 */

@EFragment(R.layout.fragment_calculator)
public class CalculatorFragment extends Fragment {

    @ViewById
    KeypadView keypad;

    @ViewById
    TextView number;

    @AfterViews
    void afterViews(){
        keypad.setOnAddClickListener(new KeypadView.OnKeypadClickListener() {
            @Override
            public void onAddClick() {

            }

            @Override
            public void onNumberClick(int num) {
                number.setText(Integer.toString(num));
            }
        });
    }
}
