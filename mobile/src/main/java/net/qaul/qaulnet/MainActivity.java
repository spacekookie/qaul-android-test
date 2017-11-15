package net.qaul.qaulnet;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mikepenz.materialdrawer.DrawerBuilder;

import net.qaul.qaulnet.views.Pager;


public class MainActivity extends AppCompatActivity  implements TabLayout.OnTabSelectedListener {
    ViewPager pager;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.qaul_views);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        tabs = findViewById(R.id.qaul_tabs);

        TabLayout.Tab feed = tabs.newTab();
        feed.setText("Feed");
        feed.setIcon(R.drawable.ql_feed);
        tabs.addTab(feed);

        TabLayout.Tab news = tabs.newTab();
        news.setText("News");
        news.setIcon(R.drawable.ql_notification);
        tabs.addTab(news);

        TabLayout.Tab files = tabs.newTab();
        files.setText("Files");
        files.setIcon(R.drawable.ql_filesharing);
        tabs.addTab(files);

        TabLayout.Tab call = tabs.newTab();
        call.setText("Users");
        call.setIcon(R.drawable.ql_users);
        tabs.addTab(call);

        Pager adapter = new Pager(getSupportFragmentManager(), tabs.getTabCount());
        pager.setAdapter(adapter);
        tabs.addOnTabSelectedListener(this);
//        tabs.setupWithViewPager(pager);

        /* Create an application drawer */
        new DrawerBuilder().withActivity(this)
            .withToolbar(myToolbar)
            .withActionBarDrawerToggle(true)
            .build();
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        pager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


}
