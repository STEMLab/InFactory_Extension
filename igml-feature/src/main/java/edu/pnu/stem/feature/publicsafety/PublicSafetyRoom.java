package edu.pnu.stem.feature.publicsafety;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.navigation.GeneralSpace;
import edu.pnu.stem.feature.navigation.NavigableSpace;

public class PublicSafetyRoom extends GeneralSpace {
	private String parentId;
	private String psRoomType;

	public PublicSafetyRoom(IndoorGMLMap doc, String id) {

		super(doc, id);
	}
	public void setParent(GeneralSpace parent) {
		GeneralSpace found = null;
		found = (GeneralSpace) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}
	
	public GeneralSpace getGeneralSpaceFeature() {
		GeneralSpace feature = null;
		feature = (GeneralSpace) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (GeneralSpace) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}
	public void setpsRoomType(String psRoomType) {
		this.psRoomType = psRoomType;
	}

	public String getpsRoomType() {
		return psRoomType;
	}
}