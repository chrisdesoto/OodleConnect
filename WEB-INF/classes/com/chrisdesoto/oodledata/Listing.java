
package com.chrisdesoto.oodledata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Listing {

    private String id;
    private String title;
    private String body;
    private String url;
    private Category_ category;
    private Source source;
    private Location location;
    private List<Image> images = new ArrayList<Image>();
    private int ctime;
    private String paid;
    private int revenueScore;
    private String similarUrl;
    private Attributes attributes;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Listing() {
    }

    /**
     * 
     * @param id
     * @param body
     * @param paid
     * @param category
     * @param title
     * @param source
     * @param location
     * @param similarUrl
     * @param images
     * @param revenueScore
     * @param attributes
     * @param user
     * @param ctime
     * @param url
     */
    public Listing(String id, String title, String body, String url, Category_ category, Source source, Location location, List<Image> images, int ctime, String paid, int revenueScore, String similarUrl, Attributes attributes) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.url = url;
        this.category = category;
        this.source = source;
        this.location = location;
        this.images = images;
        this.ctime = ctime;
        this.paid = paid;
        this.revenueScore = revenueScore;
        this.similarUrl = similarUrl;
        this.attributes = attributes;
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

    public Listing withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
    	if(title == null){
    		return "";
    	}
    	else{
    		return title;
    	}
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Listing withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The body
     */
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(String body) {
        this.body = body;
    }

    public Listing withBody(String body) {
        this.body = body;
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

    public Listing withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category_ getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category_ category) {
        this.category = category;
    }

    public Listing withCategory(Category_ category) {
        this.category = category;
        return this;
    }

    /**
     * 
     * @return
     *     The source
     */
    public Source getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(Source source) {
        this.source = source;
    }

    public Listing withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    public Listing withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
    	if (images.isEmpty()){    
    		(images = new ArrayList<Image>()).add(new Image("images/no-photo.jpg"));
    	}
    	return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Listing withImages(List<Image> images) {
        this.images = images;
        return this;
    }

    /**
     * 
     * @return
     *     The ctime
     */
    public int getCtime() {
        return ctime;
    }

    /**
     * 
     * @param ctime
     *     The ctime
     */
    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    public Listing withCtime(int ctime) {
        this.ctime = ctime;
        return this;
    }

    /**
     * 
     * @return
     *     The paid
     */
    public String getPaid() {
        return paid;
    }

    /**
     * 
     * @param paid
     *     The paid
     */
    public void setPaid(String paid) {
        this.paid = paid;
    }

    public Listing withPaid(String paid) {
        this.paid = paid;
        return this;
    }

    /**
     * 
     * @return
     *     The revenueScore
     */
    public int getRevenueScore() {
        return revenueScore;
    }

    /**
     * 
     * @param revenueScore
     *     The revenue_score
     */
    public void setRevenueScore(int revenueScore) {
        this.revenueScore = revenueScore;
    }

    public Listing withRevenueScore(int revenueScore) {
        this.revenueScore = revenueScore;
        return this;
    }

    /**
     * 
     * @return
     *     The similarUrl
     */
    public String getSimilarUrl() {
        return similarUrl;
    }

    /**
     * 
     * @param similarUrl
     *     The similar_url
     */
    public void setSimilarUrl(String similarUrl) {
        this.similarUrl = similarUrl;
    }

    public Listing withSimilarUrl(String similarUrl) {
        this.similarUrl = similarUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public Attributes getAttributes() {
    	if(attributes == null){
    		return new Attributes();
    	}
    	else{
    		return attributes;
    	}
        
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Listing withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Listing withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
