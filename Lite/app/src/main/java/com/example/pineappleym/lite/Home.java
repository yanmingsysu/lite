package com.example.pineappleym.lite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pineappleym.lite.YanMing.ExchangeRate.Exchange;
import com.example.pineappleym.lite.YanMing.Logistics.Logistics;
import com.example.pineappleym.lite.YanMing.Translate.Translate;
import com.example.pineappleym.lite.YangMiao.ColorPick.ColorPick;
import com.example.pineappleym.lite.YangMiao.QRcode.QRcode;
import com.example.pineappleym.lite.YangMiao.WorldTime.WorldTime;
import com.example.pineappleym.lite.ZhangKuiHan.randomActivity;
import com.example.pineappleym.lite.ZhangKuiHan.southActivity;
import com.example.pineappleym.lite.ZhangKuiHan.transformActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void to_translate(View view){
        Intent intent = new Intent();
        intent.setClass(this,Translate.class);
        startActivity(intent);
    }
    public void to_logistics(View view){
        Intent intent = new Intent();
        intent.setClass(this,Logistics.class);
        startActivity(intent);
    }
    public void to_exchange(View view){
        Intent intent = new Intent();
        intent.setClass(this,Exchange.class);
        startActivity(intent);
    }

    public void to_south(View view) {
        Intent intent = new Intent();
        intent.setClass(this,southActivity.class);
        startActivity(intent);
    }

    public void to_random(View view) {
        Intent intent = new Intent();
        intent.setClass(this,randomActivity.class);
        startActivity(intent);
    }

    public void to_transform(View view) {
        Intent intent = new Intent();
        intent.setClass(this,transformActivity.class);
        startActivity(intent);
    }
    public void to_QRcode(View view) {
        Intent intent = new Intent();
        intent.setClass(this,QRcode.class);
        startActivity(intent);
    }
    public void to_timeChange(View view) {
        Intent intent = new Intent();
        intent.setClass(this,WorldTime.class);
        startActivity(intent);
    }
    public void to_colorPick(View view) {
        Intent intent = new Intent();
        intent.setClass(this,ColorPick.class);
        startActivity(intent);
    }
}
