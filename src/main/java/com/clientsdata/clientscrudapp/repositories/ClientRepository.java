package com.clientsdata.clientscrudapp.repositories;

import com.clientsdata.clientscrudapp.domain.Client;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ClientRepository extends PagingAndSortingRepository<Client, Integer>, JpaSpecificationExecutor {

    List<Client> findAll();

}
