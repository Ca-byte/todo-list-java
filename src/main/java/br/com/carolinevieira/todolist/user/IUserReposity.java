package br.com.carolinevieira.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserReposity extends JpaRepository<UserModel, UUID>{
	UserModel findByUsername(String username);
	
}
