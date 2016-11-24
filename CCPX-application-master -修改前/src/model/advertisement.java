package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class advertisement {
	private int Advertisement_id;
	private int Seller_id;
	private String Advertisement_Title;
	private String Advertisement_Image;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSeller_id() {
		return Seller_id;
	}
	public void setSeller_id(int Seller_id) {
		this.Seller_id = Seller_id;
	}
	
	public int getAdvertisement_id() {
		return Advertisement_id;
	}
	public void setAdvertisement_id(int Advertisement_id) {
		this.Advertisement_id = Advertisement_id;
	}
	
	public String getAdvertisement_Title() {
		return Advertisement_Title;
	}
	public void setAdvertisement_Title(String Advertisement_Title) {
		this.Advertisement_Title = Advertisement_Title;
	}

	public String getAdvertisement_Image() {
		return Advertisement_Image;
	}
	public void setAdvertisement_Image(String Advertisement_Image) {
		this.Advertisement_Image = Advertisement_Image;
	}
	
}
