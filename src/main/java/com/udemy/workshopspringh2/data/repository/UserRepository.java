package com.udemy.workshopspringh2.data.repository;

import com.udemy.workshopspringh2.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Component poderia ser colocado mas ele ja estende de componente do spring
public interface UserRepository extends JpaRepository<User, Long> {

}
