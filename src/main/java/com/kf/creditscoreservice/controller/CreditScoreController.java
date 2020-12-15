package com.kf.creditscoreservice.controller;

import com.kf.creditscoreservice.response.CreditScoreResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/credit-score")
public class CreditScoreController {

    @RequestMapping("/{identificationNumber}")
    public CreditScoreResponse calculateLoanLimit(@PathVariable("identificationNumber") Long identificationNumber){

        CreditScoreResponse creditScoreResponse = new CreditScoreResponse();
        Random rand = new Random();
        int random = rand.nextInt(2);
        if(random==0){
            creditScoreResponse.setExist("BULUNAMADI");
        }else{
            creditScoreResponse.setExist("BULUNDU");

            int randomScore = rand.nextInt(1900);
            creditScoreResponse.setCreditScore(randomScore);
        }

        return creditScoreResponse;
    }

}
