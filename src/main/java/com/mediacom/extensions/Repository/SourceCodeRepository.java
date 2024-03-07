package com.mediacom.extensions.Repository;

import com.mediacom.extensions.Entity.SourceCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SourceCodeRepository extends JpaRepository<SourceCode, Long> {
    List<SourceCode> findByChiamanteIdAndDataFineValiditaIsNull(Long idChiamante);
}