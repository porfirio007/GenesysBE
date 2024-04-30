package com.mediacom.extensions.Controller;

import com.mediacom.extensions.Entity.AllowedDomains;
import com.mediacom.extensions.Model.DomainDTO;
import com.mediacom.extensions.Service.AllowedSitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class AllowedDomainsController {
    @Autowired
    AllowedSitesService allowedSitesService;

    @GetMapping("/getAllowedDomaninsByIdChiamante/{idChiamante}")
    public List<DomainDTO> getAllowedDomainsByChiamanteId(@PathVariable Long idChiamante) {

        List<AllowedDomains> ad = allowedSitesService.getDomainsByChiamanteId(idChiamante);

        return ad.stream()
                .map(allowedDomain -> new DomainDTO(allowedDomain.getDominio()))
                .collect(Collectors.toList());
    }
}

