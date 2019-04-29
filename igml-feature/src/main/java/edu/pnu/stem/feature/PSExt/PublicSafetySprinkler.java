package edu.pnu.stem.feature.PSExt;

import edu.pnu.stem.binder.IndoorGMLMap;

public class PublicSafetySprinkler extends PublicSafetyIndoorInstallation{
	
	public PublicSafetySprinkler(IndoorGMLMap doc, String id) {
		super(doc, id);
	}
	public void setParent(PublicSafetyIndoorInstallation parent) {
		PublicSafetyIndoorInstallation found = null;
		found = (PublicSafetyIndoorInstallation) indoorGMLMap.getFeature(parent.getId());
		if (found == null) {
			indoorGMLMap.setFutureFeature(parent.getId(), parent);
		}
		this.parentId = parent.getId();
	}
	public PublicSafetyIndoorInstallation getPublicSafetyIndoorInstallation() {
		PublicSafetyIndoorInstallation feature = null;
		feature = (PublicSafetyIndoorInstallation) indoorGMLMap.getFeature(this.parentId);
		if (feature == null) {
			feature = (PublicSafetyIndoorInstallation) indoorGMLMap.getFutureFeature(this.parentId);
		}
		return feature;
	}	
}
