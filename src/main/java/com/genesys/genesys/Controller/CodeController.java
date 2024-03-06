package com.genesys.genesys.Controller;

import com.genesys.genesys.Entity.SourceCode;
import com.genesys.genesys.Model.SourceCodeDTO;
import com.genesys.genesys.Service.SourceCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//comment
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CodeController {

    @Autowired
    private SourceCodeService sourceCodeService;

    @GetMapping("/getCodeByIdChiamante/{idChiamante}")
    public List<SourceCode>  getSourceCodesByChiamanteId(@PathVariable Long idChiamante){

        return sourceCodeService.getSourceCodesByChiamanteId(idChiamante);
        //return new ResponseEntity<>(sourceCodes, HttpStatus.OK);

    }
}
