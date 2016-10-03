package com.chrisdesoto.oodleconnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.faces.event.AjaxBehaviorEvent;

import com.chrisdesoto.oodledata.Listing;
import com.chrisdesoto.oodledata.OodleData;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class APICall {
	
	public static final String BASE_URL = "http://api.oodle.com/api/v2/listings?key=TEST&format=json&jsoncallback=none";
	public String subCategory;
	public String query;
	public String region;
	public String location;
	public String state;
	public String radius;
	public String sort;
	public String start;
	public String num;
	public int itemsFound;
	public String statusMessage;
	public List<Listing> listings;
	public Listing modalListing;
	public Pagination pager;

	public void callAPI(AjaxBehaviorEvent e){
		
		String JSON = loadURL();
		OodleData objectData = makeObjects(JSON);
		this.setListings(objectData.getListings());
		this.setItemsFound(objectData.getMeta().getTotal());
		if(objectData.getStat().equalsIgnoreCase("ok")){
			setStatusMessage(itemsFound + " listings found");
		}
		else{
			setStatusMessage("Error");
		}
		this.pager = new Pagination(Integer.parseInt(start), Integer.parseInt(num), itemsFound);
		
	}

	public void callAPIWithStart1(AjaxBehaviorEvent e){
		
		start = "1";
		String JSON = loadURL();
		OodleData objectData = makeObjects(JSON);
		this.setListings(objectData.getListings());
		this.setItemsFound(objectData.getMeta().getTotal());
		setStatusMessage(itemsFound + " listings found");
		this.pager = new Pagination(1, Integer.parseInt(num), itemsFound);
		
	}	
	
	public String loadURL(){
		
		String JSON = null;
		
		try{
			URL oracle = new URL(constructURL());
			URLConnection yc = oracle.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null){
				JSON = inputLine;
			}
			in.close();
		}
		catch(MalformedURLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
						
		return JSON;
				
	}
	
	public OodleData makeObjects(String JSON){
		
		OodleData objectData;
				
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
				
		String jsonInString = JSON;
		
		objectData = gson.fromJson(jsonInString, OodleData.class);
				
		return objectData;
		
	}
	
	public void setPage(int page){		
		System.out.println(page);
		this.setStart(this.pager.setPage(page, Integer.parseInt(num)));		
	}
	
	public void nextPage(){		
		this.setStart(this.pager.next(Integer.parseInt(num)));		
	}
	
	public void previousPage(){		
		this.setStart(this.pager.previous(Integer.parseInt(num)));		
	}
	
	public void firstPage(){	
		this.setStart(this.pager.first());		
	}
	
	public void lastPage(){	
		this.setStart(this.pager.last());		
	}
	
	public String constructURL() {
		return null;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public String getQuery() {		
		return query.trim().replace(',', ' ');
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	
	public String getLocation() {
		return location.replace("%20", " ");
	}

	public String getRegion() {
		return region;
	}

	public String getRadius() {
		return radius;
	}

	public String getSort() {
		return sort;
	}

	public String getStart() {
		return start;
	}

	public String getNum() {
		return num;
	}
	
	public int getItemsFound() {
		return itemsFound;
	}

	public void setItemsFound(int itemsFound) {
		this.itemsFound = itemsFound;
	}

	public void setQuery(String query) {
		this.query = query.trim().replaceAll(" +", ",");
	}

	public void setLocation(String location) {
		this.location = location.replace(" ", "%20");
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public void setStart(String start) {
		System.out.println("set " + start);
		this.start = start;
	}

	public void setNum(String num) {
		if(!this.num.equals(num)){
			this.start = "1"; 
		}
		this.num = num;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public List<Listing> getListings() {
		return listings;
	}

	public void setListings(List<Listing> listings) {
		this.listings = listings;
	}

	public Listing getModalListing() {
		return modalListing;
	}

	public void setModalListing(Listing modalListing) {
		this.modalListing = modalListing;
	}

	public Pagination getPager() {
		return pager;
	}

	public void setPager(Pagination pager) {
		this.pager = pager;
	}

	public String getState() {
		return state.replace("%20", " ");
	}

	public void setState(String state) {
		this.state = state.replace(" ", "%20");
	}

}
