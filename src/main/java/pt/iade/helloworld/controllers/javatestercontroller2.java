package pt.iade.helloworld.controllers;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class javatestercontroller2 {

    private double grades[] = {10.5, 12, 14.5};
    @GetMapping(path = "/grades/range/{min}/{max}",
    produces=MediaType.APPLICATION_JSON_VALUE)
    public int getGraderange(@PathVariable("min") double min,@PathVariable("max") double max ) {

        int count = 0;
        for (int i = 0 ; i < grades.length; i=i+1){
            if (grades[i]>= min && grades [i]<= max){
                count = count +1;
            }
        }
        return count ;
}
}

