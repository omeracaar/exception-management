package com.omeracar.exception_management.controller.impl;

import com.omeracar.exception_management.model.RootEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBaseController {

    public <T>RootEntity<T> ok(T data){
        return RootEntity.ok(data);
    }

    public <T>RootEntity<T> error(String errorMessage){
        return RootEntity.error(errorMessage);
    }

}
