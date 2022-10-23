package com.example.Hadasim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Controller
//@RequestMapping(path = "/")
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
        //Model edit = new Model("Edit client");
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

//    @PostMapping (path="client")
//    public void newClient(@RequestBody Client client){
//         clientService.addNewClient(client);
//    }

//    @RequestMapping(path = "/edit/{clientId}")
//    public String editClient(@PathVariable("clientId") Long clientId) {
//        clientService.deleteExistingClient(clientId);
//        return "/";
//    }

    @RequestMapping(path = "/edit/{id}")
    public String editClient(@PathVariable("id") long id, Model model){
        //Model edit = new Model("Edit client");
        Client editClient = clientService.get(id);
        model.addAttribute("editClient", editClient);
        return "new_client";
    }

//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditProductPage(@PathVariable(name = "id") Long id) {
//        ModelAndView mav = new ModelAndView("editClient");
//        Client client = clientService.get(id);
//        mav.addObject("client", client);
//        return mav;
//    }

    @RequestMapping(path = "/delete/{id}")
    public String deleteClient(@PathVariable("id") Long id) {
        clientService.delete(id);
        return "redirect:/";
    }

//    @DeleteMapping(path = "{clientId}")
//    public void deleteClient(@PathVariable("clientId") Long clientId) {
//        clientService.deleteExistingClient(clientId);
//    }

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


