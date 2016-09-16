package realtyApp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class AppView {
	
	private String display;
	
	public AppView(){
		
		display = "realEstate";
		
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

}
