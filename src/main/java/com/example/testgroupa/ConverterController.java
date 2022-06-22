package com.example.testgroupa;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ConverterController {

    Converter converter = new Converter();

    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b) {
        //is just a basic return converter.sum(a, b);

    }
}
