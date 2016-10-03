
package com.chrisdesoto.oodledata;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Current {

    private Region region;
    private Category category;
    private int start;
    private int num;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Current() {
    }

    /**
     * 
     * @param region
     * @param num
     * @param category
     * @param start
     */
    public Current(Region region, Category category, int start, int num) {
        this.region = region;
        this.category = category;
        this.start = start;
        this.num = num;
    }

    /**
     * 
     * @return
     *     The region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    public void setRegion(Region region) {
        this.region = region;
    }

    public Current withRegion(Region region) {
        this.region = region;
        return this;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    public Current withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * 
     * @return
     *     The start
     */
    public int getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(int start) {
        this.start = start;
    }

    public Current withStart(int start) {
        this.start = start;
        return this;
    }

    /**
     * 
     * @return
     *     The num
     */
    public int getNum() {
        return num;
    }

    /**
     * 
     * @param num
     *     The num
     */
    public void setNum(int num) {
        this.num = num;
    }

    public Current withNum(int num) {
        this.num = num;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Current withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
