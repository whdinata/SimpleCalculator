package com.komit.simplecalculator;

import android.content.Context;
import android.widget.LinearLayout;

import org.androidannotations.annotations.EViewGroup;

/**
 * Created by whdinata on 09/02/2018.
 */

@EViewGroup(R.layout.view_calculator)
public class CalculatorView extends LinearLayout {
    public CalculatorView(Context context) {
        super(context);
    }


}
