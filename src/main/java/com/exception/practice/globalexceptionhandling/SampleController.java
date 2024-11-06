package com.exception.practice.globalexceptionhandling;

import com.exception.practice.UserDefinedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/globaltest")
    public String getResource() throws UserDefinedException {
        try{
            int data = 2/0;
        }
        catch (Exception e){
            throw new UserDefinedException("userdefined");
        }
        return "Resource with ID ";
    }
}
