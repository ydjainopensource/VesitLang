import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * An Attribute Class. It will store graphviz attribute.
 * Created by frank on 2014/11/20.
 * Modified by Yash  
 */
public class Attribute {
    private String attrName;
    private String attrValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attribute)) return false;
        Attribute attribute = (Attribute) o;
        return Objects.equals(attrName, attribute.attrName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(attrName);
    }

    /**
     * @param name Attribute name. Like 'label' 'color'...etc.
     * @param value Attrubute value. Like 'blue'...
     */

    public Attribute(String name, String value){
        this.attrName = name;
        this.attrValue = value;
    }

    /**
     * Attribute name getter.
     * @return attribute name.
     */
    public String getAttrName(){
        return this.attrName;
    }

    /**
     * Attribute value getter.
     * @return attribute value.
     */
    public String getAttrValue(){
        return this.attrValue;
    }

}
