package ru.shum.springboot.conveyor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shum.springboot.conveyor.dto.CreditDTO;
import ru.shum.springboot.conveyor.dto.LoanOfferDTO;
import ru.shum.springboot.conveyor.service.OfferService;

import java.util.List;

//POST: /conveyor/offers - расчёт возможных условий кредита. Request - LoanApplicationRequestDTO, response - List<LoanOfferDTO>
//POST: /conveyor/calculation - валидация присланных данных + скоринг данных + полный расчет параметров кредита. Request - ScoringDataDTO, response CreditDTO.

@RestController
@RequestMapping("/conveyor")
public class MyRestController {


    @PostMapping("/offers")
    public List<LoanOfferDTO> offers(OfferService offerService) {
        return offerService.getOffers();
    }

    @PostMapping("/calculation")
    public CreditDTO calculation() {
        return null;
    }


}
