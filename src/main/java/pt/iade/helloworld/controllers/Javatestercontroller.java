package pt.iade.helloworld.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/api/java/tester/")
public class Javatestercontroller {

    private Logger logger = LoggerFactory.getLogger(GreeterController.class);
    @GetMapping(path = "/author", produces= MediaType.APPLICATION_JSON_VALUE)
    public String getAuthor() {
        logger.info("Sending info about the author");
        
        String name = "Gisela Marques";
        int number = 20200754;
        boolean likesFootball = false;
        double height = 1.52;
        char firstLetter = 'G';
        String res = "";
        res+= "Done by "+name+" with number "+number+".\n";
        res+= String.format("I am %.3f tall and ",height);
        if (likesFootball) {
            res+="I am";
        } else  {
            res+= "not";
        }
        res+=" a fan of football\n";
        if (likesFootball) {
            String club = "";
            if (firstLetter == 'G'){
                club = "Sporting";
            } else if (firstLetter == 'R') { 
                club = "Benfica";
            } else if (firstLetter == 'B') {
                club = "Porto";
            } else {
                club = "None";
            }
            res+="My favorite club is "+club;  
            
        } return res ;
    }    
           
}

// Arrays

