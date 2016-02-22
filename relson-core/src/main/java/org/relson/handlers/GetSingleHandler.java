/*
 User: Ophir
 Date: 04/05/13
 Time: 23:25
 */
package org.relson.handlers;

import com.google.common.base.Optional;

public interface GetSingleHandler<K, E> extends ResourceHandler {

	Optional<E> get(K id);
}
