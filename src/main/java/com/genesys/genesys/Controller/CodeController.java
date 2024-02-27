package com.genesys.genesys.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//comment
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
public class CodeController {


    @GetMapping("/getCode")
    public ArrayList<String> getCode(){
        ArrayList<String> listaCode = new ArrayList<String>();

        listaCode.add("COMO_TEST");
        listaCode.add("LODI_TEST");

        return listaCode;
    }
}
