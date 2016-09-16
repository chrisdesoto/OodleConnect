
package com.OodleData;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Attributes {

	private String bathrooms;
	private String bedrooms;
    private String condition;
    private String currency;
    private String fee;
    private String hasPhoto;
    private String price;
    private String priceDisplay;
    private String sellerPhone;
    private String sellerType;
    private String squareFeet;
    private String userId;
    private String jobTitle;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    	
    }

    /**
     * 
     * @param fee
     * @param priceDisplay
     * @param hasPhoto
     * @param price
     * @param condition
     * @param userId
     * @param sellerType
     * @param sellerPhone
     * @param currency
     */
    public Attributes(String bathrooms, String bedrooms, String condition, String currency, String fee, String hasPhoto, String price, String priceDisplay, String sellerPhone, String sellerType, String squareFeet, String userId) {
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
    	this.condition = condition;
        this.currency = currency;
        this.fee = fee;
        this.hasPhoto = hasPhoto;
        this.price = price;
        this.priceDisplay = priceDisplay;
        this.sellerPhone = sellerPhone;
        this.sellerType = sellerType;
        this.squareFeet = squareFeet;
        this.userId = userId;
    }

    public String getBathrooms() {
    	if(bathrooms == null){
    		return "N/A";
    	}
    	else{
    		return bathrooms;
    	}
    }

	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}

	public String getBedrooms() {
    	if(bedrooms == null){
    		return "N/A";
    	}
    	else{
    		return bedrooms;
    	}	
    }

	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}

	/**
     * 
     * @return
     *     The condition
     */
    public String getCondition() {
    	if(condition == null){
    		return "N/A";
    	}
    	else{
    		return condition;
    	}    }

    /**
     * 
     * @param condition
     *     The condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Attributes withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Attributes withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 
     * @return
     *     The fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * 
     * @param fee
     *     The fee
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    public Attributes withFee(String fee) {
        this.fee = fee;
        return this;
    }

    /**
     * 
     * @return
     *     The hasPhoto
     */
    public String getHasPhoto() {
        return hasPhoto;
    }

    /**
     * 
     * @param hasPhoto
     *     The has_photo
     */
    public void setHasPhoto(String hasPhoto) {
        this.hasPhoto = hasPhoto;
    }

    public Attributes withHasPhoto(String hasPhoto) {
        this.hasPhoto = hasPhoto;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    public Attributes withPrice(String price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The priceDisplay
     */
    public String getPriceDisplay() {
    	if(priceDisplay == null){
    		return "N/A";
    	}
    	else{
    		return priceDisplay;
    	}
    }

    /**
     * 
     * @param priceDisplay
     *     The price_display
     */
    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public Attributes withPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
        return this;
    }

    /**
     * 
     * @return
     *     The sellerPhone
     */
    public String getSellerPhone() {
        return sellerPhone;
    }

    /**
     * 
     * @param sellerPhone
     *     The seller_phone
     */
    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public Attributes withSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
        return this;
    }

    /**
     * 
     * @return
     *     The sellerType
     */
    public String getSellerType() {
        return sellerType;
    }

    /**
     * 
     * @param sellerType
     *     The seller_type
     */
    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public Attributes withSellerType(String sellerType) {
        this.sellerType = sellerType;
        return this;
    }

    public String getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(String squareFeet) {
		this.squareFeet = squareFeet;
	}

	/**
     * 
     * @return
     *     The userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Attributes withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Attributes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
