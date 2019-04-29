package edu.pnu.stem.feature.PSExt;

import edu.pnu.stem.binder.IndoorGMLMap;
import net.opengis.indoorgml.psextension.v_1_0.PsRoomType;
import net.opengis.indoorgml.psextension.v_1_0.PublicSafetyLegend;

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
		return this.psLegend;		
	}
}
