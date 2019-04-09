package edu.pnu.stem.feature.navigation;

import edu.pnu.stem.binder.IndoorGMLMap;

public class TransferSpace extends NavigableSpace {
	private String parentId;

	public TransferSpace(IndoorGMLMap doc, String id) {
		super(doc, id);

	}
	public void setParent(NavigableSpace parent) {
		NavigableSpace found = null;
		found = (NavigableSpace) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}

	public NavigableSpace getNavigableSpaceFeature() {
		NavigableSpace feature = null;
		feature = (NavigableSpace) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (NavigableSpace) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}
	


}
