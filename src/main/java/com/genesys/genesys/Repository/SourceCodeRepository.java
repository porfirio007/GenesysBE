package com.genesys.genesys.Repository;

import com.genesys.genesys.Entity.SourceCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SourceCodeRepository extends JpaRepository<SourceCode, Long> {
    List<SourceCode> findByChiamanteIdAndDataFineValiditaIsNull(Long idChiamante);
}