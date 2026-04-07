package AnythingForTest.LetsRevise.repo;

import org.springframework.data.annotation.Id;

public class User_Info {

    @Id
    String user_name;
String Users_Statement;

    public User_Info(String users_Statement, String user_name) {
        Users_Statement = users_Statement;
        this.user_name = user_name;
    }

    public String getUsers_Statement() {
        return Users_Statement;
    }

    public void setUsers_Statement(String users_Statement) {
        Users_Statement = users_Statement;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
