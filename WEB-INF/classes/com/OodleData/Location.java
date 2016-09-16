
package com.OodleData;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Location {

    private String address;
    private String citycode;
    private String name;
    private String state;
    private String country;
    private String latitude;
    private String longitude;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param citycode
     * @param address
     * @param name
     * @param state
     * @param longitude
     * @param latitude
     * @param country
     */
    public Location(String address, String citycode, String name, String state, String country, String latitude, String longitude) {
        this.address = address;
        this.citycode = citycode;
        this.name = name;
        this.state = state;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
    	if(address == null){
    		return "N/A";
    	}
    	else{
    		return address;
    	}
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public Location withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The citycode
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * 
     * @param citycode
     *     The citycode
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public Location withCitycode(String citycode) {
        this.citycode = citycode;
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

    public Location withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    public Location withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public Location withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Location withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Location withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
