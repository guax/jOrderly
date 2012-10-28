/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly.json;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

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
}
