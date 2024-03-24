package com.codegym.boxofficemanagement.service.impl;

import com.codegym.boxofficemanagement.model.Role;
import com.codegym.boxofficemanagement.repository.IRoleRepository;
import com.codegym.boxofficemanagement.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository iRoleRepository;
    @Override
    public Iterable<Role> findAll() {
        return iRoleRepository.findAll();
    }

    @Override
    public void save(Role role) {
        iRoleRepository.save(role);
    }

    @Override
    public Optional<Role> findById(Long id) {
        return iRoleRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iRoleRepository.deleteById(id);
    }
}
