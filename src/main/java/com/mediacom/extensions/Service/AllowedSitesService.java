package com.mediacom.extensions.Service;


import com.mediacom.extensions.Entity.AllowedDomains;
import com.mediacom.extensions.Repository.AllowedDomainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllowedSitesService {
    @Autowired
    AllowedDomainsRepository allowedSitesRepositoy;

    public List<AllowedDomains> getSourceCodesByChiamanteId(Long idChiamante) {
        return allowedSitesRepositoy.findByChiamanteIdAndDataFineValiditaIsNull(idChiamante);
    }



}
