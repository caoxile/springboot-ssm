package com.company.project.auth.service;

import com.company.project.auth.model.User;

/**
 * @Package com.company.project.common.core.auth
 * @Description
 * @Project spring-boot-ssm
 * @Author caoxile
 * @Create 2018-07-24
 */
public interface LoginService {

    void login(String username, String password) ;

    User getInfo();

    void logout();
}
