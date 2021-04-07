package dishi.microservicses.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



//Component is aso required so that java can find it in the class path as an bean and then can be autowired
@Component
@ConfigurationProperties("limits-services")
public class Configuration {
private int minimum;
private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
