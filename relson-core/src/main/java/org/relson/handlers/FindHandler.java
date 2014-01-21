/*
 User: Ophir
 Date: 05/05/13
 Time: 00:05
 */
package org.relson.handlers;

import java.util.List;

public interface FindHandler<E> extends ResourceHandler {

	List<E> find(E entityFilter);
}
