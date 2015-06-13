package com.blundell.udacityappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast currentToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_streamer_app_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popLaunchAppToast(getString(R.string.main_app_name_streamer));
                    }
                });
        findViewById(R.id.main_scores_app_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popLaunchAppToast(getString(R.string.main_app_name_scores));
                    }
                });

        findViewById(R.id.main_library_app_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popLaunchAppToast(getString(R.string.main_app_name_library));
                    }
                });

        findViewById(R.id.main_build_it_bigger_app_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popLaunchAppToast(getString(R.string.main_app_name_build_it_bigger));
                    }
                });

        findViewById(R.id.main_xyz_reader_app_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popLaunchAppToast(getString(R.string.main_app_name_xyz_reader));
                    }
                });

        findViewById(R.id.main_my_own_app_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popLaunchAppToast(getString(R.string.main_app_name_my_own));
                    }
                });
    }

    private void popLaunchAppToast(String appName) {
        popToast(getString(R.string.main_launch_app, appName));
    }

    private void popToast(String message) {
        if (currentToast != null) {
            currentToast.cancel();
        }
        currentToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        currentToast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            popToast("TODO");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
