package dio.web.api.models;

public class UserModel {

    private Integer id;
    private static int idCounter = 1;
    private String username;
    private String password;


    public UserModel (String username, String password) {
        this.id = idCounter++;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
