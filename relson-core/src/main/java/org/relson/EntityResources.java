/*
 User: Ophir
 Date: 04/05/13
 Time: 22:49
 */
package org.relson;

import java.util.Collections;
import java.util.Map;
import org.relson.handlers.ResourceHandler;
import org.relson.model.ResourceType;

public class EntityResources {

	private String pathPrefix;
	private final Class<?> entityType;
	private Map<ResourceType, ResourceHandler> handlers = Collections.emptyMap();

	public EntityResources(String pathPrefix, Class<?> entityType) {
		this.entityType = entityType;
	}

	public Class<?> getEntityType() {
		return entityType;
	}
}
