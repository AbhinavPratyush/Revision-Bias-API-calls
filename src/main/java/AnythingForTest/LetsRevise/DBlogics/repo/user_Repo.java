package AnythingForTest.LetsRevise.DBlogics.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface user_Repo extends MongoRepository<User_Info,String> {
    @Override
    List<User_Info> findAllById(Iterable<String> strings);
}
