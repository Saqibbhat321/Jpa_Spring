package com.xworkz.xworkmodule.repository;

import com.xworkz.xworkmodule.entity.ModuleEntity;

public interface ModuleRepo {

    boolean save(ModuleEntity entity);

    String getName(String email, String password);

    Long countName(String name);
    Long countByEmail(String email);
    Long countByAltEmail(String altEmail);
    Long countByPhone(String phone);
    Long countByAltPhone(String altPhone);
//    Long countByLocation(String location);

}
