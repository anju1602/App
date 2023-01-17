package ApplicationDemocom.example.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ApplicationDemocom.example.App.Entities.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
