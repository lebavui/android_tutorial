package vn.edu.hust.soict.vd1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int selectedIndex = getIntent().getExtras().getInt("INDEX");

        UserModel user = SharedData.getInstance().users.get(selectedIndex);

        ImageView imageAvatar = findViewById(R.id.image_avatar);
        TextView textTitle = findViewById(R.id.text_title);
        TextView textDescription = findViewById(R.id.text_description);

        imageAvatar.setImageResource(user.getAvatar());
        textTitle.setText(user.getUsername());
        textDescription.setText(user.getDescription());
    }
}
