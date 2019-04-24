package com.pascal.GestiondeSalles.Client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository clientRepository;
    //private ClientModel clientModel;



    public ClientService(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }

    public ClientModel createClient(ClientModel clientToCreate) {
        ClientModel theClientModel=clientRepository.saveAndFlush(clientToCreate);
        return theClientModel;
    }


    public ClientModel findClientById(long id) {
        ClientModel theClientModel=clientRepository.getOne(id);
        return theClientModel;

    }

    public List<ClientModel> findAll() {
        List<ClientModel> theClientModel=clientRepository.findAll();
        return theClientModel;

    }

    public void deleteClient(long id) {
        clientRepository.deleteById(id);
        return;
    }
}
