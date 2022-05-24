package ru.shum.springboot.conveyor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shum.springboot.conveyor.dto.LoanApplicationRequestDTO;
import ru.shum.springboot.conveyor.dto.LoanOfferDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OfferService {
//    private LoanApplicationRequestDTO loanApplicationRequestDTO;

    private static long id = 1;
//    private Long applicationId; //id кредита
//    private BigDecimal requestedAmount; //запрашиваемая сумма
//    private BigDecimal totalAmount; // общая сумма *
//    private Integer term; //срок *
//    private BigDecimal monthlyPayment; //ежемесячный платеж *
//    private BigDecimal rate; //ставка *
//    private Boolean isInsuranceEnabled; //включена ли страховка
//    private Boolean isSalaryClient; //зп клиента норм?


//    @Autowired
//    public void setLoanApplicationRequestDTO(LoanApplicationRequestDTO loanApplicationRequestDTO) {
//        this.loanApplicationRequestDTO = loanApplicationRequestDTO;
//    }
//
//    public List<LoanOfferDTO> getOffers() {
//        List<LoanOfferDTO> result = new ArrayList<>(4);
//        LoanOfferDTO loanOfferDTO = getLoanOfferDTOWithIdAndRequestAmount();
//
//
//        return null;
//    }
//
//    private LoanOfferDTO getLoanOfferDTOWithIdAndRequestAmount() {
//        LoanOfferDTO loanOfferDTO = new LoanOfferDTO();
//        loanOfferDTO.setApplicationId(id++);
//        loanOfferDTO.setRequestedAmount(loanApplicationRequestDTO.getAmount());
//        loanOfferDTO.setInsuranceEnabled(true);
//        loanOfferDTO.setSalaryClient(true);
//
//
//        return loanOfferDTO;
//    }
//
//    private void changeTotalAmount() {
//        BigDecimal totalAmount;
//        BigDecimal amount = loanApplicationRequestDTO.getAmount();
//        BigDecimal percent = new BigDecimal("1.1");
//        totalAmount = amount.multiply(percent);
//    }
}
