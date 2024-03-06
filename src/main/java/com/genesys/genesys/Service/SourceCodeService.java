package com.genesys.genesys.Service;

import com.genesys.genesys.Entity.SourceCode;
import com.genesys.genesys.Repository.SourceCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceCodeService {
    @Autowired
    private SourceCodeRepository sourceCodeRepository;

    public List<SourceCode> getSourceCodesByChiamanteId(Long idChiamante) {
        return sourceCodeRepository.findByChiamanteIdAndDataFineValiditaIsNull(idChiamante);
    }
}