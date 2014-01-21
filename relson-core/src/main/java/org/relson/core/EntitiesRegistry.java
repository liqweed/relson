/*
 User: ophir
 Date: 22/01/14
 Time: 01:05
 */
package org.relson.core;

import com.google.common.collect.Maps;
import java.util.Map;

public class EntitiesRegistry {

	private final Map<Class<?>, EntityMetadata> entities = Maps.newConcurrentMap();

}
