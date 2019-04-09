package edu.pnu.stem.feature.publicsafety;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.navigation.ConnectionBoundary;
import edu.pnu.stem.feature.navigation.NavigableSpace;

public class PublicSafetyWindow extends ConnectionBoundary{
	
	private String parentId;
	
	private String fireEscape;
	private String lockType;
	private String openable;
	private float sizeHeight;
	private float sizeWidth;
	private String material;
	private String windowHandling;
	
	
	public PublicSafetyWindow(IndoorGMLMap doc, String id) {
		
		super(doc, id);		
	}	
	public void setParent(ConnectionBoundary parent) {
		NavigableSpace found = null;
		found = (NavigableSpace) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}
	public ConnectionBoundary getConnectionBoundary() {
		ConnectionBoundary feature = null;
		feature = (ConnectionBoundary) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (ConnectionBoundary) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}	
	public void setFireEscape(String fireEscape) {
		
		this.fireEscape = fireEscape;
	
	}
	public String getFireEscape() {
		
		return fireEscape;		
	}
	public void setLockType(String lockType) {
		
		this.lockType  = lockType;
		
	}
	public String getLockType() {
		
		return lockType;
	}	
	public void setOpenable(String openable) {
		
		this.openable = openable;
		
	}
	public String getOpenable() {
		return openable;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}	
	public void setSizeHeight(float sizeHeight) {
		this.sizeHeight = sizeHeight;
	}
	public float getSizeHeight() {
		return sizeHeight;
	}	
	
	public void setSizeWidth(float sizeWidth) {
		this.sizeWidth = sizeWidth;
	}
	public float getSizeWidth() {
		return sizeWidth;
	}
	public void setWindowHandling(String windowhandling) {
		this. windowHandling = windowhandling;
		
	}
	public String getWindowHandling() {
		return this.windowHandling;
	}
	
}
