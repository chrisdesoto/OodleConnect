
package com.OodleData;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Category {

    private String id;
    private String name;
    private String abbrev;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param abbrev
     */
    public Category(String id, String name, String abbrev) {
        this.id = id;
        this.name = name;
        this.abbrev = abbrev;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Category withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Category withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The abbrev
     */
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * 
     * @param abbrev
     *     The abbrev
     */
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public Category withAbbrev(String abbrev) {
        this.abbrev = abbrev;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Category withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
