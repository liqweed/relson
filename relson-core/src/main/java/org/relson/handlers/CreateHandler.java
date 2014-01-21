/*
 User: ophir
 Date: 22/01/14
 Time: 01:13
 */
package org.relson.handlers;

public interface CreateHandler<K, E> extends ResourceHandler {

	K create(E entity);
}
