package com.pascal.GestiondeSalles.SportHall;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SportHalls")
public class SportHallController {

    // je declare ma classe de service.
    private SportHallService sportHallService;

    public SportHallController(SportHallService sportHallService){
        this.sportHallService=sportHallService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public SportHallModel createSportHall(@RequestBody SportHallModel SportHallToCreate) {
        return sportHallService.createSportHall(SportHallToCreate);
    }

    @GetMapping("/{id}")
    public SportHallModel getSportHall(@PathVariable("id") long id) {

        return sportHallService.findSportHallById(id) ;
    }


    @GetMapping("/")
    public List<SportHallModel> getAllSportHall() {
        return sportHallService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteSportHall(@PathVariable("id") long id) {
        sportHallService.deleteSportHall(id);
        return ;
    }

}
