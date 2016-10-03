package com.chrisdesoto.oodleconnect;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.chrisdesoto.oodledata.Listing;

@SessionScoped
@ManagedBean
public class RealEstateCall extends APICall {
	
	private static final String CATEGORY = "housing/sale";
	private static final String IMAGESIZE = "l";
	
	public RealEstateCall(){
		
		//Default values for each call
		subCategory = "";
		query = "";
		region = "usa";
		location = "";
		state = "Alabama";
		radius = "30";
		sort = "distance";
		start = "1";
		num = "12";
		statusMessage = "";
		setListings(new ArrayList<Listing>());
		setModalListing(new Listing());
		pager = null;
		
	}
	
	//Construct the string url for the Real Estate API call
	public String constructURL() {
		System.out.println(BASE_URL + "&q=" + query + "&category=" + CATEGORY + subCategory + "&image_sizes=" + IMAGESIZE + "&region=" + region + "&location=" + location + "%2C" + state + "&radius=" + radius + "&sort=" + sort + "&start=" + start + "&num=" + num);
		return BASE_URL + "&q=" + query + "&category=" + CATEGORY + subCategory + "&image_sizes=" + IMAGESIZE + "&region=" + region + "&location=" + location + "%2C" + state + "&radius=" + radius + "&sort=" + sort + "&start=" + start + "&num=" + num;
	}
		
}
