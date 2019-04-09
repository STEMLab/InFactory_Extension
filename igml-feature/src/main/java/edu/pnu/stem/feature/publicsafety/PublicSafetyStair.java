package edu.pnu.stem.feature.publicsafety;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.navigation.TransitionSpace;

public class PublicSafetyStair extends TransitionSpace{

	String parentId;	
	public PublicSafetyStair(IndoorGMLMap doc, String id) {
		super(doc, id);		
	}
	
	public void setParent(TransitionSpace parent) {
		TransitionSpace found = null;
		found = (TransitionSpace) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}
	public TransitionSpace getTransitionSpace() {
		TransitionSpace feature = null;
		feature = (TransitionSpace) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (TransitionSpace) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}
}
