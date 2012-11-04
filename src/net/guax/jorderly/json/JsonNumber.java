/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly.json;

import java.math.BigDecimal;
import org.antlr.runtime.FailedPredicateException;
/**
 *
 * @author guax
 */
public class JsonNumber extends JsonProperty {
    
    BigDecimal value;
    
    Range range;
    
    public JsonNumber() {}
    
    public JsonNumber(String value) {
        this.value = new BigDecimal(value);
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }
    
    public boolean isValidNumber(String number) throws FailedPredicateException {
        BigDecimal value = new BigDecimal(number);
        
        if(this.range != null) {
            if(this.range.lowerBound != null) {
                if(this.range.lowerBound.compareTo(value) != -1) {
                    throw new FailedPredicateException(this.input, "integer", "Number is lower than " + this.range.lowerBound.toString());
                }
            }

            if(this.range.upperBound != null) {
                if(this.range.upperBound.compareTo(value) != 1) {
                    throw new FailedPredicateException(this.input, "integer", "Number is bigger than " + this.range.upperBound.toString());
                }
            }
        }
        
        return true;
    }
}
