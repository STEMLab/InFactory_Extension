package edu.pnu.stem.feature.PSExt;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpaceBoundary;
import edu.pnu.stem.feature.navigation.ConnectionBoundary;
import edu.pnu.stem.feature.navigation.NavigableSpace;
import net.opengis.indoorgml.psextension.v_1_0.DoorHandlingType;
import net.opengis.indoorgml.psextension.v_1_0.DoorSwingType;

public class PublicSafetyWindow extends ConnectionBoundary{
	
	private String parentId;
	
	private Boolean fireEscape;
	private String lockType;
	private Boolean openable;
	private float sizeHeight;
	private float sizeWidth;
	private String material;
	private DoorHandlingType windowHandling;
	
	
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
	
	public void copyCellBoundary(CellSpaceBoundary cb) {
		this.setCellSpace(cb.getCellSpace());
	}

	public void setFireEscape(Boolean fireEscape) {
		
		this.fireEscape = fireEscape;
	
	}
	public Boolean getFireEscape() {
		
		return fireEscape;		
	}
	public void setLockType(String lockType) {
		
		this.lockType  = lockType;
		
	}
	public String getLockType() {
		
		return lockType;
	}	
	public void setOpenable(Boolean openable) {
		
		this.openable = openable;
		
	}
	public Boolean getOpenable() {
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
	public void setWindowHandling(DoorHandlingType windowhandling) {
		this. windowHandling = windowhandling;
		
	}
	public DoorHandlingType getWindowHandling() {
		return this.windowHandling;
	}
	
}
