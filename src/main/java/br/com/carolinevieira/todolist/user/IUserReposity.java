package br.com.carolinevieira.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface IUserReposity extends JpaRepository<UserModel, UUID>{
	List<UserModel> findByUsername(String username);
	
}
