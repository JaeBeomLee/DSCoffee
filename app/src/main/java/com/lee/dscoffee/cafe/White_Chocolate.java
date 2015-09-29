package com.lee.dscoffee.cafe;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.lee.dscoffee.MainActivity;
import com.lee.dscoffee.R;

import static android.view.animation.AnimationUtils.loadInterpolator;

/**
 * Created by ijaebeom on 15. 4. 16..
 */
public class White_Chocolate extends Fragment {


    Context context;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        context = activity.getApplicationContext();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        float []oz = new float[]{10,13,13,13,0,12,12};
        float []price = new float[]{0,3200,0,0,4500,2800,3000};
        float []price30 = new float[7];
        for(int i = 0; i < price.length; i++){
            String temp =  String.format("%.2f",price[i]/4500);
            price30[i] = Float.parseFloat(temp) - 0.07f;
        }
        float widthSet = -0.07f;

        float []price30_2 = new float[7];
        for(int i = 0; i < price.length; i++){
            if(oz[i] ==0 || price[i] ==0){
                price30_2[i] = 0;
                continue;
            }
            String temp =  String.format("%.2f",price[i]/(oz[i]*10));
            price30_2[i] = Float.parseFloat(temp);
        }
        SQLiteDatabase db;
        ImageView coffee;
        TextView name;
        TextView imag;
        TextView imag2;
        TextView imag3;
        TextView imag4;
        TextView imag5;
        TextView imag6;
        TextView imag7;
        TranslateAnimation ani =null;
        TranslateAnimation ani2 = null;
        TranslateAnimation ani3 = null;
        TranslateAnimation ani4 = null;
        TranslateAnimation ani5 = null;
        TranslateAnimation ani6 = null;
        TranslateAnimation ani7 = null;

        View rootView = inflater.inflate(R.layout.coffee, container, false);

        int duration = 1000;
        int startOff = 1000;
        int animation = android.R.anim.accelerate_decelerate_interpolator;
        coffee = (ImageView)rootView.findViewById(R.id.imageView);
        name = (TextView)rootView.findViewById(R.id.textView);
        imag = (TextView)rootView.findViewById(R.id.ig);
        imag2 = (TextView)rootView.findViewById(R.id.ig2);
        imag3 = (TextView)rootView.findViewById(R.id.ig3);
        imag4 = (TextView)rootView.findViewById(R.id.ig4);
        imag5 = (TextView)rootView.findViewById(R.id.ig5);
        imag6 = (TextView)rootView.findViewById(R.id.ig6);
        imag7 = (TextView)rootView.findViewById(R.id.ig7);

        if(MainActivity.btn == 0) {
            TextView tv2;
            tv2 = (TextView)rootView.findViewById(R.id.textView2);
            tv2.setVisibility(TextView.GONE);
            coffee.setImageResource(R.drawable.white_chocolate);
            ani = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30[0]);
            ani2 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30[1]);
            ani3 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30[2]);
            ani4 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30[3]);
            ani5 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30[4]);
            ani6 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30[5]);
            ani7 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30[6]);
            imag.setText("Coffea "+Integer.toString(Math.round(price[0])) +"원");
            imag2.setText("Ediya "+Integer.toString(Math.round(price[1]))+"원");
            imag3.setText("Hans "+Integer.toString(Math.round(price[2]))+"원");
            imag4.setText("콩볶는 집 "+Integer.toString(Math.round(price[3]))+"원");
            imag5.setText("MyCoffee "+Integer.toString(Math.round(price[4]))+"원");
            imag6.setText("팬도로시 "+Integer.toString(Math.round(price[5]))+"원");
            imag7.setText("프라빈 "+Integer.toString(Math.round(price[6]))+"원");
        }else if(MainActivity.btn ==1){
            coffee.setImageResource(R.drawable.waterdrop_whitechocolate);
            ani = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30_2[0]/45.0f - 0.05f);
            ani2 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30_2[6]/45.0f - 0.05f);
            ani3 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30_2[2]/45.0f - 0.05f);
            ani4 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30_2[3]/45.0f - 0.05f);
            ani5 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30_2[4]/45.0f - 0.05f);
            ani6 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30_2[5]/45.0f - 0.05f);
            ani7 = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.01f,
                    Animation.RELATIVE_TO_PARENT, widthSet,
                    Animation.RELATIVE_TO_PARENT, price30_2[6]/45.0f - 0.05f);
            imag.setText("");
            imag2.setText("Ediya              "+Integer.toString(Math.round(price30_2[1]))+"원");
            imag3.setText("");
            imag4.setText("");
            imag5.setText("");
            imag6.setText("팬도로시 "+Integer.toString(Math.round(price30_2[5]))+"원");
            imag7.setText(", 프라빈");
        }

        name.setText("White Choloate");
        ani.setDuration(duration);
        ani.setInterpolator(loadInterpolator(context, animation));
        ani.setStartOffset(startOff);
        ani.setFillAfter(true);

        ani2.setDuration(duration);
        ani2.setInterpolator(loadInterpolator(context, animation));
        ani2.setStartOffset(startOff);
        ani2.setFillAfter(true);

        ani3.setDuration(duration);
        ani3.setInterpolator(loadInterpolator(context, animation));
        ani3.setStartOffset(startOff);
        ani3.setFillAfter(true);

        ani4.setDuration(duration);
        ani4.setInterpolator(loadInterpolator(context, animation));
        ani4.setStartOffset(startOff);
        ani4.setFillAfter(true);

        ani5.setDuration(duration);
        ani5.setInterpolator(loadInterpolator(context, animation));
        ani5.setStartOffset(startOff);
        ani5.setFillAfter(true);

        ani6.setDuration(duration);
        ani6.setInterpolator(loadInterpolator(context, animation));
        ani6.setStartOffset(startOff);
        ani6.setFillAfter(true);

        ani7.setDuration(duration);
        ani7.setInterpolator(loadInterpolator(context, animation));
        ani7.setStartOffset(startOff);
        ani7.setFillAfter(true);

        imag.startAnimation(ani);
        imag2.startAnimation(ani2);
        imag3.startAnimation(ani3);
        imag4.startAnimation(ani4);
        imag5.startAnimation(ani5);
        imag6.startAnimation(ani6);
        imag7.startAnimation(ani7);
        return rootView;
    }
}
