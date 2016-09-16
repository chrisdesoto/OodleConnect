
package com.OodleData;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Search {

    private String title;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Search() {
    }

    /**
     * 
     * @param title
     * @param url
     */
    public Search(String title, String url) {
        this.title = title;
        this.url = url;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Search withTitle(String title) {
        this.title = title;
        return this;
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

    public Search withUrl(String url) {
        this.url = url;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Search withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
