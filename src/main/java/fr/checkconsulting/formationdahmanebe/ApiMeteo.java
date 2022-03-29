package fr.checkconsulting.formationdahmanebe;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiMeteo {


    @GetMapping("api/v1/meteo")
    public ResponseEntity getMeteo(@RequestParam("pays") String pays,
                                   @Nullable @RequestParam("periode") String periode,
                                   @RequestHeader("api-key") String apiKey){

      return ResponseEntity.ok().build();
    }

}
