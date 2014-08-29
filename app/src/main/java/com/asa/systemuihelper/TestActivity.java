package com.asa.systemuihelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.asa.android.systemuihelper.SystemUiHelper;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.btn_show)
    public void onShowClicked(){
        SystemUiHelper helper = new SystemUiHelper(this, SystemUiHelper.LEVEL_IMMERSIVE, 0);
        helper.show();
    }

    @OnClick(R.id.btn_hide)
    public void onHideClicked(){
        SystemUiHelper helper = new SystemUiHelper(this, SystemUiHelper.LEVEL_IMMERSIVE, 0);
        helper.hide();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
