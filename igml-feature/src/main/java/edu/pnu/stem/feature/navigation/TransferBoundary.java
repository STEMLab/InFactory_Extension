package edu.pnu.stem.feature.navigation;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpace;

public class TransferBoundary extends NavigableBoundary{
	
	String parentId;
	public TransferBoundary(IndoorGMLMap doc, String id){
		super(doc, id);
	}
	public void setParent(NavigableBoundary parent) {
		NavigableBoundary found = null;
		found = (NavigableBoundary) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}

	public NavigableBoundary getNavigableBoundaryFeature() {
		NavigableBoundary feature = null;
		feature = (NavigableBoundary) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (NavigableBoundary) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}
	
}
