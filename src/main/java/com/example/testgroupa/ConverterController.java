package com.example.testgroupa;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ConverterController {

    Converter converter = new Converter();
    @RequestMapping("/cm")
    //convertes inches to cm
    //https://www.google.com/search?client=firefox-b-d&q=how+to+convert+inches+to+cm
    public double cm(
            @RequestParam double a) {
        return converter.cm(a);

    }
 @RequestMapping("/m")
    //convertes yards to meter
    //https://www.google.com/search?client=firefox-b-d&q=how+to+convert+yard+to+meter
    public double m(
    @RequestParam double a) {
    return converter.m(a);

    }

}
