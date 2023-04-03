package com.pharm.pharmy.pharmacy.service;

import com.pharm.pharmy.pharmacy.entity.Pharmacy;
import com.pharm.pharmy.pharmacy.repository.PharmacyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class PharmacyRepositoryService {
    private final PharmacyRepository pharmacyRepository;
    @Transactional
    public void updateAddress(Long id, String address){
        Pharmacy pharmacy = pharmacyRepository.findById(id).orElse(null);

        // validation check
        if(Objects.isNull(pharmacy)){
            log.error("[PharmacyRepositoryService updateAddress] not found id: {}", id);
            return;
        }

        pharmacy.changePharmacyAddress(address);
    }
    public void updateAddressWithoutTransaction(Long id, String address){
        Pharmacy pharmacy = pharmacyRepository.findById(id).orElse(null);

        // validation check
        if(Objects.isNull(pharmacy)){
            log.error("[PharmacyRepositoryService updateAddressWithoutTransaction] not found id: {}", id);
            return;
        }

        pharmacy.changePharmacyAddress(address);
    }


}
