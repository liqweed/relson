/*
 User: Ophir
 Date: 05/05/13
 Time: 00:03
 */
package org.relson.handlers;

import java.util.List;

public interface GetSomeHandler<K, E> extends ResourceHandler {

	List<E> getSome(List<K> ids);
}
