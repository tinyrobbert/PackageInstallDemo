package com.example.cienet.packageinstalldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by cienet on 5/5/16.
 */
public class MainActivity extends Activity {
    private Button mInstallButton,mUpgradeButton,mUninstallButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mInstallButton = (Button)findViewById(R.id.btn_install);
        mUpgradeButton = (Button)findViewById(R.id.btn_upgrade);
        mUninstallButton = (Button)findViewById(R.id.btn_uninstall);
        mInstallButton.setOnClickListener(onClickListener);
        mUpgradeButton.setOnClickListener(onClickListener);
        mUninstallButton.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_install:

                    break;
                case R.id.btn_upgrade:
                    break;
                case R.id.btn_uninstall:
                    break;
            }
        }
    };
}
