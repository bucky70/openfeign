package com.feign.example.open.feign.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {


    @Autowired
    private CatFeignClient catFeignClient;

    public byte[] getImage(Integer id){
        return catFeignClient.getImage(id);
    }
}
