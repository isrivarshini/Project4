package edu.uga.cs.project4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.security.PrivateKey;

public class Quiz extends Fragment {
    private int queNumber;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        if (getArguments() != null) {
            queNumber = getArguments().getInt("versionNum");
        }
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_quiz, container, false );
    }

    public static Quiz newInstance(int queNum) {
        Quiz fragment = new Quiz();
        Bundle args = new Bundle();
        args.putInt("questionNum", queNum);
        fragment.setArguments(args);
        return fragment;
    }

    private void setArguments(Bundle args) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_quiz, container, false);
    }
}