package edu.pnu.stem.feature.PSExt;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpaceBoundary;
import edu.pnu.stem.feature.navigation.ConnectionBoundary;
import net.opengis.indoorgml.psextension.v_1_0.DoorHandlingType;
import net.opengis.indoorgml.psextension.v_1_0.DoorSwingType;



public class PublicSafetyDoor extends ConnectionBoundary {

	private String parentId;
	private DoorHandlingType doorHandling;
	private DoorSwingType doorSwing;
	private Boolean fireEscape;
	private String lockType;
	private String material;
	private float sizeHeight;
	private float sizeWidth;

	public PublicSafetyDoor(IndoorGMLMap doc, String id) {
		super(doc, id);
	}

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

	public void copyCellBoundary(CellSpaceBoundary cb) {
		this.setCellSpace(cb.getCellSpace());
	}

	public void setDoorHandling(net.opengis.indoorgml.psextension.v_1_0.DoorHandlingType doorHandlingType) {
		this.doorHandling = doorHandlingType;

	}

	public DoorHandlingType getDoorHandling() {
		return this.doorHandling;
	}

	public void setDoorSwing(DoorSwingType doorSwing) {
		this.doorSwing = doorSwing;

	}

	public DoorSwingType getDoorSwing() {
		return this.doorSwing;
	}

	public void setFireEscape(Boolean fireEscape) {

		this.fireEscape = fireEscape;

	}

	public Boolean getFireEscape() {

		return fireEscape;
	}

	public void setLockType(String lockType) {

		this.lockType = lockType;
	}

	public String getLockType() {

		return lockType;
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

}
