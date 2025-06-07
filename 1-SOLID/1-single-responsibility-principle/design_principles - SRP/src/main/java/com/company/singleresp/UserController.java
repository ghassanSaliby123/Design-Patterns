package com.company.singleresp;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
    private UserPersistenceService userPersistenceService = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        User user = new User().getUserObjectFromResource(userJson);

        UserValidator validator = new UserValidator();
        boolean isValidUser =  validator.validateUser(user);
        if (!isValidUser){
            return "ERROR";
        }

        userPersistenceService.saveUser(user);
        
        return "SUCCESS";
    } 



}