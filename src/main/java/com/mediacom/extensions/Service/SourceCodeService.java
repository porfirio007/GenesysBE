package com.mediacom.extensions.Service;

import com.mediacom.extensions.Entity.SourceCode;
import com.mediacom.extensions.Repository.SourceCodeRepository;
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