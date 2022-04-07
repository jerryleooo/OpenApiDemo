package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenApiController
{
    @Autowired
    private OpenApiDemoService openApiDemoService;

    @RequestMapping(value = "/v1/api/echo", method = RequestMethod.GET)
    public String echo()
    {
        return openApiDemoService.echo();
    }
}
