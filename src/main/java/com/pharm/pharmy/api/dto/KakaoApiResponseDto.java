package com.pharm.pharmy.api.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KakaoApiResponseDto {
    private MetaDto metaDto;

    private List<DocumentDto> documentDtoList;


}
