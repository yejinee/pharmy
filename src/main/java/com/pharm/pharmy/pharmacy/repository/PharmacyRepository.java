package com.pharm.pharmy.pharmacy.repository;

import com.pharm.pharmy.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {

}
