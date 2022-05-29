package com.example.eso_tcc_crawler.integration;
import com.example.eso_tcc_crawler.integration.AppServiceClient;

import org.springframework.beans.factory.annotation.Autowired;

public class AppServiceImpl implements AppServiceClient{
    
    @Autowired
    private AppServiceClient appServiceClient;

    @Override
    public AppResponseDto get(){
        
        return appServiceClient.get();
    }
}
