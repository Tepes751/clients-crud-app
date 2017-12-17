package com.clientsdata.clientscrudapp.controllers;

import com.clientsdata.clientscrudapp.domain.Client;
import com.clientsdata.clientscrudapp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/client/find-all")
    public List<Client> getClientsList(){
        return clientService.getListAll();
    }

    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable int id){
        return clientService.findOne(id);
    }

    @GetMapping("/client/count")
    public long getClientsCount(){
        return clientService.getClientCount();
    }

    @PostMapping("/client")
    public void postClient(@RequestBody Client client){
        clientService.saveOrUpdate(client);
    }

    @DeleteMapping("/client/{id}")
    public void deleteClient(@PathVariable int id){
        clientService.delete(id);
    }

}
