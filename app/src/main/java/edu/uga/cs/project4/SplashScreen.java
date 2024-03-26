package edu.uga.cs.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }
        public void navigateTo(View view) {
            // Intent to start MainActivity (which will host your CountriesListFragment)
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            // Finish this activity so it's removed from the back stack
            finish();
        }

}