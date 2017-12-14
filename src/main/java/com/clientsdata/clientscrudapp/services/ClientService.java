package com.clientsdata.clientscrudapp.services;

import com.clientsdata.clientscrudapp.domain.Client;

import java.util.List;

public interface ClientService {

    List<Client> getListAll();

    Client findOne(int id);

    Client saveOrUpdate(Client client);

    void delete(int id);

    long getClientCount();
}
