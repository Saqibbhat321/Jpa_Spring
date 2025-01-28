package com.xworkz.xworkmodule.service;

import com.xworkz.xworkmodule.dto.ModuleDto;
import com.xworkz.xworkmodule.entity.ModuleEntity;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

public interface ModuleService {

    boolean Validate(ModuleDto dto);

    String getName(String email, String password);
    Long countName(String name);
    Long countByEmail(String email);
    Long countByAltEmail(String altEmail);
    Long countByPhone(double phone);
    Long countByAltPhone(double altPhone);
    ModuleEntity checkLogin(String email, String password);
    ModuleEntity updatePassword(String email, String autogeratedpassword, String newPassword, String confirmPassword);
    boolean UpdateDetailsByName(ModuleDto dto);
    boolean saveEmail(String email, String password);
    boolean resetPassword(String email, String newPassword);




}
