package com.pharm.pharmy.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDto {

    @JsonProperty("address_name")
    private String addressName;
    @JsonProperty("x")
    private double latitude;
    @JsonProperty("y")
    private double longitude;
}
