/*
 * Copyright (c) 2017 Otávio Santana and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *
 * Otavio Santana
 */

package org.jnosql.artemis.demo.se.mongodb;


import org.jnosql.diana.api.document.DocumentCollectionManager;
import org.jnosql.diana.api.document.DocumentCollectionManagerFactory;
import org.jnosql.diana.api.document.DocumentConfiguration;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class MongoDBProducer {

    private static final String COLLECTION = "developers";

    private DocumentCollectionManagerFactory<DocumentCollectionManager> managerFactory;

    @PostConstruct
    public void init() {
        DocumentConfiguration<?> configuration = getConfiguration();
        managerFactory = configuration.get();
    }

    @Produces
    public DocumentCollectionManager getManager() {
        return managerFactory.get(COLLECTION);

    }

    private DocumentConfiguration<DocumentCollectionManagerFactory> getConfiguration() {
        throw new UnsupportedOperationException("Don't forget to add a driver as dependency and set its implementation here.");
    }

}
