package com.example.todolist.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service //про нього буде далі, поки просто ставимо
public class AppInfoServiceImpl implements AppInfoService {

    @Value("${app.message}")
    private String appMessage;

    @Value("${app.version}")
    private String appVersion;

    @Override
    public String getAppInfo() {
        return appMessage + " (версія: " + appVersion + ")";
    }
}
