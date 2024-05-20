package com.ashwath.aspectprogramming.accounts;

import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements AccountsService{
	@Override
	public Accounts getAccount() {
		return new Accounts("1234", "$200");
	}
}
