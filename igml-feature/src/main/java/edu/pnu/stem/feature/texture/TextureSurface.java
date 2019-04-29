package edu.pnu.stem.feature.texture;

import org.locationtech.jts.geom.Geometry;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpaceBoundary;
import edu.pnu.stem.feature.core.PrimalSpaceFeatures;
import edu.pnu.stem.feature.core.Transition;
import edu.pnu.stem.util.GeometryUtil;

public class TextureSurface extends CellSpaceBoundary {

	String parentId=null;
	Geometry imageCoodi=null;
	String imageURL =null;
	
	public TextureSurface(IndoorGMLMap doc, String id) {
		super(doc, id);
	}
	public Geometry getTexturedImageCoodinates() {
		return	this.imageCoodi;
	}	
	public void setTexturedImageCoodinates(Geometry geom) {
		this.imageCoodi=geom;
	}
	public String getTexturedImageURL() {
		return this.imageURL;
	}
	public void setTexturedImageURL(String imageURL) {
		this.imageURL=imageURL;
	}
}
