package com.pharm.pharmy.api.service

import com.pharm.pharmy.AbstractIntegrationContainerBaseTest
import org.springframework.beans.factory.annotation.Autowired

class KakaoAddressSearchServiceTest extends AbstractIntegrationContainerBaseTest {

    @Autowired
    private KakaoAddressSearchService kakaoAddressSearchService

    def "address parameter value null, requestAddressSearch return null"() {
        given:
        String address = null

        when:
        def result = kakaoAddressSearchService.requestAddressSearch(address)

        then:
        result == null

    }
    def "address valid, requestAddressSearch returns document"(){
        given:
        def address = "서울 성북구 종암로 10길"

        when:
        def result = kakaoAddressSearchService.requestAddressSearch(address)

        then:
        result.documentDtoList.size()>0
        result.metaDto.totalCount > 0
        result.documentDtoList.get(0).addressName != null


    }


}
