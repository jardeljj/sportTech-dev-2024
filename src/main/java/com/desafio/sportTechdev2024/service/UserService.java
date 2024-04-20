package com.desafio.sportTechdev2024.service;


import com.desafio.sportTechdev2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
