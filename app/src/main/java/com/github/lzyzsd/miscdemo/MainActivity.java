package com.github.lzyzsd.miscdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cpuBusyButton = (Button) findViewById(R.id.btn_cpu_busy);
        cpuBusyButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cpu_busy:
                makeCpuBusy();
                break;
        }
    }

    private void makeCpuBusy() {
        Integer sum = 0;
        for(int i = 0; i < 10000; i++) {
            System.out.println("-----"+i);
            sum += i;
        }
        System.out.println("sum: " + sum);
    }
}
