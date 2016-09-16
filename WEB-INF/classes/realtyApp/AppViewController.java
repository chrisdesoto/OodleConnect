package realtyApp;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class AppViewController {
	
	private String navMessage;
	private String display;
	private APICall realEstateCall;
	private APICall rentalsCall;
	private APICall forSaleCall;
	private APICall jobsCall;
	private APICall servicesCall;
	private Map<String, String> subLocationUS;
	private Map<String, String> subLocationCAN;
	private Map<String, String> subLocationUK;
	private Map<String, String> subLocationIR;
	private Map<String, String> subLocationIN;
	
	public AppViewController(){
		
		display = "realEstate";
		setNavMessage("Find homes & real estate near you..");
		realEstateCall = new RealEstateCall();
		rentalsCall = null;
		forSaleCall = null;
		jobsCall = null;
		servicesCall = null;
		//Initialize and fill state/province maps
		subLocationUS = new LinkedHashMap<String, String>();
			fillsubLocationUS();
		subLocationCAN = new LinkedHashMap<String, String>();
			fillsubLocationCAN();
		subLocationUK = new LinkedHashMap<String, String>();
			fillsubLocationUK();
		subLocationIR = new LinkedHashMap<String, String>();
			fillsubLocationIR();
		subLocationIN = new LinkedHashMap<String, String>();
			fillsubLocationIN();			
			
	}
	
	public void fillsubLocationUS(){
		subLocationUS.put("AL", "Alabama");
		subLocationUS.put("AK", "Alaska");
		subLocationUS.put("AZ", "Arizona");
		subLocationUS.put("AR", "Arkansas");
		subLocationUS.put("CA", "California");
		subLocationUS.put("CO", "Colorado");
		subLocationUS.put("CT", "Connecticut");
		subLocationUS.put("DE", "Delaware");
		subLocationUS.put("DC", "District Of Columbia");
		subLocationUS.put("FL", "Florida");
		subLocationUS.put("GA", "Georgia");
		subLocationUS.put("HI", "Hawaii");
		subLocationUS.put("ID", "Idaho");
		subLocationUS.put("IL", "Illinois");
		subLocationUS.put("IN", "Indiana");
		subLocationUS.put("IA", "Iowa");
		subLocationUS.put("KS", "Kansas");
		subLocationUS.put("KY", "Kentucky");
		subLocationUS.put("LA", "Louisiana");
		subLocationUS.put("ME", "Maine");
		subLocationUS.put("MD", "Maryland");
		subLocationUS.put("MA", "Massachusetts");
		subLocationUS.put("MI", "Michigan");
		subLocationUS.put("MN", "Minnesota");
		subLocationUS.put("MS", "Mississippi");
		subLocationUS.put("MO", "Missouri");
		subLocationUS.put("MT", "Montana");
		subLocationUS.put("NE", "Nebraska");
		subLocationUS.put("NV", "Nevada");
		subLocationUS.put("NH", "New Hampshire");
		subLocationUS.put("NJ", "New Jersey");
		subLocationUS.put("NM", "New Mexico");
		subLocationUS.put("NY", "New York");
		subLocationUS.put("NC", "North Carolina");
		subLocationUS.put("ND", "North Dakota");
		subLocationUS.put("OH", "Ohio");
		subLocationUS.put("OK", "Oklahoma");
		subLocationUS.put("OR", "Oregon");
		subLocationUS.put("PA", "Pennsylvania");
		subLocationUS.put("RI", "Rhode Island");
		subLocationUS.put("SC", "South Carolina");
		subLocationUS.put("SD", "South Dakota");
		subLocationUS.put("TN", "Tennessee");
		subLocationUS.put("TX", "Texas");
		subLocationUS.put("UT", "Utah");
		subLocationUS.put("VT", "Vermont");
		subLocationUS.put("VA", "Virginia");
		subLocationUS.put("WA", "Washington");
		subLocationUS.put("WV", "West Virginia");
		subLocationUS.put("WI", "Wisconsin");
		subLocationUS.put("WY", "Wyoming");
	}
	
	public void fillsubLocationCAN(){
		subLocationCAN.put("AB", "Alberta");
		subLocationCAN.put("BC", "British Columbia");
		subLocationCAN.put("MB", "Manitoba");
		subLocationCAN.put("NB", "New Brunswick");
		subLocationCAN.put("NL", "Newfoundland and Labrador");
		subLocationCAN.put("NS", "Nova Scotia");
		subLocationCAN.put("ON", "Ontario");
		subLocationCAN.put("PE", "Prince Edward Island");
		subLocationCAN.put("QC", "Quebec");
		subLocationCAN.put("SK", "Saskatchewan");
		subLocationCAN.put("NT", "Northwest Territories");
		subLocationCAN.put("NU", "Nunavut");
		subLocationCAN.put("YT", "Yukon");		
	}

	public void fillsubLocationUK(){
		subLocationUK.put("England", "England");
		subLocationUK.put("Wales", "Wales");
		subLocationUK.put("Scotland", "Scotland");
		subLocationUK.put("Northern Ireland", "Northern Ireland");
	}
	
	public void fillsubLocationIR(){
		subLocationIR.put("connacht", "Connacht");
		subLocationIR.put("leinster", "Leinster");
		subLocationIR.put("munster", "Munster");
		subLocationIR.put("ulster", "Ulster");
	}
	
	public void fillsubLocationIN(){
		subLocationIN.put("Andaman and Nicobar Islands", "Andaman and Nicobar Islands");
		subLocationIN.put("Andhra Pradesh", "Andhra Pradesh");
		subLocationIN.put("Arunachal Pradesh", "Arunachal Pradesh");
		subLocationIN.put("Assam", "Assam");
		subLocationIN.put("Bihar", "Bihar");
		subLocationIN.put("Chandigarh", "Chandigarh");
		subLocationIN.put("Chhattisgarh", "Chhattisgarh");
		subLocationIN.put("Dadra and Nagar Haveli", "Dadra and Nagar Haveli");
		subLocationIN.put("Daman and Diu", "Daman and Diu");
		subLocationIN.put("Delhi", "Delhi");
		subLocationIN.put("Goa", "Goa");
		subLocationIN.put("Gujarat", "Gujarat");
		subLocationIN.put("Haryana", "Haryana");
		subLocationIN.put("Himachal Pradesh", "Himachal Pradesh");
		subLocationIN.put("Jammu and Kashmir", "Jammu and Kashmir");
		subLocationIN.put("Jharkhand", "Jharkhand");
		subLocationIN.put("Karnataka", "Karnataka");
		subLocationIN.put("Kerala", "Kerala");
		subLocationIN.put("Lakshadweep", "Lakshadweep");
		subLocationIN.put("Madhya Pradesh", "Madhya Pradesh");
		subLocationIN.put("Maharashtra", "Maharashtra");
		subLocationIN.put("Manipur", "Manipur");
		subLocationIN.put("Meghalaya", "Meghalaya");
		subLocationIN.put("Mizoram", "Mizoram");
		subLocationIN.put("Nagaland", "Nagaland");
		subLocationIN.put("Orissa", "Orissa");
		subLocationIN.put("Pondicherry", "Pondicherry");
		subLocationIN.put("Punjab", "Punjab");
		subLocationIN.put("Rajasthan", "Rajasthan");
		subLocationIN.put("Sikkim", "Sikkim");
		subLocationIN.put("Tamil Nadu", "Tamil Nadu");
		subLocationIN.put("Tripura", "Tripura");
		subLocationIN.put("Uttaranchal", "Uttaranchal");
		subLocationIN.put("Uttar Pradesh", "Uttar Pradesh");
		subLocationIN.put("West Bengal", "West Bengal");
	}
	
	public Map<String, String> getSubLocationUS() {
		return subLocationUS;
	}

	public Map<String, String> getSubLocationCAN() {
		return subLocationCAN;
	}

	public Map<String, String> getSubLocationUK() {
		return subLocationUK;
	}

	public Map<String, String> getSubLocationIR() {
		return subLocationIR;
	}

	public Map<String, String> getSubLocationIN() {
		return subLocationIN;
	}

	public void setSubLocationUS(Map<String, String> subLocationUS) {
		this.subLocationUS = subLocationUS;
	}

	public void setSubLocationCAN(Map<String, String> subLocationCAN) {
		this.subLocationCAN = subLocationCAN;
	}

	public void setSubLocationUK(Map<String, String> subLocationUK) {
		this.subLocationUK = subLocationUK;
	}

	public void setSubLocationIR(Map<String, String> subLocationIR) {
		this.subLocationIR = subLocationIR;
	}

	public void setSubLocationIN(Map<String, String> subLocationIN) {
		this.subLocationIN = subLocationIN;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		if(display.equals("realEstate")){
			setNavMessage("Find homes & real estate near you..");
		}
		else if(display.equals("rentals")){
			setNavMessage("Find home, condo & apartment rentals near you..");
		}
		else if(display.equals("forSale")){
			setNavMessage("Find items for sale near you..");
		}
		else if(display.equals("jobs")){
			setNavMessage("Find jobs near you..");
		}
		else if(display.equals("services")){
			setNavMessage("Find services near you..");
		}
		this.display = display;
	}

	public String getNavMessage() {
		return navMessage;
	}

	public APICall getRealEstateCall() {
		return realEstateCall;
	}

	public APICall getRentalsCall() {
		return rentalsCall;
	}

	public APICall getForSaleCall() {
		return forSaleCall;
	}

	public APICall getJobsCall() {
		return jobsCall;
	}

	public APICall getServicesCall() {
		return servicesCall;
	}

	public void setNavMessage(String navMessage) {
		this.navMessage = navMessage;
	}

	public void setRealEstateCall(APICall realEstateCall) {
		this.realEstateCall = realEstateCall;
	}

	public void setRentalsCall(APICall rentalsCall) {
		this.rentalsCall = rentalsCall;
	}

	public void setForSaleCall(APICall forSaleCall) {
		this.forSaleCall = forSaleCall;
	}

	public void setJobsCall(APICall jobsCall) {
		this.jobsCall = jobsCall;
	}

	public void setServicesCall(APICall servicesCall) {
		this.servicesCall = servicesCall;
	}
	
	public void setRealEstateCall() {
		if(this.realEstateCall == null){
			this.realEstateCall = new RealEstateCall();
		}
	}

	public void setRentalsCall() {
		if(this.rentalsCall == null){
			this.rentalsCall = new RentalsCall();
		}
	}

	public void setForSaleCall() {
		if(this.forSaleCall == null){
			this.forSaleCall = new ForSaleCall();
		}
	}

	public void setJobsCall() {
		if(this.jobsCall == null){
			this.jobsCall = new JobsCall();
		}
	}

	public void setServicesCall() {
		if(this.servicesCall == null){
			this.servicesCall = new ServicesCall();
		}
	}

}
