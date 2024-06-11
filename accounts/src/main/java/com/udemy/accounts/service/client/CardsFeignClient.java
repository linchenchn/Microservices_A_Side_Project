package com.udemy.accounts.service.client;

import com.udemy.accounts.dto.CardsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : Tommy
 * @version : 1.0
 * @createTime : 10/06/2024 22:54
 * @Description :
 */
@FeignClient("cards")
public interface CardsFeignClient {

    @GetMapping(value = "api/fetch",consumes = "application/json")
    public ResponseEntity<CardsDTO> fetchCardDetails(@RequestParam String mobileNumber);
}
