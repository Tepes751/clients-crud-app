package com.clientsdata.clientscrudapp.services.impl;

import com.clientsdata.clientscrudapp.domain.Client;
import com.clientsdata.clientscrudapp.repositories.ClientRepository;
import com.clientsdata.clientscrudapp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    private ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getListAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findOne(int id) {
        return clientRepository.findOne(id);
    }

    @Override
    public Client saveOrUpdate(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void delete(int id) {
        clientRepository.delete(id);
    }

    @Override
    public long getClientCount() {
        return clientRepository.count();
    }
}
