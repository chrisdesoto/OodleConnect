package realtyApp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class Pagination {
	
	private int currentPage;
	private int numberOfPages;
	private int[] listedPages;
	private int[] startVals;
 	
	public Pagination(int start, int num, int itemsFound){
		
		currentPage = (int)Math.ceil((double)start / num);
		numberOfPages = (int)Math.ceil((double)itemsFound / num);	
		listedPages = new int[numberOfPages];
		setListedPages();
		startVals = new int[numberOfPages];	
		int val = 1;
		int index = 0;
		while(val <= itemsFound){
			startVals[index] =  val;
			index++;
			val = val + num;			
		}

	}
	
	public String setPage(int page, int num) {
		if(page > 0 && page <= numberOfPages){
			currentPage = page;
		}
		else if(page <= 0){
			currentPage = 1;
		}
		else{
			currentPage = numberOfPages;
		}
		return String.valueOf(startVals[currentPage - 1]);
	}
	
	public String next(int num){
		if(numberOfPages == 1){
			return "1";
		}			
		else if(currentPage < numberOfPages){
			currentPage++;
			return String.valueOf(startVals[currentPage - 1]);
		}	
		else{
			return String.valueOf(startVals[currentPage - 1]);
		}
	}
	
	public String previous(int num){
		if(numberOfPages == 1){
			return "1";
		}		
		else if(currentPage > 1){
			currentPage--;
			return String.valueOf(startVals[currentPage - 1]);
		}
		else{
			return String.valueOf(startVals[currentPage - 1]);
		}
	}

	public String first(){
		currentPage = 1;
		return String.valueOf(startVals[currentPage - 1]);
	}
	
	public String last(){
		currentPage = numberOfPages;
		return String.valueOf(startVals[currentPage - 1]);		
	}	

	public int getCurrentPage() {
		return currentPage;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public int[] getListedPages() {
		return listedPages;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void setListedPages(int[] listedPages) {
		this.listedPages = listedPages;
	}

	public void setListedPages() {
		if(numberOfPages < 5){
			listedPages = new int[numberOfPages];
			for(int i = 0; i < numberOfPages; i++){
				listedPages[i] = i + 1;
			}
		}
		else{
			if(currentPage < 4){
				listedPages = new int[] {1,2,3,4,5};
			}
			else if(currentPage > (numberOfPages - 3)){
				listedPages = new int[] {numberOfPages - 4, numberOfPages - 3, numberOfPages - 2, numberOfPages - 1, numberOfPages};
			}
			else{
				listedPages = new int[] {currentPage - 2, currentPage - 1, currentPage, currentPage + 1, currentPage + 2};
			}
		}
	}

	public int[] getStartVals() {
		return startVals;
	}

	public void setStartVals(int[] startVals) {
		this.startVals = startVals;
	}

}
