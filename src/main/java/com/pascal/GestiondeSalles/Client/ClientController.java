package com.pascal.GestiondeSalles.Client;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    // je declare ma classe de service.
    private ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService=clientService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public ClientModel createClient(@RequestBody ClientModel clientToCreate) {
        return clientService.createClient(clientToCreate);
    }

   @GetMapping("/{id}")
    public ClientModel getClient(@PathVariable("id") long id) {
        return clientService.findClientById(id) ; //clientService.findClientById(id);
    }


    @GetMapping("/")
    public List<ClientModel> getAllClient() {
        return clientService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable("id") long id) {
        clientService.deleteClient(id);
        return ;
    }

}
