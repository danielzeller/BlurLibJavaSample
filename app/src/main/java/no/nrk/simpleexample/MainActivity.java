package no.nrk.simpleexample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import no.danielzeller.blurbehindlib.BlurBehindLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View viewBehindTheBlurView = findViewById(R.id.im_behind_the_blurred_view);
        BlurBehindLayout blurView = findViewById(R.id.blurBehindLayout);

        blurView.setViewBehind(viewBehindTheBlurView);
    }
}
