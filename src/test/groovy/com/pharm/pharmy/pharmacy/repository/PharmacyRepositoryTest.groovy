package com.pharm.pharmy.pharmacy.repository

import com.pharm.pharmy.AbstractIntegrationContainerBaseTest
import com.pharm.pharmy.pharmacy.entity.Pharmacy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification
import java.util.Arrays


class PharmacyRepositoryTest extends AbstractIntegrationContainerBaseTest {

    @Autowired
    private PharmacyRepository pharmacyRepository

    def setup(){
        pharmacyRepository.deleteAll()
    }


    def "PharmacyRepository save"() {
        given:
        String address = "서울 특별시 성북구 종암동"
        String name = "은혜 약국"
        double latitude = 36.11
        double longtitude = 128.11

        def pharmacy =Pharmacy.builder().pharmacyAddress(address).pharmacyName(name).latitude(latitude).longtitude(longtitude).build()

        when:
        def result = pharmacyRepository.save(pharmacy)

        then:
        result.getPharmacyAddress() == address
        result.getPharmacyName() == name
        result.getLatitude() == latitude
        result.getLongtitude() == longtitude

    }
    // api test
    def "PharmacyRepository saveAll"(){
        given:
        String address = "서울 특별시 성북구 종암동"
        String name = "은혜 약국"
        double latitude = 36.11
        double longtitude = 128.11

        def pharmacy =Pharmacy.builder().pharmacyAddress(address).pharmacyName(name).latitude(latitude).longtitude(longtitude).build()

        when:
        pharmacyRepository.saveAll(Arrays.asList(pharmacy))
        def result = pharmacyRepository.findAll()

        then:
        result.size()==1

    }

}
