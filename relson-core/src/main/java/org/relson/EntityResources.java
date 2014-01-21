/*
 User: Ophir
 Date: 04/05/13
 Time: 22:49
 */
package org.relson;

import org.relson.handlers.FindHandler;
import org.relson.handlers.GetSingleHandler;
import org.relson.handlers.GetSomeHandler;

public class EntityResources {

	private String pathPrefix;
	private final Class<?> entityType;
	private GetSingleHandler<?, ?> getSingleHandler;
	private GetSomeHandler<?, ?> getSomeHandler;
	private FindHandler<?> findHandler;

	public EntityResources(String pathPrefix, Class<?> entityType) {
		this.entityType = entityType;
	}

	public Class<?> getEntityType() {
		return entityType;
	}
}
