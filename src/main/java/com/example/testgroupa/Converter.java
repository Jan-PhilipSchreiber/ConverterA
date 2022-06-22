package com.example.testgroupa;
import org.springframework.web.bind.annotation.RequestParam;

public class Converter {
    public double cm(double a) {
        //convertes inches to cm
        //https://www.google.com/search?client=firefox-b-d&q=how+to+convert+inches+to+cm
        return a*2.54 ;
    }
    public double m(double a) {
        //convertes yards to meter
      //https://www.google.com/search?client=firefox-b-d&q=how+to+convert+yard+to+meter
        return a/1.094 ;
    }
}
