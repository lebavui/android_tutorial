package vn.edu.hust.soict.vd1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_1);

        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_1) {
            EditText editText = findViewById(R.id.edit_text);
            String content = editText.getText().toString();
            content = content.toUpperCase();
            editText.setText(content);
        }
        else if (view.getId() == R.id.button_2) {
            textView.setText("Button 2");
        }
    }
}
