package sst.rash.myClasses;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int length;
	private int width;
	private int height;
	private String brandName;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getLength() {
		return length;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + "]";
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	

}
