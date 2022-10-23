package com.example.Hadasim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepo clientRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public List<Client> getClients() {
        return clientRepo.findAll();
    }

    public void addNewClient(Client client) {
        Optional<Client> clientCellPhone = clientRepo.findClientByCellPhone(client.getCellPhone());
        if (clientCellPhone.isPresent())
            throw new IllegalStateException("Existing client");
//       Optional<Client> clientCoronaVaccine = clientRepo.findByCoronaVaccine(client.getCoronaVaccine());
//        if(clientCoronaVaccine.stream().count() > 4)
//       int clientCoronaVaccine = clientRepo.count(client.getCoronaVaccine());
//        if (clientCoronaVaccine > 4)
//            throw new IllegalStateException("There is to many corona vaccine");
        clientRepo.save(client);
    }

    public void deleteExistingClient(Long clientId) {
        boolean existsClient = clientRepo.existsById(clientId);
        if (!existsClient)
            throw new IllegalStateException("A client with id " + clientId + " is not exists");
        clientRepo.deleteById(clientId);
    }

    @Transactional
    public void updateClient(Long clientId, String lastName, String city, String street, Integer numOfHouse, String phone, String cellPhone) {
        Client client = clientRepo.findById(clientId)
                .orElseThrow(() -> new IllegalStateException("A client with id " + clientId + " is not exists"));

        if (lastName != null && lastName.length() > 0 && !Objects.equals(client.getLastName(), lastName)) {
            client.setLastName((lastName));
        }

        if (numOfHouse != null && numOfHouse > 0 && Objects.equals(client.getNumOfHouse(), numOfHouse)) {
            client.setNumOfHouse(numOfHouse);
        }
    }

    public void save(Client client) {
        clientRepo.save(client);
    }

    public void delete(Long clientId) {
        clientRepo.deleteById(clientId);
    }

    public Client get(Long id) {
        return clientRepo.findById(id).get();
    }
}


