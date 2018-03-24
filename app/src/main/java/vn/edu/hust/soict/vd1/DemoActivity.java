package vn.edu.hust.soict.vd1;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DemoActivity extends Activity {

    List<UserModel> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        users = SharedData.getInstance().users;

        users.add(new UserModel(1, "User 1", "This is user 1", R.drawable.s1));
        users.add(new UserModel(2, "User 2", "This is user 2", R.drawable.s2));
        users.add(new UserModel(3, "User 3", "This is user 3", R.drawable.s3));
        users.add(new UserModel(4, "User 4", "This is user 4", R.drawable.s4));
        users.add(new UserModel(5, "User 5", "This is user 5", R.drawable.s5));
        users.add(new UserModel(6, "User 6", "This is user 6", R.drawable.s6));
        users.add(new UserModel(7, "User 7", "This is user 7", R.drawable.s7));
        users.add(new UserModel(8, "User 8", "This is user 8", R.drawable.s8));

        final CustomArrayAdapter adapter = new CustomArrayAdapter(this,
                R.layout.custom_view_3,
                users);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        findViewById(R.id.button_add_new).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                users.add(new UserModel(9, "User 9", "This is user 9", R.drawable.s9));
                users.add(new UserModel(10, "User 10", "This is user 10", R.drawable.s10));
                users.add(new UserModel(11, "User 11", "This is user 11", R.drawable.s11));
                users.add(new UserModel(12, "User 12", "This is user 12", R.drawable.s12));
                adapter.notifyDataSetChanged();
            }
        });

        findViewById(R.id.button_remove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = users.size() - 1; i >= 0; i--)
                    if (users.get(i).isSelected())
                        users.remove(i);
                adapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DemoActivity.this, DetailActivity.class);
                intent.putExtra("INDEX", i);
                startActivity(intent);
            }
        });
    }

}
