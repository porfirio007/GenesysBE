package com.mediacom.extensions.Controller;

import com.mediacom.extensions.Entity.SourceCode;
import com.mediacom.extensions.Service.SourceCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//comment
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
