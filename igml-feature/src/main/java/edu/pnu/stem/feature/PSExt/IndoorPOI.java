package edu.pnu.stem.feature.PSExt;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.State;
import edu.pnu.stem.feature.navigation.ConnectionBoundary;
import edu.pnu.stem.feature.navigation.NavigableSpace;

public class IndoorPOI extends State{

	public IndoorPOI(IndoorGMLMap doc, String id) {
		super(doc, id);		
	}
	public void setParent(State parent) {
		State found = null;
		found = (State) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}
	public State getState() {
		State feature = null;
		feature = (State) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (State) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}
}
