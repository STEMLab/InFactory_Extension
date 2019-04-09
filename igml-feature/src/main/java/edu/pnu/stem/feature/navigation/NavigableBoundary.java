package edu.pnu.stem.feature.navigation;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpace;
import edu.pnu.stem.feature.core.CellSpaceBoundary;

public class NavigableBoundary extends CellSpaceBoundary{
	
	private String parentId;
	
	public NavigableBoundary(IndoorGMLMap doc, String id) {
		super(doc, id);
		// TODO Auto-generated constructor stub
	}
	public void setParent(CellSpace parent) {
		CellSpaceBoundary found = null;
		found = (CellSpaceBoundary) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}

	public CellSpaceBoundary getCellSpaceBoundaryFeature() {
		CellSpaceBoundary feature = null;
		feature = (CellSpaceBoundary) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (CellSpaceBoundary) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}

}
