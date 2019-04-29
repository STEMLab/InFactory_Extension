package edu.pnu.stem.feature.PSExt;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpaceBoundary;
import edu.pnu.stem.feature.navigation.ConnectionBoundary;

public class PublicSafetyHatch extends ConnectionBoundary {
	String parentId;
	Boolean fireEscape;
	String hatchLocation;
	String lockType;
	Boolean openable;
	String material;
	float sizeLength;
	float sizeWidth;
	
	public void setParent(ConnectionBoundary parent) {
		ConnectionBoundary found = null;
		found = (ConnectionBoundary) indoorGMLMap.getFeature(parent.getId());
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

	public PublicSafetyHatch(IndoorGMLMap doc, String id) {

		super(doc, id);
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
	public void setHatchLocation(String hatchLocation) {
		this.hatchLocation = hatchLocation;
	}
	public String getHatchLocation() {
		return hatchLocation;
	}

	public void setLockType(String lockType) {

		this.lockType = lockType;
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

	public void setSizeLength(float sizeLength) {
		this.sizeLength = sizeLength;
	}

	public float getSizeLength() {
		return sizeLength;
	}

	public void setSizeWidth(float sizeWidth) {
		this.sizeWidth = sizeWidth;
	}

	public float getSizeWidth() {
		return sizeWidth;
	}

}
