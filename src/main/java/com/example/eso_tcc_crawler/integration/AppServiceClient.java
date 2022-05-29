package com.example.eso_tcc_crawler.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "home", url = "http://localhost:5000/")
public interface AppServiceClient {
    @RequestMapping(method = RequestMethod.GET)
    AppResponseDto get();

    // @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    // AppResponseDto post();

}
