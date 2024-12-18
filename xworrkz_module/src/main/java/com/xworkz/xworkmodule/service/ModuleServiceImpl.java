package com.xworkz.xworkmodule.service;


import com.xworkz.xworkmodule.dto.ModuleDto;
import com.xworkz.xworkmodule.entity.ModuleEntity;
import com.xworkz.xworkmodule.repository.ModuleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleRepo repo;

    @Override
    public boolean Validate(ModuleDto dto) {
        ModuleEntity entity = new ModuleEntity();

        char[] password = generateRandomPassword();
        boolean valid = false;
        if (dto != null) {

            entity.setName(dto.getName());
            entity.setEmail(dto.getEmail());
            entity.setAlterEmail(dto.getAlterEmail());
            entity.setPhNo(dto.getPhNo());
            entity.setAlterPhNo(dto.getAlterPhNo());
            entity.setLocation(dto.getLocation());
            entity.setAutoGeneratedPassword(password);
            repo.save(entity);
            valid = true;
        }
        return valid;
    }
    //Custom methods

    private char[] generateRandomPassword() {
        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&";

        char[] pass = new char[8];
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            pass[i] = code.charAt(random.nextInt(code.length()));
        }
        return pass;
    }

    //Inbuilt methods

//    private String generateRandomPassword(int length) {
//        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
//        SecureRandom random = new SecureRandom();
//        StringBuilder password = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            int index = random.nextInt(chars.length());
//            password.append(chars.charAt(index));
//        }
//        return password.toString();
//    }
}
