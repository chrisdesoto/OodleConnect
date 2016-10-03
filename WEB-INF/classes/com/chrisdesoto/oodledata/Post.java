
package com.chrisdesoto.oodledata;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Post {

    private Generic generic;
    private Category__ category;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Post() {
    }

    /**
     * 
     * @param generic
     * @param category
     */
    public Post(Generic generic, Category__ category) {
        this.generic = generic;
        this.category = category;
    }

    /**
     * 
     * @return
     *     The generic
     */
    public Generic getGeneric() {
        return generic;
    }

    /**
     * 
     * @param generic
     *     The generic
     */
    public void setGeneric(Generic generic) {
        this.generic = generic;
    }

    public Post withGeneric(Generic generic) {
        this.generic = generic;
        return this;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category__ getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category__ category) {
        this.category = category;
    }

    public Post withCategory(Category__ category) {
        this.category = category;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Post withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
