/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly.json;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import java.math.BigDecimal;
import org.antlr.runtime.FailedPredicateException;

/**
 *
 * @author guax
 */
public class JsonString extends JsonProperty {
    RegularExpression regex;
    
    public RegularExpression getRegex() {
        return regex;
    }

    public void setRegExp(RegularExpression regex) {
        this.regex = regex;
    }
    
    Range range;

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }
    
    protected boolean inRange(String value) {
        if (this.range == null) {
            return true;
        }
        
        // lower bound > value.lenght
        if (this.range.lowerBound != null && this.range.lowerBound.compareTo(new BigDecimal(value.length())) > 0) {
            return false;
        }
        
        // upper bound < value.lenght
        if (this.range.upperBound != null && this.range.upperBound.compareTo(new BigDecimal(value.length())) < 0) {
            return false;
        }
        
        return true;
    }
    
    public boolean isValid(String value) throws FailedPredicateException {
        if ( !this.inRange(value) ) {
            throw new FailedPredicateException(this.input, "string", "String does not obey character range");
        }
        
        return true;
    }
}
