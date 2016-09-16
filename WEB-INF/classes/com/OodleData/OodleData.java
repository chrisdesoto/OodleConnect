
package com.OodleData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class OodleData {

    private Current current;
    private List<Listing> listings = new ArrayList<Listing>();
    private Meta meta;
    private String stat;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OodleData() {
    }

    /**
     * 
     * @param current
     * @param listings
     * @param stat
     * @param meta
     */
    public OodleData(Current current, List<Listing> listings, Meta meta, String stat) {
        this.current = current;
        this.listings = listings;
        this.meta = meta;
        this.stat = stat;
    }

    /**
     * 
     * @return
     *     The current
     */
    public Current getCurrent() {
        return current;
    }

    /**
     * 
     * @param current
     *     The current
     */
    public void setCurrent(Current current) {
        this.current = current;
    }

    public OodleData withCurrent(Current current) {
        this.current = current;
        return this;
    }

    /**
     * 
     * @return
     *     The listings
     */
    public List<Listing> getListings() {
        return listings;
    }

    /**
     * 
     * @param listings
     *     The listings
     */
    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

    public OodleData withListings(List<Listing> listings) {
        this.listings = listings;
        return this;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public OodleData withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * 
     * @return
     *     The stat
     */
    public String getStat() {
        return stat;
    }

    /**
     * 
     * @param stat
     *     The stat
     */
    public void setStat(String stat) {
        this.stat = stat;
    }

    public OodleData withStat(String stat) {
        this.stat = stat;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public OodleData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
