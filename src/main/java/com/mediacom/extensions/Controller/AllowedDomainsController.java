package com.mediacom.extensions.Controller;

import com.mediacom.extensions.Entity.AllowedDomains;
import com.mediacom.extensions.Service.AllowedSitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AllowedDomainsController {
    @Autowired
    AllowedSitesService allowedSitesService;

    @GetMapping("/getAllowedDomaninsByIdChiamante/{idChiamante}")
    public List<AllowedDomains> getPippo(@PathVariable Long idChiamante){
        List<String> listaStringhe = new ArrayList<>();

        listaStringhe.add("peppe");
        listaStringhe.add("lello");
        List<AllowedDomains> ad = new ArrayList<AllowedDomains>();

        ad = allowedSitesService.getSourceCodesByChiamanteId(idChiamante);

        return ad;
    }
}

