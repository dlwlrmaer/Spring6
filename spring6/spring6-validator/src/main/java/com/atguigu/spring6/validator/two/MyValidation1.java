package com.atguigu.spring6.validator.two;

import jakarta.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import java.util.Set;

@Service
public class MyValidation1 {
    @Autowired
    private Validator validator;

    public boolean validatorByUserOne(User user){
        return true;
    }
}
