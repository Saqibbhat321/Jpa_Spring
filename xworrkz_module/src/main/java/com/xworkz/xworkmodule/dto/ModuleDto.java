package com.xworkz.xworkmodule.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class ModuleDto {


    private int id;
    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    private String email;
    private String alterEmail;
    private double phNo;
    private double alterPhNo;
    private String location;
    private Integer login_count;

}
