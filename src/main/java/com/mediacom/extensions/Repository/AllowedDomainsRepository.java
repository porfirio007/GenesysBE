package com.mediacom.extensions.Repository;

import com.mediacom.extensions.Entity.AllowedDomains;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AllowedDomainsRepository extends JpaRepository<AllowedDomains, Long> {
    List<AllowedDomains> findByChiamanteIdAndDataFineValiditaIsNull(Long idChiamante);
}
