package edu.pnu.stem.api.publicsafety;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.locationtech.jts.geom.Geometry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import edu.pnu.stem.api.core.Container;
import edu.pnu.stem.api.exception.UndefinedDocumentException;
import edu.pnu.stem.binder.Convert2Json;
import edu.pnu.stem.binder.IndoorGMLMap;
import edu.pnu.stem.dao.publicsafety.PublicSafetyHatchDAO;
import edu.pnu.stem.feature.publicsafety.PublicSafetyHatch;


@RestController
@RequestMapping("documents/{docId}/publicsafetyhatch")
public class PublicSafetyHatchController {
	@Autowired
	private ApplicationContext applicationContext;

	@PostMapping(value = "/{id}", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public void createPublicSafetyHatch(@PathVariable("docId") String docId, @PathVariable("id") String id,
			@RequestBody ObjectNode json, HttpServletRequest request, HttpServletResponse response) {

		final ObjectMapper mapper = new ObjectMapper();
		String parentId = json.get("parentId").asText().trim();
		String duality = null;
		String name = null;
		String description = null;
		
		String fireEscape = null;
		String hatchLocation =null;
		String lockType = null;
		String openable = null;
		String material = null;
		float sizeLength = 0;
		float sizeWidth = 0;
		

		String geomFormatType = "GEOJSON";
		String geom = json.get("geometry").asText().trim();
		Geometry geometry = null;

		if (id == null || id.isEmpty()) {
			id = UUID.randomUUID().toString();
		}

		try {
			mapper.readTree(geom);
			geometry = Convert2Json.json2Geometry(json.get("geometry"));
		} catch (IOException e) {
			geomFormatType = "WKT";
		}

		if (json.has("geometry")) {
			geometry = Convert2Json.json2Geometry(json.get("geometry"));
		}

		// TODO : 나중에 고칠 것. 임시로.
		if (json.has("duality")) {
			duality = json.get("duality").asText().trim();
		}
		if (json.has("properties")) {
			if (json.get("properties").has("duality")) {
				duality = json.get("properties").get("duality").asText().trim();
			}
			if (json.get("properties").has("name")) {
				name = json.get("properties").get("name").asText().trim();
			}
			if (json.get("properties").has("description")) {
				description = json.get("properties").get("description").asText().trim();
			}
		}

		if (json.has("FireEscape")) {
			fireEscape = json.get("FireEscape").asText().trim();
		}
		if(json.has("HatchLocatoin")) {
			hatchLocation = json.get("HatchLocatoin").asText().trim();
		}
		if (json.has("LockType")) {
			lockType = json.get("LockType").asText().trim();
		}
		if (json.has("Openable")) {
			openable = json.get("Openable").asText().trim();
		}
		if (json.has("Material")) {
			material = json.get("Material").asText().trim();
		}
		if (json.has("SizeLength")) {

			String str = json.get("SizeLength").asText().trim();
			sizeLength = Float.parseFloat(str);
		}
		if (json.has("SizeWidth")) {
			String str = json.get("SizeWidth").asText().trim();
			sizeWidth = Float.parseFloat(str);
		}
		

		PublicSafetyHatch c = null;
		try {
			Container container = applicationContext.getBean(Container.class);
			IndoorGMLMap map = container.getDocument(docId);
			/*
			 * 
			 * if(geomFormatType.equals("GEOJSON")){ c =
			 * CellSpaceBoundaryDAO.createCellSpaceBoundary(map, parentId, id, geometry,
			 * duality); } else if(geomFormatType.equals("WKT")){ c =
			 * CellSpaceBoundaryDAO.createCellSpaceBoundary(map, parentId, id, geom,
			 * duality); }
			 */

			c = PublicSafetyHatchDAO.createPublicSafetyHatch(map, parentId, id, name, description, geometry, duality,
					fireEscape, hatchLocation, lockType, openable, material, sizeLength, sizeWidth);

		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new UndefinedDocumentException();
		}
		response.setHeader("Location", request.getRequestURL().append(c.getId()).toString());
	}

	@PutMapping(value = "/{id}", produces = "application/json")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void updatePublicSafetyHatch(@PathVariable("docId") String docId, @PathVariable("id") String id,
			@RequestBody ObjectNode json, HttpServletRequest request, HttpServletResponse response) {
		try {
			Container container = applicationContext.getBean(Container.class);
			IndoorGMLMap map = container.getDocument(docId);
			String duality = null;
			JsonNode geometry = null;
			Geometry geom = null;
			String parentId = null;
			String name = null;
			String description = null;

			if (json.has("parentId")) {
				parentId = json.get("parentId").asText().trim();
			}

			if (json.has("duality")) {

				duality = json.get("duality").asText().trim();

			}
			if (json.has("properties")) {
				if (json.get("properties").has("duality")) {
					duality = json.get("properties").get("duality").asText().trim();
				}
			}
			if (json.has("geometry")) {
				geometry = json.get("geometry");
				geom = Convert2Json.json2Geometry(geometry);

			}

			if (json.has("properties")) {
				if (json.get("properties").has("name")) {
					name = json.get("properties").get("name").asText().trim();
				}
				if (json.get("properties").has("description")) {
					description = json.get("properties").get("description").asText().trim();
				}
			}

			PublicSafetyHatchDAO.updatePublicSafetyHatch(map, parentId, id, name, description, geom, duality);
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new UndefinedDocumentException();
		}
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	@ResponseStatus(HttpStatus.FOUND)
	public void getPublicSafetyHatch(@PathVariable("docId") String docId, @PathVariable("id") String id,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			Container container = applicationContext.getBean(Container.class);
			IndoorGMLMap map = container.getDocument(docId);

			ObjectNode target = Convert2Json.convert2JSON(map, PublicSafetyHatchDAO.readPublicSafetyHatch(map, id));
			response.setContentType("application/json;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print(target);
			out.flush();

		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new UndefinedDocumentException();
		}
	}

	@DeleteMapping(value = "/{id}", produces = "application/json")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePublicSafetyHatch(@PathVariable("docId") String docId, @PathVariable("id") String id,
			@RequestBody ObjectNode json, HttpServletRequest request, HttpServletResponse response) {
		try {
			Container container = applicationContext.getBean(Container.class);
			IndoorGMLMap map = container.getDocument(docId);
			PublicSafetyHatchDAO.deletePublicSafetyHatch(map, id);
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new UndefinedDocumentException();
		}
	}

}
