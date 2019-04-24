package com.pascal.GestiondeSalles.SportHall;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportHallService {
    private SportHallRepository sportHallRepository;
    //private SportHallModel sportHallModel;



    public SportHallService(SportHallRepository sportHallRepository){
        this.sportHallRepository=sportHallRepository;
    }

    public SportHallModel createSportHall(SportHallModel sportHallToCreate) {
        SportHallModel theSportHallModel=sportHallRepository.save(sportHallToCreate);
        return theSportHallModel;
    }


    public SportHallModel findSportHallById(long id) {
        SportHallModel theSportHallModel=sportHallRepository.getOne(id);
        return theSportHallModel;

    }

    public List<SportHallModel> findAll() {
        List<SportHallModel> theSportHallModel=sportHallRepository.findAll();
        return theSportHallModel;

    }

    public void deleteSportHall(long id) {
        sportHallRepository.deleteById(id);
        return;
    }
}


