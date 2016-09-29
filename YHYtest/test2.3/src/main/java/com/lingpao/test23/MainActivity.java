package com.lingpao.test23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;
    Switch Switcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        toggle = (ToggleButton)findViewById(R.id.toggle);
        Switcher = (Switch)findViewById(R.id.switcher);
        final LinearLayout test = (LinearLayout)findViewById(R.id.test);
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    test.setOrientation(1);
                    toggle.setChecked(true);
                    Switcher.setChecked(true);
                }
                else
                {
                    test.setOrientation(0);
                    toggle.setChecked(false);
                    Switcher.setChecked(false);
                }

            }
        };
        toggle.setOnCheckedChangeListener(listener);
        Switcher.setOnCheckedChangeListener(listener);
    }
}
