package edu.pnu.stem.dao.PSExt;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.io.ParseException;

import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.feature.PSExt.PublicSafetyDoor;
import edu.pnu.stem.feature.core.CellSpace;
import edu.pnu.stem.feature.core.CellSpaceBoundary;
import edu.pnu.stem.feature.core.PrimalSpaceFeatures;
import edu.pnu.stem.feature.core.Transition;
import edu.pnu.stem.geometry.jts.WKTReader3D;
import net.opengis.indoorgml.psextension.v_1_0.DoorHandlingType;
import net.opengis.indoorgml.psextension.v_1_0.DoorSwingType;

public class PublicSafetyDoorDAO {
	public static PublicSafetyDoor createPublicSafetyDoor(IndoorGMLMap map, String parentId, String id, String geometry, String duality ,String doorHandling, String doorSwing, String fireEscape, String lockType, String material, float sizeHeight, float sizeWidth) {

		if (id == null) {
			id = UUID.randomUUID().toString();
		}
		PublicSafetyDoor newFeature = new PublicSafetyDoor(map, id);

		if (map.hasFutureID(id)) {
			newFeature.copyCellBoundary((CellSpaceBoundary)map.getFutureFeature(id)) ;

		} else {
			map.setFutureFeature(id, newFeature);
		}
		map.setFeature(id, "PublicSafetyDoor", newFeature);

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
		
		
		if(doorHandling != null) {
			newFeature.setDoorHandling(DoorHandlingType.fromValue(doorHandling));			
			
		}
		if(doorSwing != null) {			
			newFeature.setDoorSwing(DoorSwingType.fromValue(doorSwing));
			
		}		
		if(fireEscape != null) {
			newFeature.setFireEscape(Boolean.valueOf(fireEscape));
			
		}
		if(lockType != null) {
			newFeature.setLockType(lockType);
			
		}
		if(material != null) {
			newFeature.setMaterial(material);
		
		}
		if(sizeHeight != 0) {
			newFeature.setSizeHeight(sizeHeight);
			
		}
		if(sizeWidth != 0) {
			newFeature.setSizeWidth(sizeWidth);
		
		}	

		map.removeFutureID(id);
		return newFeature;
	}

	public static PublicSafetyDoor readPublicSafetyDoor(IndoorGMLMap map, String id) {
		PublicSafetyDoor target = null;
		try {
			target = (PublicSafetyDoor) map.getFeature(id);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return target;
	}

	public static PublicSafetyDoor createPublicSafetyDoor(IndoorGMLMap map, String parentId, String id, String name, String description, Geometry geometry, String duality, String doorHandling, String doorSwing, String fireEscape, String lockType, String material, float sizeHeight, float sizeWidth ) {
		if (id == null) {
			id = UUID.randomUUID().toString();
		}

		PublicSafetyDoor newFeature = new PublicSafetyDoor(map, id);
		

		if (map.hasFutureID(id)) {
			newFeature = (PublicSafetyDoor) map.getFutureFeature(id);
			// map.removeFutureID(id);
		} else {
			map.setFutureFeature(id, newFeature);
		}

		map.setFeature(id, "PublicSafetyDoor", newFeature);
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
		if(doorHandling != null) {
			newFeature.setDoorHandling(DoorHandlingType.fromValue(doorHandling));			
			
		}
		if(doorSwing != null) {			
			newFeature.setDoorSwing(DoorSwingType.fromValue(doorSwing));
			
		}		
		if(fireEscape != null) {
			newFeature.setFireEscape(Boolean.valueOf(fireEscape));
			
		}
		if(lockType != null) {
			newFeature.setLockType(lockType);
	
		}
		if(material != null) {
			newFeature.setMaterial(material);
		
		}
		if(sizeHeight != 0) {
			newFeature.setSizeHeight(sizeHeight);
		
		}
		if(sizeWidth != 0) {
			newFeature.setSizeWidth(sizeWidth);
			
		}		


		return newFeature;
	}

	public static PublicSafetyDoor updatePublicSafetyDoor(IndoorGMLMap map, String parentId, String id, String name,
			String description, Geometry geometry, String duality) {
		PublicSafetyDoor result = new PublicSafetyDoor(map, id);
		PublicSafetyDoor target = (PublicSafetyDoor) map.getFeature(id);

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
		map.setFeature(id, "PublicSafetyDoor", result);
		return result;

	}

	public static void deletePublicSafetyDoor(IndoorGMLMap map, String id) {
		PublicSafetyDoor target = (PublicSafetyDoor) map.getFeature(id);
		PrimalSpaceFeatures parent = target.getParent();
		parent.deleteCellSpaceBoundaryMember(id);

		if (target.hasDuality()) {
			Transition duality = target.getDuality();
			duality.resetDuality();
		}

		// cellspace 찾아가서 partialboundedby 해제
		CellSpace cellspaceForPartialBoundedBy = target.getCellSpace();
		cellspaceForPartialBoundedBy.deletePartialBoundedBy(target);

		map.removeFeature(id);
	}
}