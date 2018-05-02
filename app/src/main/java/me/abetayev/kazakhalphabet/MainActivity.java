package me.abetayev.kazakhalphabet;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView mRecyclerView;
    GridLayoutManager mLayoutManager;
    Parcelable mListState;
    ArrayList<Letters> mLetterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rview);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(MainActivity.this, 3);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mLetterList = new ArrayList<>();
        mLetterList.add(new Letters(R.drawable.a));
        mLetterList.add(new Letters(R.drawable.a2));
        mLetterList.add(new Letters(R.drawable.b));
        mLetterList.add(new Letters(R.drawable.v));
        mLetterList.add(new Letters(R.drawable.g));
        mLetterList.add(new Letters(R.drawable.g2));
        mLetterList.add(new Letters(R.drawable.d));
        mLetterList.add(new Letters(R.drawable.e));
        mLetterList.add(new Letters(R.drawable.e2));
        mLetterList.add(new Letters(R.drawable.zh));
        mLetterList.add(new Letters(R.drawable.z));
        mLetterList.add(new Letters(R.drawable.i));
        mLetterList.add(new Letters(R.drawable.i2));
        mLetterList.add(new Letters(R.drawable.k));
        mLetterList.add(new Letters(R.drawable.k2));
        mLetterList.add(new Letters(R.drawable.l));
        mLetterList.add(new Letters(R.drawable.m));
        mLetterList.add(new Letters(R.drawable.n));
        mLetterList.add(new Letters(R.drawable.n2));
        mLetterList.add(new Letters(R.drawable.o));
        mLetterList.add(new Letters(R.drawable.o2));
        mLetterList.add(new Letters(R.drawable.p));
        mLetterList.add(new Letters(R.drawable.r));
        mLetterList.add(new Letters(R.drawable.s));
        mLetterList.add(new Letters(R.drawable.t));

        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(mLetterList);
        myAdapter.setHasStableIds(true);
        mRecyclerView.setAdapter(myAdapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("ListState", mRecyclerView.getLayoutManager().onSaveInstanceState());
    }

    @Override
    public void onClick(View v) {

    }

    public void startActivity() {

    }
}
