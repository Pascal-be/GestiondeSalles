package com.pascal.GestiondeSalles.Client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("html/client/")
public class ClientVueController {
    private ClientService clientService;


    public ClientVueController(ClientService clientService){
        this.clientService=clientService;
    }
/*
    @GetMapping("list")
    public String listClient(Model model){
        //model.addAttribute("name","decathlon");
        model.addAttribute("clients",clientService.findAll());
        model.addAttribute("newClient",new ClientModel());
        return "client";
    }

    @PostMapping(value = {"/ajouterClient"})
    public String savePerson(RedirectAttributes model, @ModelAttribute("client") ClientModel client) {
        if(!StringUtils.isEmpty(client.getName())) {
            clientService.createClient(client);
        } else
        {
            model.addAttribute("errorMessage","Le nom ne peutpas être vide");
        }
        return "redirect:list";
    }
    */
    @GetMapping("list")
    public String listClient(Model model, @RequestParam(value ="errorMessage",required = false) String message) {
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("newClient",new ClientModel());

        if(!StringUtils.isEmpty(message)){
            model.addAttribute("errorMessage",message);
        }
        return "client";
    }
    @GetMapping("delete/{id}")
    public String deleteClient(@PathVariable("id") long id)  {
        clientService.deleteClient(id);
        return "redirect:../list";
    }


    @PostMapping(value = {"/ajouterClient"})
    public String savePerson(RedirectAttributes model,@ModelAttribute("client") ClientModel client) {
        if(!StringUtils.isEmpty(client.getName())) {
            clientService.createClient(client);
        } else
        {
            model.addAttribute("errorMessage","Le nom ne peutpas être vide");
        }
        return "redirect:list";
    }
}