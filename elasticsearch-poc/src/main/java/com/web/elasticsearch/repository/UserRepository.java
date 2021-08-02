package com.web.elasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.web.elasticsearch.model.User;

public interface UserRepository extends ElasticsearchRepository<User, String>{

	List<User> findByFirstname(String firstName);

}
