package vn.edu.hust.soict.vd1;

import java.util.ArrayList;
import java.util.List;

class SharedData {
    private static final SharedData ourInstance = new SharedData();

    static SharedData getInstance() {
        return ourInstance;
    }

    List<UserModel> users;

    private SharedData() {
        users = new ArrayList<>();
    }
}
