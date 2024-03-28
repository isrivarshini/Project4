package edu.uga.cs.project4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class QuizAdapter extends FragmentStateAdapter {
    public QuizAdapter(
            FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position){
        return QuizFragment
                .newInstance( position );
    }
    @Override
    public int getItemCount() {
        return QuizFragment
                .getQuestionNumber();
    }
}
