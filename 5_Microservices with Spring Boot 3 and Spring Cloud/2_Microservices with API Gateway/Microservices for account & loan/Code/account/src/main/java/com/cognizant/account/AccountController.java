package com.cognizant.account;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, Object> getAccount(@PathVariable String number) {
        Map<String, Object> accountDetails = new HashMap<>();
        accountDetails.put("number", number);
        accountDetails.put("type", "savings");
        accountDetails.put("balance", 234343);
        return accountDetails;
    }
}
