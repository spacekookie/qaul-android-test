package net.qaul.qaulnet;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import net.qaul.qaulnet.views.FeedFragment;

public class MainActivity extends AppCompatActivity {
    FrameLayout frames;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        tabs = findViewById(R.id.qaul_tabs);

        TabLayout.Tab feed = tabs.newTab();
        feed.setText("Feed");
        feed.setIcon(R.drawable.ql_feed);
        tabs.addTab(feed);

        TabLayout.Tab msg = tabs.newTab();
        msg.setText("Messages");
        msg.setIcon(R.drawable.ql_private_message);
        tabs.addTab(msg);

        TabLayout.Tab files = tabs.newTab();
        files.setText("Files");
        files.setIcon(R.drawable.ql_filesharing);
        tabs.addTab(files);

        TabLayout.Tab call = tabs.newTab();
        call.setText("Users");
        call.setIcon(R.drawable.ql_users);
        tabs.addTab(call);

    }
}

////     /*    get the reference of FrameLayout and TabLayout
//        frames = (FrameLayout) findViewById(R.id.simpleFrameLayout);
//        tabs = (TabLayout) findViewById(R.id.simpleTabLayout);
//
////         Create a new Tab named "First"
//        TabLayout.Tab firstTab = tabs.newTab();
//        firstTab.setText("First"); // set the Text for the first Tab
//        firstTab.setIcon(R.drawable.ic_public_white_24dp); // set an icon for the
//        tabs.addTab(firstTab);
//
//        TabLayout.Tab secondTab = tabs.newTab();
//        secondTab.setText("Second");
//        secondTab.setIcon(R.drawable.ic_vpn_key_white_24dp);
//        tabs.addTab(secondTab);
//
//        TabLayout.Tab thirdTab = tabs.newTab();
//        thirdTab.setText("Third");
//        thirdTab.setIcon(R.drawable.ic_insert_drive_file_white_24dp);
//        tabs.addTab(thirdTab);
//
//        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//                // get the current selected tab's position and replace the fragment accordingly
//                Fragment fragment = null;
//                switch (tab.getPosition()) {
//                    case 0:
//                        fragment = new FeedFragment();
//                        break;
//                    case 1:
//                        fragment = new FeedFragment();
//                        break;
//                    case 2:
//                        fragment = new FeedFragment();
//                        break;
//                }
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.simpleFrameLayout, fragment);
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                ft.commit();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }
//}
//*/