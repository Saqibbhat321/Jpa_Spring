package com.xworkz.xworkmodule.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ModuleDto {


    private int id;
    private String name;
    private String email;
    private String alterEmail;
    private double phNo;
    private double alterPhNo;
    private String location;
}
