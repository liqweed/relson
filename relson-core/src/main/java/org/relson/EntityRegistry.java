/*
 User: Ophir
 Date: 04/05/13
 Time: 22:49
 */
package org.relson;

import com.google.common.collect.Maps;

import java.util.Map;

public class EntityRegistry {

	private final Map<Class<?>, EntityResources> entityResourcesMap = Maps.newConcurrentMap();

}
