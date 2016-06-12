package com.akashungarala.simpletodo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static String FIREBASE_ENDPOINT, FRAGMENT_TAG_LIST, FRAGMENT_TAG_ADD, FRAGMENT_TAG_DETAIL;
    static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    ArrayList<Task> tasks = new ArrayList<>();
    Toolbar toolbar;
    Task selectedTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FIREBASE_ENDPOINT = getResources().getString(R.string.firebase_url);
        FRAGMENT_TAG_LIST = getResources().getString(R.string.fragment_tag_list);
        FRAGMENT_TAG_ADD = getResources().getString(R.string.fragment_tag_add);
        FRAGMENT_TAG_DETAIL = getResources().getString(R.string.fragment_tag_detail);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.logo_mdpi);
        goToListFragment();
    }
    public void removeTask() {
        Firebase.setAndroidContext(this);
        Firebase fbRef = new Firebase(MainActivity.FIREBASE_ENDPOINT);
        fbRef.child("tasks").child(selectedTask.getName()).removeValue();
        selectedTask = null;
        goToListFragment();
    }
    public void goToListFragment() {
        getFragmentManager().
                beginTransaction().
                replace(R.id.fragment_container, new com.akashungarala.simpletodo.ListFragment(), FRAGMENT_TAG_LIST).
                addToBackStack(null).
                commit();
    }
    public void goToAddFragment() {
        getFragmentManager().
                beginTransaction().
                replace(R.id.fragment_container, new AddFragment(), FRAGMENT_TAG_ADD).
                addToBackStack(null).
                commit();
    }
    public void goToAddFragment(ArrayList<Task> tasks) {
        this.tasks = tasks;
        getFragmentManager().
                beginTransaction().
                replace(R.id.fragment_container, new AddFragment(), FRAGMENT_TAG_ADD).
                addToBackStack(null).
                commit();
    }
    public void goToDetailFragment(Task task) {
        selectedTask = task;
        getFragmentManager().
                beginTransaction().
                replace(R.id.fragment_container, new DetailFragment(), FRAGMENT_TAG_DETAIL).
                addToBackStack(null).
                commit();
    }
    @Override
    public void onBackPressed() {
        if(getFragmentManager().getBackStackEntryCount() > 0)
            getFragmentManager().popBackStack();
        else
            super.onBackPressed();
    }
}