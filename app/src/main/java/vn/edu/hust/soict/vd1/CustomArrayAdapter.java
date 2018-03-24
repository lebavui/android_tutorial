package vn.edu.hust.soict.vd1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<UserModel> {

    private Context context;
    private int resource;
    private List<UserModel> users;

    public CustomArrayAdapter(@NonNull Context context, int resource, @NonNull List<UserModel> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.users = objects;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View view = inflater.inflate(resource, null);

        ImageView imageAvatar = view.findViewById(R.id.image_avatar);
        TextView textTitle = view.findViewById(R.id.text_title);
        TextView textDescription = view.findViewById(R.id.text_description);
        final CheckBox checkBox = view.findViewById(R.id.check_box);

        final UserModel user = users.get(position);

        imageAvatar.setImageResource(user.getAvatar());
        textTitle.setText(user.getUsername());
        textDescription.setText(user.getDescription());

        if (user.isSelected())
            checkBox.setChecked(true);
        else
            checkBox.setChecked(false);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked())
                    user.setSelected(true);
                else
                    user.setSelected(false);
                notifyDataSetChanged();
            }
        });

        return view;
    }
}
