package edu.uga.cs.project4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class QuizAdapter extends FragmentStateAdapter {
    public QuizAdapter(
            FragementManager fragementManager, Lifecycle lifecycle){
        super(fragementManager,lifecycle);
    }
    @Override
    public Fragment createFragment(int position){
        return Quiz
                .newInstance( position );
    }
}
