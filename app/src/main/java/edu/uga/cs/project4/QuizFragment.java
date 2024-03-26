package edu.uga.cs.project4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class QuizFragment extends Fragment {
    private int queNumber;
    private static final String[] quizQuestions = {
            "What are the three countries that share borders with Brazil?",
            "Which country is located between Poland and Lithuania?",
            "Which Asian country shares its borders with Afghanistan, China, India, and Iran?",
            "Name the two countries that share a border with India to the east and west.",
            "Which country is bordered by the United States to the north and Guatemala to the south?",
            "What are the two countries that share borders with Canada?",
    };
    public QuizFragment() {
        // Required empty public constructor
    }

    public static QuizFragment newInstance(int queNumber) {
        QuizFragment fragment = new QuizFragment();
        Bundle args = new Bundle();
        args.putInt("queNumber", queNumber);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ///setContentView(R.layout.activity_quiz);

        if (getArguments() != null) {
            queNumber = getArguments().getInt("queNumber");
        }
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_quiz, container, false );
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState ) {
        //public void onActivityCreated(Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );

        TextView titleView = view.findViewById( R.id.titleView );
        //TextView highlightsView = view.findViewById( R.id.highlightsView );

        titleView.setText( quizQuestions[ queNumber ] );
        //highlightsView.setText( androidVersionsInfo[ versionNum ] );
    }
    public static int getQuestionNumber() {
        return quizQuestions.length;
    }

}