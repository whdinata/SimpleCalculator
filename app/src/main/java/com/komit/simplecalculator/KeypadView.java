package com.komit.simplecalculator;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;

/**
 * Created by whdinata on 09/02/2018.
 */

@EViewGroup(R.layout.view_keypad)
public class KeypadView extends LinearLayout {

    private StringBuffer number = new StringBuffer();
    private OnKeypadClickListener keypadClickListener;

    public KeypadView(Context context) {
        super(context);
    }

    public KeypadView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @AfterViews
    void afterViews(){
        setOrientation(VERTICAL);
    }

    private void append(char c){
        number.append(c);
        keypadClickListener.onNumberClick(Integer.parseInt(number.toString()));
    }

    @Click
    void btn0Clicked(){
        append('0');
    }

    @Click
    void btn1Clicked(){
        append('1');
    }

    @Click
    void btn2Clicked(){
        append('2');
    }

    @Click
    void btn3Clicked(){
        append('3');
    }

    @Click
    void btn4Clicked(){
        append('4');
    }

    @Click
    void btn5Clicked(){
        append('5');
    }

    @Click
    void btn6Clicked(){
        append('6');
    }

    @Click
    void btn7Clicked(){
        append('7');
    }

    @Click
    void btn8Clicked(){
        append('8');
    }

    @Click
    void btn9Clicked(){
        append('9');
    }

    @Click
    void btnCClicked(){
        reset();
    }

    @Click
    void btnAddClicked(){
        keypadClickListener.onAddClick();
        reset();
    }

    private void reset(){
        number.delete(0, number.length());
        append('0');
    }

    public void setOnAddClickListener(OnKeypadClickListener listener){
        keypadClickListener = listener;
    }

    public interface OnKeypadClickListener {
        void onAddClick();
        void onNumberClick(int number);
    }
}
