package dishi.microservicses.limitsservice.bean;


import org.springframework.stereotype.Component;

@Component
public class Limits {

    private int maximum;

    public int getMaximum() {
        return maximum;
    }

    public Limits() {
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public Limits(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    private int minimum;
}
