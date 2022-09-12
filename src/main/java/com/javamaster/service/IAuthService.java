package com.javamaster.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.javamaster.dto.ModelLogin;
import com.javamaster.dto.ModelRegisterAccount;
import com.javamaster.entity.Account;

@Service
public interface IAuthService {
	int registerAccount(ModelRegisterAccount modelRegisterAccount) throws InterruptedException, ExecutionException;
	Account login(ModelLogin modelLogin) throws InterruptedException, ExecutionException;
}
