package AnythingForTest.LetsRevise.DBlogics.Servicelayer;

import AnythingForTest.LetsRevise.DBlogics.repo.User_Info;
import AnythingForTest.LetsRevise.DBlogics.repo.user_Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Using_Info {
    @Autowired
    user_Repo u;
    public void useIt(String s){
    List<User_Info> ui=u.findAllByEmail(s);
    for(User_Info i : ui){
        System.out.print(i.getEmail());
    }

    }
}
