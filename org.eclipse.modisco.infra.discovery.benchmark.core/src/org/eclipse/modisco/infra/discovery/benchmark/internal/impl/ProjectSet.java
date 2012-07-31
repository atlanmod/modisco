/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.internal.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.api.IProjectSet;

/**
 * the project set implementation
 * @see IProjectSet
 * @author Guillaume Doux
 *
 */
public class ProjectSet implements IProjectSet {

	private List<IProject> projects;

	private Map<IProject, Long> projectSize;

	public ProjectSet() {
		super();
		this.projects = new LinkedList<IProject>();
		this.projectSize = new HashMap<IProject, Long>();
	}

	/**
	 * return the size of the project
	 * @param p must be owned by the projectSet
	 * @return the size
	 * @throws CoreException 
	 */
	public long getProjectSize(final IProject p) throws CoreException {
		if (this.projectSize.keySet().contains(p)) {
			return this.projectSize.get(p);
		} else {
			if (this.projects.contains(p)) {
				long s = size((IContainer) p);
				this.projectSize.put(p, s);
				return s;
			} else {
				return size((IContainer) p);
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#add(int, org.eclipse.core.resources.IProject)
	 */
	@Override
	public void add(final int arg0, final IProject arg1) {
		this.projects.add(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#add(org.eclipse.core.resources.IProject)
	 */
	@Override
	public boolean add(final IProject toAdd) {
		return this.projects.add(toAdd);
	}

	public IProjectSet sortBySize() {
		Collections.sort(this.projects, new Comparator<IProject>() {

			@Override
			public int compare(final IProject arg0, final IProject arg1) {
				try {
					if (getProjectSize(arg0) < getProjectSize(arg1)) {
						return -1; 
					}
					if (getProjectSize(arg0) == getProjectSize(arg1)) {
						return 0;
					}
					if (getProjectSize(arg0) > getProjectSize(arg1)) {
						return 1;
					}
				} catch (CoreException e) {
					MoDiscoLogger.logError(e,
							"Could not compute size of a project. The project set will not be sorted.", org.eclipse.modisco.infra.discovery.benchmark.api.Activator.getDefault()); //$NON-NLS-1$
					return 0;
				}
				return 0;
			}
		});
		return this;
	}

	private long size(final IContainer container) throws CoreException {
		long size = 0;
		for (IResource res : container.members()) {
			if (res instanceof IFolder) {
				size += size((IContainer) res);
			} else {
				if (res instanceof IFile)  {
					IFileStore fileStore = EFS.getStore(res.getLocationURI());
					size += fileStore.fetchInfo().getLength();
				}
			}
		}
		return size;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#addAll(java.util.Collection)
	 */
	@Override
	public boolean addAll(final Collection<? extends IProject> arg0) {
		return this.projects.addAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#addAll(int, java.util.Collection)
	 */
	@Override
	public boolean addAll(final int arg0, final Collection<? extends IProject> arg1) {
		return this.projects.addAll(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#clear()
	 */
	@Override
	public void clear() {
		this.projects.clear();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(final Object arg0) {
		return this.projects.contains(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#containsAll(java.util.Collection)
	 */
	@Override
	public boolean containsAll(final Collection<?> arg0) {
		return this.projects.containsAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object arg0) {
		return this.projects.equals(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#get(int)
	 */
	@Override
	public IProject get(final int arg0) {
		return this.projects.get(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.projects.hashCode();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#indexOf(java.lang.Object)
	 */
	@Override
	public int indexOf(final Object arg0) {
		return this.projects.indexOf(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return this.projects.isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#iterator()
	 */
	@Override
	public Iterator<IProject> iterator() {
		return this.projects.iterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#lastIndexOf(java.lang.Object)
	 */
	@Override
	public int lastIndexOf(final Object arg0) {
		return this.projects.lastIndexOf(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#listIterator()
	 */
	@Override
	public ListIterator<IProject> listIterator() {
		return this.projects.listIterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#listIterator(int)
	 */
	@Override
	public ListIterator<IProject> listIterator(final int arg0) {
		return this.projects.listIterator(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#remove(int)
	 */
	@Override
	public IProject remove(final int arg0) {
		return this.projects.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(final Object arg0) {
		return this.projects.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#removeAll(java.util.Collection)
	 */
	@Override
	public boolean removeAll(final Collection<?> arg0) {
		return this.projects.removeAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#retainAll(java.util.Collection)
	 */
	@Override
	public boolean retainAll(final Collection<?> arg0) {
		return this.projects.retainAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#set(int, org.eclipse.core.resources.IProject)
	 */
	@Override
	public IProject set(final int arg0, final IProject arg1) {
		return this.projects.set(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#size()
	 */
	@Override
	public int size() {
		return this.projects.size();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#subList(int, int)
	 */
	@Override
	public List<IProject> subList(final int arg0, final int arg1) {
		return this.projects.subList(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#toArray()
	 */
	@Override
	public Object[] toArray() {
		return this.projects.toArray();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.internal.impl.IProjectSet#toArray(T[])
	 */
	@Override
	public <T> T[] toArray(final T[] arg0) {
		return this.projects.toArray(arg0);
	}

	@Override
	public List<IProject> getProjects() {
		return this.projects;
	}



}
