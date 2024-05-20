package com.ashwath.aspectprogramming.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountsController {

	@Autowired
	AccountsService accountsService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/getAccount", produces = MediaType.APPLICATION_JSON_VALUE)
	@LogExecutionTime
	public Accounts getAccount() throws InterruptedException {
		Thread.sleep(2000);
		return accountsService.getAccount();
	}

	@GetMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
	public Accounts getAccounts() {
		return restTemplate.getForObject("http://localhost:8081/getAccount", Accounts.class);
	}
}
