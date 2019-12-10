package com.why.boot_controller;

import com.why.boot_model.PersonDO;
import com.why.boot_service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String sayHi(){
        PersonDO personDO = new PersonDO();
        personDO.setName("隔壁老王");
        return personService.sayHi(personDO);
    }
}
