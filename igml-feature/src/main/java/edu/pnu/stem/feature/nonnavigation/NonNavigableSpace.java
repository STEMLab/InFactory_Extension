package edu.pnu.stem.feature.nonnavigation;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpace;

public class NonNavigableSpace extends CellSpace {

	
	private String obstacleType;
	public NonNavigableSpace(IndoorGMLMap doc, String id) {

		super(doc, id);

	}
	public void setObstacleType(String obstacleType) {
		this.obstacleType = obstacleType;
	}

	public String getObstacleType() {
		return obstacleType;
	}


}
