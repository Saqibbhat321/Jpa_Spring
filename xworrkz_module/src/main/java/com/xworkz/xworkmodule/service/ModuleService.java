package com.xworkz.xworkmodule.service;

import com.xworkz.xworkmodule.dto.ModuleDto;

public interface ModuleService {

    boolean Validate(ModuleDto dto);

    String getName(String email, String password);
    Long countName(String name);
    Long countByEmail(String email);
    Long countByAltEmail(String altEmail);
    Long countByPhone(String phone);
    Long countByAltPhone(String altPhone);
//    Long countByLocation(String location);

}
