package com.pharm.pharmy.api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KakaoApiResponseDto {
    @JsonProperty("meta")
    private MetaDto metaDto;

    @JsonProperty("documents")
    private List<DocumentDto> documentDtoList;






}
