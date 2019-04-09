package edu.pnu.stem.feature.publicsafety;

import edu.pnu.stem.binder.IndoorGMLMap;

public class PublicSafetyIndoorInstallation extends IndoorPOI{

	String paretId;
	PublicSafetyLegend psLegend;
	public PublicSafetyIndoorInstallation(IndoorGMLMap doc, String id) {
		super(doc, id);
	}
	public void setPublicSafetyLegend(PublicSafetyLegend psLegend) {
		this.psLegend = psLegend;		
	}
	public PublicSafetyLegend getPublicSafetyLegend() {
		return psLegend;		
	}
}
