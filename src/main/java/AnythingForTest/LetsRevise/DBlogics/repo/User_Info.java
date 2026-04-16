package AnythingForTest.LetsRevise.DBlogics.repo;

import org.springframework.data.annotation.Id;

public class User_Info {

    @Id
    String user_name;
String email;


    public User_Info(String users_Statement, String user_name) {
        email = users_Statement;
        this.user_name = user_name;
    }

    public String getUsers_Statement() {
        return email;
    }

    public void setUsers_Statement(String users_Statement) {
        email = users_Statement;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
