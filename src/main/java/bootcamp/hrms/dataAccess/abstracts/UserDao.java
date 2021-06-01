package bootcamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bootcamp.hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
