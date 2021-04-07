package dishi.ms.currencyexchangeservice.currencyexchangeservice.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
//        CurrencyExchange currencyExchange = new CurrencyExchange(100L, from, to, BigDecimal.valueOf(5));
        CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from,to);
        String port = environment.getProperty("server.port");
        currencyExchange.setEnvironment(port);
        if(currencyExchange == null){
            throw  new RuntimeException();
        }
        return currencyExchange;
    }
}
