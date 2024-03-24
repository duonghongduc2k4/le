package com.codegym.boxofficemanagement.repository;

import com.codegym.boxofficemanagement.model.Account;
import com.codegym.boxofficemanagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRoleRepository extends JpaRepository<Role,Long> {

}
