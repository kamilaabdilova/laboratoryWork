package com.example.labawork.services;

import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PropertiesService {
    private final SpringDataWebProperties pageableDefaultProps;

    public int getDefaultPageSize() {
        return pageableDefaultProps.getPageable().getDefaultPageSize();
    }

}