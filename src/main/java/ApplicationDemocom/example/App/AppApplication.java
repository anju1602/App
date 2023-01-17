package ApplicationDemocom.example.App;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ApplicationDemocom.example.App.Entities.User;
import ApplicationDemocom.example.App.Repository.UserRepo;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(AppApplication.class, args);

		UserRepo repo=context.getBean(UserRepo.class);

		User user = new User();
		user.setId(12);
		user.setName("Anjali");
		user.setCity("Pune");
		user.setState("Maharashtra");

		User user1 = repo.save(user);
		System.out.println(user1);

	}

}
