/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.api;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Discovery;

/**
 * Interface for Discoverer List operations, basically a specialization of the list interface for discoverers
 * @author Guillaume Doux
 *
 */
public interface IDiscovererList extends List<Discovery> {

	/**
	 * Return the list of Discovery elements
	 * @return the list
	 */
	public abstract List<Discovery> getDiscoverers();

	/**
	 * @see java.util.List#add(int, Object)
	 */
	public abstract void add(int index,
			Discovery element);

	/**
	 * @see java.util.List#add(Object)
	 */
	public abstract boolean add(Discovery e);

	/**
	 * @see java.util.List#addAll(Collection)
	 */
	public abstract boolean addAll(
			Collection<? extends Discovery> c);

	/**
	 * @see java.util.List#addAll(int, Collection)
	 */
	public abstract boolean addAll(int index,
			Collection<? extends Discovery> c);

	/**
	 * @see java.util.List#clear()
	 */
	public abstract void clear();

	/**
	 * @see java.util.List#contains(Object)
	 */
	public abstract boolean contains(Object o);

	/**
	 * @see java.util.List#containsAll(Collection)
	 */
	public abstract boolean containsAll(Collection<?> c);

	/**
	 * @see java.util.List#equals(Object)
	 */
	public abstract boolean equals(Object o);

	/**
	 * @see java.util.List#get(int)
	 */
	public abstract Discovery get(int index);

	/**
	 * @see java.util.List#hashCode()
	 */
	public abstract int hashCode();

	/**
	 * @see java.util.List#indexOf(Object)
	 */
	public abstract int indexOf(Object o);

	/**
	 * @see java.util.List#isEmpty()
	 */
	public abstract boolean isEmpty();

	/**
	 * @see java.util.List#iterator()
	 */
	public abstract Iterator<Discovery> iterator();

	/**
	 * @see java.util.List#lastIndexOf(Object)
	 */
	public abstract int lastIndexOf(Object o);

	/**
	 * @see java.util.List#listIterator()
	 */
	public abstract ListIterator<Discovery> listIterator();

	/**
	 * @see java.util.List#listIterator(int)
	 */
	public abstract ListIterator<Discovery> listIterator(
			int index);

	/**
	 * @see java.util.List#remove(int)
	 */
	public abstract Discovery remove(int index);

	/**
	 * @see java.util.List#remove(Object)
	 */
	public abstract boolean remove(Object o);

	/**
	 * @see java.util.List#removeAll(Collection)
	 */
	public abstract boolean removeAll(Collection<?> c);

	/**
	 * @see java.util.List#retainAll(Collection)
	 */
	public abstract boolean retainAll(Collection<?> c);

	/**
	 * @see java.util.List#set(int, Object)
	 */
	public abstract Discovery set(int index,
			Discovery element);

	/**
	 * @see java.util.List#size()
	 */
	public abstract int size();

	/**
	 * @see java.util.List#subList(int, int)
	 */
	public abstract List<Discovery> subList(
			int fromIndex, int toIndex);

	/**
	 * @see java.util.List#toArray()
	 */
	public abstract Object[] toArray();

	/**
	 * @see java.util.List#toArray(Object[])
	 */
	public abstract <T> T[] toArray(T[] a);
	
	/**
	 * @see java.util.List#toString()
	 */
	public abstract String toString();

}