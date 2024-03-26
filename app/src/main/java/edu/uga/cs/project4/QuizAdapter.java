package edu.uga.cs.project4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
<<<<<<< HEAD
=======
import androidx.fragment.app.FragmentActivity;
>>>>>>> 86a07a8 (Initial commit)
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class QuizAdapter extends FragmentStateAdapter {
    public QuizAdapter(
<<<<<<< HEAD
            FragementManager fragementManager, Lifecycle lifecycle){
        super(fragementManager,lifecycle);
    }
    @Override
    public Fragment createFragment(int position){
        return Quiz
                .newInstance( position );
    }
=======
            FragmentManager fragmentManager, Lifecycle lifecycle){
        super(fragmentManager,lifecycle);
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
>>>>>>> 86a07a8 (Initial commit)
}
