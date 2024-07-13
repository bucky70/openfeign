package com.feign.example.open.feign.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="imageClient", url="https://api.unsplash.com/search/photos/{id}")
public interface ImageFeignClient {
    @GetMapping(value = "{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    byte[] getImage(@PathVariable Integer id);
}

