package edu.pnu.stem.dao.TextruedSurface;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.LinearRing;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.io.ParseException;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.core.CellSpace;
import edu.pnu.stem.feature.core.CellSpaceBoundary;
import edu.pnu.stem.feature.core.PrimalSpaceFeatures;
import edu.pnu.stem.feature.core.Transition;
import edu.pnu.stem.feature.texture.TextureSurface;
import edu.pnu.stem.geometry.jts.WKTReader3D;

public class TextureSurfaceDAO {

	public static TextureSurface createTextureSurface(IndoorGMLMap map, String parentId, String id, String geometry,	String duality) {

		if (id == null) {
			id = UUID.randomUUID().toString();
		}
		TextureSurface newFeature = new TextureSurface(map, id);

		if (map.hasFutureID(id)) {
			newFeature = (TextureSurface) map.getFutureFeature(id);

		} else {
			map.setFutureFeature(id, newFeature);
		}
		map.setFeature(id, "TextureSurface", newFeature);

		PrimalSpaceFeatures parent = (PrimalSpaceFeatures) map.getFeature(parentId);

		if (parent == null) {
			if (map.hasFutureID(parentId)) {
				parent = (PrimalSpaceFeatures) map.getFutureFeature(parentId);
			} else {
				parent = new PrimalSpaceFeatures(map, parentId);
			}
		}

		List<CellSpaceBoundary> cellSpaceBoundaryMember = new ArrayList<CellSpaceBoundary>();
		cellSpaceBoundaryMember.add(newFeature);
		parent.setCellSpaceBoundaryMember(cellSpaceBoundaryMember);
		newFeature.setParent(parent);

		if (geometry != null) {
			WKTReader3D wkt = new WKTReader3D();
			try {
				Polygon p = (Polygon) wkt.read(geometry);
				map.setFeature4Geometry(UUID.randomUUID().toString(), p);
				newFeature.setGeometry(p);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		if (duality != null) {
			Transition dualityFeature = (Transition) map.getFeature(duality);
			if (dualityFeature == null) {
				dualityFeature = new Transition(map, duality);
				dualityFeature.setDuality(newFeature);
				map.setFutureFeature(duality, dualityFeature);
			} else {
				dualityFeature.setDuality(newFeature);
			}
			newFeature.setDuality(dualityFeature);
		}

		map.removeFutureID(id);
		return newFeature;
	}

	public static TextureSurface readTexturedSurface(IndoorGMLMap map, String id) {
		TextureSurface target = null;
		try {
			target = (TextureSurface) map.getFeature(id);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return target;
	}

	public static TextureSurface createTextureSurface(IndoorGMLMap map, String parentId, String id, String name,
			String description, Geometry geometry, String duality, Geometry imageCoodinates, String imageURL) {
		if (id == null) {
			id = UUID.randomUUID().toString();
		}

		TextureSurface newFeature = new TextureSurface(map, id);
		

		if (map.hasFutureID(id)) {
			newFeature = (TextureSurface) map.getFutureFeature(id);
			// map.removeFutureID(id);
		} else {
			map.setFutureFeature(id, newFeature);
		}

		map.setFeature(id, "TextureSurface", newFeature);
		PrimalSpaceFeatures parent = (PrimalSpaceFeatures) map.getFeature(parentId);
		
		if (parent == null) {
			if (map.hasFutureID(parentId)) {
				parent = (PrimalSpaceFeatures) map.getFutureFeature(parentId);
				map.removeFutureID(parentId);
			} else {
				parent = new PrimalSpaceFeatures(map, parentId);
			}
		}
		parent.addCellSpaceBoundaryMember(newFeature);
		newFeature.setParent(parent);

		if (name != null) {
			newFeature.setName(name);
		}

		if (description != null) {
			newFeature.setDescription(description);
		}

		if (geometry != null) {
			newFeature.setGeometry(geometry);
		}

		if (duality != null) {
			Transition dualityFeature = (Transition) map.getFeature(duality);
			if (dualityFeature == null) {
				dualityFeature = new Transition(map, duality);
				dualityFeature.setDuality(newFeature);
				map.setFutureFeature(duality, dualityFeature);
			} else {
				dualityFeature.setDuality(newFeature);
			}
			newFeature.setDuality(dualityFeature);
		}
		
		if(imageCoodinates != null) {
			
			newFeature.setTexturedImageCoodinates(imageCoodinates);			
			
		}
		if(imageURL != null) {
			newFeature.setTexturedImageURL(imageURL);
		}
		return newFeature;
	}

	public static TextureSurface updateTextureSurface(IndoorGMLMap map, String parentId, String id, String name, String description, Geometry geometry, String duality) {
		TextureSurface result = new TextureSurface(map, id);
		TextureSurface target = (TextureSurface) map.getFeature(id);

		PrimalSpaceFeatures parent = target.getParent();

		if (!parent.getId().equals(parentId)) {
			parent.deleteCellSpaceBoundaryMember(id);
			PrimalSpaceFeatures newParent = new PrimalSpaceFeatures(map, parentId);
			result.setParent(newParent);
			result.getParent().addCellSpaceBoundaryMember(result);
		} else {
			result.setParent(parent);
		}

		if (name != null) {
			result.setName(name);
		}

		if (description != null) {
			result.setDescription(description);
		}

		if (geometry != null) {
			result.setGeometry(geometry);
		}

		if (duality == null) {
			Transition d = (Transition) target.getDuality();
			if (d != null)
				d.resetDuality();
		} else {
			if (target.getDuality() != null) {
				if (!target.getDuality().getId().equals(duality)) {
					Transition oldDuality = target.getDuality();
					oldDuality.resetDuality();
				}
			}

			Transition newDuality = new Transition(map, duality);
			result.setDuality(newDuality);

		}
		map.removeFeature(id);
		map.setFeature(id, "TextureSurface", result);
		return result;

	}

	public static void deleteCellSpaceBoundary(IndoorGMLMap map, String id) {
		CellSpaceBoundary target = (CellSpaceBoundary) map.getFeature(id);
		PrimalSpaceFeatures parent = target.getParent();
		parent.deleteCellSpaceBoundaryMember(id);

		if (target.hasDuality()) {
			Transition duality = target.getDuality();
			duality.resetDuality();
		}

	
		CellSpace cellspaceForPartialBoundedBy = target.getCellSpace();
		cellspaceForPartialBoundedBy.deletePartialBoundedBy(target);

		map.removeFeature(id);
	}

}
