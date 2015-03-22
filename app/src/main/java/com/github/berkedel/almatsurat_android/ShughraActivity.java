package com.github.berkedel.almatsurat_android;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.github.berkedel.almatsurat_android.content.AlBaqarah1to5;
import com.github.berkedel.almatsurat_android.content.AlFatihah1to7;
import com.github.berkedel.almatsurat_android.ui.FragmentNavigationDrawer;

/**
 * Created by hadi on 3/22/15.
 */
public class ShughraActivity extends ActionBarActivity {
    private FragmentNavigationDrawer dlDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shughra_activity);

        // Set a Toolbar to replace the ActionBar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find our drawer view
        dlDrawer = (FragmentNavigationDrawer) findViewById(R.id.drawer_layout);
        // Setup drawer view
        dlDrawer.setupDrawerConfiguration((ListView) findViewById(R.id.lvDrawer), toolbar,
                R.layout.drawer_nav_item, R.id.flContent);
        // Add nav items
        dlDrawer.addNavItem("Al-Fatihah (1-7)", R.mipmap.ic_01, "Al-Fatihah (1-7)", AlFatihah1to7.class);
        dlDrawer.addNavItem("Al-Baqarah (1-5)", R.mipmap.ic_02, "Al-Baqarah (1-5)", AlBaqarah1to5.class);
//        dlDrawer.addNavItem("Al-Baqarah (255-257)", R.mipmap.ic_03, "Al-Baqarah (255-257)", AlBaqarah255to257.class);
//        dlDrawer.addNavItem("Al-Baqarah (284-286)", R.mipmap.ic_04, "Al-Baqarah (284-286)", AlBaqarah284to286.class);
        // Select default
        if (savedInstanceState == null) {
            dlDrawer.selectDrawerItem(0);
        }
    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content
        if (dlDrawer.isDrawerOpen()) {
            // Uncomment to hide menu items
            // menu.findItem(R.id.mi_test).setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        // Uncomment to inflate menu items to Action Bar
        // inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        // ActionBarDrawerToggle will take care of this.
        if (dlDrawer.getDrawerToggle().onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        dlDrawer.getDrawerToggle().syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        dlDrawer.getDrawerToggle().onConfigurationChanged(newConfig);
    }
}
