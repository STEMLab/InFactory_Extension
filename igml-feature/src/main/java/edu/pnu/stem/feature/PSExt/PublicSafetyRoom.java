package edu.pnu.stem.feature.PSExt;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.navigation.GeneralSpace;
import net.opengis.indoorgml.psextension.v_1_0.PsRoomType;

public class PublicSafetyRoom extends GeneralSpace {
	private String parentId;
	private PsRoomType psRoomType;

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
	public void setpsRoomType(PsRoomType psRoomType) {
		this.psRoomType = psRoomType;
	}

	public PsRoomType getpsRoomType() {
		return psRoomType;
	}
}