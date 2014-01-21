/*
 User: ophir
 Date: 22/01/14
 Time: 01:12
 */
package org.relson.handlers;

import java.util.Set;

public interface RemoveHandler<K> extends ResourceHandler {

	void remove(Set<K> ids);
}
