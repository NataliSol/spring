package com.example.todolist.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DeveloperInfoServiceImpl implements DeveloperInfoService{
    @Value("${app.developer}")
    private String appDeveloper;

    @Override
    public String getAppInfo() {
        return  "This app create: " + appDeveloper;
    }
}

