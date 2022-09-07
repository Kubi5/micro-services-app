package com.comarch.microservices.customers.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Security {

    public static final String EMAIL_REGEX = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
            +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
            +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    public static String hashPassword(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
