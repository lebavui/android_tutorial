package vn.edu.hust.soict.vd1;

public class UserModel {

    private int userId;
    private String username;
    private String description;
    private int avatar;
    private boolean isSelected;

    public UserModel(int userId, String username, String description, int avatar) {
        this.userId = userId;
        this.username = username;
        this.description = description;
        this.avatar = avatar;
        this.isSelected = false;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
