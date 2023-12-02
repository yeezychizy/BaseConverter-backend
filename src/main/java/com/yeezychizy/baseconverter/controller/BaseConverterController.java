package com.yeezychizy.baseconverter.controller;


import com.yeezychizy.baseconverter.model.BaseConverterDTO;
import com.yeezychizy.baseconverter.service.BaseConvterterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// http://localhost:8080/output-number
// -  http://localhost - the server,
// - 8080 - the port,
// - /output-number - the endpoint

/* the body of the request is a JSON object that looks like this:
{
        "inputNumber": "10001",
        "inputBase": 2,
        "outputBase": 10
        }

 */

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BaseConverterController {

    @Autowired
    BaseConvterterService baseConvterterService;


    // inputNumber, inputBase & outputBase --> outputNumber
    @GetMapping("/{output-number}")
    public String getOutputNumber(@RequestBody BaseConverterDTO baseConverterDTO) { // request
        return baseConvterterService.convertBase(baseConverterDTO.getInputNumber(), baseConverterDTO.getInputBase(), baseConverterDTO.getOutputBase()); // response
    }

    @PostMapping("/{output-number}")
    public String outputNumber(@RequestBody BaseConverterDTO baseConverterDTO) { // request
        return baseConvterterService.convertBase(baseConverterDTO.getInputNumber(), baseConverterDTO.getInputBase(), baseConverterDTO.getOutputBase()); // response
    }

    @GetMapping("/hello")
    public String welcomeChizu() {
        return "Hello guys, this is Chizube -  I am about to change the world, one line of code at a time";
    }

    @GetMapping("/get-apple")
    public String apple() {
        return "Here's your apple, Chizu!";
    }

    @PostMapping("/give-chickfil-a")
    public void snack() {

    }
}