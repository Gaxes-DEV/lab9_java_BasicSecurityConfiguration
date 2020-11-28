package com.cenfotec.seguridad.basica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.seguridad.basica.domain.Configuration;

@RestController
public class ConfigurationController {

    @GetMapping("/configuration")
    public List<Configuration> getConfiguration(){
        ArrayList<Configuration> result = new ArrayList<>();
        result.add(new Configuration());
        result.add(new Configuration());
        return result;
    }

}
