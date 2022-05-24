package ru.shum.springboot.conveyor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shum.springboot.conveyor.dto.CreditDTO;
import ru.shum.springboot.conveyor.dto.LoanApplicationRequestDTO;
import ru.shum.springboot.conveyor.dto.LoanOfferDTO;
import ru.shum.springboot.conveyor.service.OfferService;

import java.util.List;

//POST: /conveyor/offers - расчёт возможных условий кредита. Request - LoanApplicationRequestDTO, response - List<LoanOfferDTO>
//POST: /conveyor/calculation - валидация присланных данных + скоринг данных + полный расчет параметров кредита. Request - ScoringDataDTO, response CreditDTO.

@RestController
@RequestMapping("/conveyor")
public class MyRestController {

    @Autowired
    OfferService offerService;


    @PostMapping("/offers")
    public List<LoanOfferDTO> offers(@RequestBody LoanApplicationRequestDTO loanApplicationRequestDTO) {
        System.out.println(loanApplicationRequestDTO.getFirstName());
        System.out.println(loanApplicationRequestDTO.getLastName());
        System.out.println(loanApplicationRequestDTO.getMiddleName());
        System.out.println(loanApplicationRequestDTO.getAmount());
        System.out.println(loanApplicationRequestDTO.getTerm());
        System.out.println(loanApplicationRequestDTO.getBirthdate());
        System.out.println(loanApplicationRequestDTO.getPassportNumber());
        System.out.println(loanApplicationRequestDTO.getPassportSeries());

        return null;


//        return offerService.getOffers();
    }

    @PostMapping("/calculation")
    public CreditDTO calculation() {
        return null;
    }


}
