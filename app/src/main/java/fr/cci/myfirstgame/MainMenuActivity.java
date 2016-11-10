package fr.cci.myfirstgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onProfileClick(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
