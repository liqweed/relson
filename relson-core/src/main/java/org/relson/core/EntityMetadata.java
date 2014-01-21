/*
 User: ophir
 Date: 22/01/14
 Time: 01:05
 */
package org.relson.core;

import com.google.common.collect.Maps;
import java.util.Map;
import org.relson.handlers.ResourceHandler;
import org.relson.model.ResourceHandlerType;

public class EntityMetadata {

	private final Class<?> type;
	private final Map<ResourceHandlerType, Class<? extends ResourceHandler>> handlers = Maps.newConcurrentMap();

	public EntityMetadata(Class<?> type) {
		this.type = type;
	}

	public Class<?> getType() {
		return type;
	}
}
