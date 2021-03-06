/*******************************************************************************
 * Copyright (c) 2012 VMWare, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     VMWare, Inc. - initial API and implementation
 *******************************************************************************/
package org.grails.ide.eclipse.editor.groovy.elements;

import org.eclipse.core.resources.IFolder;

/**
 * A grails element that supports navigation between other
 * related grails elements
 * @author Andrew Eisenberg
 * @created Jun 1, 2010
 */
public interface INavigableGrailsElement extends IGrailsArtifact {
    public ServiceClass getServiceClass();
    public TagLibClass getTagLibClass();
    public ControllerClass getControllerClass();
    public DomainClass getDomainClass();
    public IFolder getGSPFolder();
    public String getAssociatedDomainClassName();
}
