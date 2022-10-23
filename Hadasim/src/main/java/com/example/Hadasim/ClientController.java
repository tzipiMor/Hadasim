package com.example.Hadasim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @RequestMapping(path = "/details/{id}" )
    public String viewDetails(@PathVariable("id") long id, Model model){
        Client clientDetails = clientService.get(id);
        model.addAttribute("clientDetails", clientDetails);
        return "details";
    }

    @RequestMapping(path = "/")
    public String viewClient(Model model) {
        List<Client> listClients = clientService.getClients();
        model.addAttribute("listClients", listClients);
        return "health_fund_clients";
    }

    @RequestMapping(path = "/newClient")
    public String addNewClient(Model model){
        Client newClient = new Client();
        model.addAttribute("newClient", newClient);
        return "new_client";
    }

    @RequestMapping (path="/saveClient", method = RequestMethod.POST)
    public String saveNewClient(@ModelAttribute("client") Client client){
         clientService.save(client);
         return "redirect:/";
    }


    @RequestMapping(path = "/edit/{id}")
    public String editClient(@PathVariable("id") long id, Model model){
        //Model edit = new Model("Edit client");
        Client editClient = clientService.get(id);
        model.addAttribute("editClient", editClient);
        return "edit_client";
    }


    @RequestMapping(path = "/delete/{id}")
    public String deleteClient(@PathVariable("id") Long id) {
        clientService.delete(id);
        return "redirect:/";
    }


    @PutMapping(path = "{clientId}")
    public void updateClient(
            @PathVariable("clientId") Long clientId,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String street,
            @RequestParam(required = false) Integer numOfHouse,
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String cellPhone){
        clientService.updateClient(clientId, lastName , city, street, numOfHouse, phone, cellPhone);
    }
}


