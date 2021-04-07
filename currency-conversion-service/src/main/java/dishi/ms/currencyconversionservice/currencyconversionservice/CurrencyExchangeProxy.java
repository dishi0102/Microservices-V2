package dishi.ms.currencyconversionservice.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Just remove the Url to hand over the loadbalancing


//@FeignClient(name = "currency-exchange",url ="localhost:8000" )
@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retriveExchangeValue(@PathVariable String from, @PathVariable String to) ;
}
