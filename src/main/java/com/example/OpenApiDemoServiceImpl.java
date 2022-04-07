package com.example;

import org.springframework.stereotype.Component;

@Component
public class OpenApiDemoServiceImpl implements OpenApiDemoService
{
    @Override
    public String echo()
    {
        return "hello";
    }
}
