/*
 User: Ophir
 Date: 04/05/13
 Time: 23:25
 */
package org.relson.handlers;

public interface GetSingleHandler<K, E> extends ResourceHandler {

	E get(K id);
}
