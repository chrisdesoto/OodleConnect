
package com.OodleData;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Generic {

    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Generic() {
    }

    /**
     * 
     * @param url
     */
    public Generic(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public Generic withUrl(String url) {
        this.url = url;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Generic withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
