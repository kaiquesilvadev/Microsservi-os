package com.kaique.hroauth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.kaique.hroauth.security.UserDetail;

@Component
@FeignClient(name = "hr-user" , path = "/users")
public interface UserFeignClient {

	
	@GetMapping(value = "/{id}")
	 ResponseEntity<UserDetail> findById(@PathVariable Long id);
	
	@GetMapping(value = "/search")
	public ResponseEntity<UserDetail> findByEmail(@RequestParam String email);
}
