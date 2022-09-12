package com.javamaster.service.impl;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamaster.dto.ModelLogin;
import com.javamaster.dto.ModelRegisterAccount;
import com.javamaster.entity.Account;
import com.javamaster.entity.User;
import com.javamaster.service.IAccountService;
import com.javamaster.service.IAuthService;
import com.javamaster.service.IUserService;

@Service
public class AuthServiceImpl implements IAuthService {

	@Autowired
	private IAccountService accountService;

	@Autowired
	private IUserService userService;

	@Override
	public int registerAccount(ModelRegisterAccount modelRegisterAccount)
			throws InterruptedException, ExecutionException {

		System.out.println(modelRegisterAccount.toString());

		User user = new User();
		user.setFullName(modelRegisterAccount.getFullName());
		user.setPhoneNumber(modelRegisterAccount.getPhoneNumber());

		user = userService.addUser(user);

		Account account = new Account();
		account.setPassword(modelRegisterAccount.getPassword());
		account.setPhoneNumber(modelRegisterAccount.getPhoneNumber());
		account.setUserId(user.getId());

		int result = accountService.createAccount(account);

		return result;
	}

	@Override
	public Account login(ModelLogin modelLogin) throws InterruptedException, ExecutionException {

		Account account = accountService.getAccountByPhoneNumber(modelLogin.getPhoneNumber());
		
		if(account.getPassword().equals(modelLogin.getPassword())) {
			return account;
		} else {
			return null;
		}

	}

}
