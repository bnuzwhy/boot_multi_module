package com.why.boot_service;

import com.why.boot_model.PersonDO;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String sayHi(PersonDO personDO){
        return personDO.getName()+" say Hi !";
    }
}
