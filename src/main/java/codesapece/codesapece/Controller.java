package codesapece.codesapece;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(path="/hola")

public class Controller{
   
        
        @GetMapping(path="/mundo")
        public String home(){
            return"A18100778 RAUL QUIJUA BARRERA ";

        }


    }
