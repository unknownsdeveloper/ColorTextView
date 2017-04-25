package ankit.developer.unknowns.colortextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import loic.teillard.colortextview.ColorTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* ViewGroup layout = (ViewGroup)findViewById(R.id.activity_main);
        ColorTextView colorTextView = new ColorTextView(this);
        colorTextView.addTextColor("This is", Color.parseColor("#5D4037"));
        colorTextView.addTextColor("Text Color",Color.parseColor("#F4511E"));
        colorTextView.setSpaces(true);
        colorTextView.apply();
        layout.addView(colorTextView);*/
    }
}
