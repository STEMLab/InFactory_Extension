package edu.pnu.stem.feature.navigation;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpace;

public class NonNavigableSpace extends CellSpace {

	private String parentId;
	private String obstacleType;
	
	public NonNavigableSpace(IndoorGMLMap doc, String id) {

		super(doc, id);

		System.out.println("NonNavigableSpaceCore");

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
	public void setObstacleType(String obstacleType) {
		this.obstacleType = obstacleType;
	}

	public String getObstacleType() {
		return obstacleType;
	}

}
