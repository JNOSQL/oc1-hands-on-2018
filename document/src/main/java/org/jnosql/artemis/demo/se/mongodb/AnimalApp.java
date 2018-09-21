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

import org.jnosql.artemis.DatabaseQualifier;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.util.Optional;

public class AnimalApp {

    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            AnimalRepository repository = container.select(AnimalRepository.class, DatabaseQualifier.ofDocument()).get();

            String id = "lion";
            Animal animal = new Animal(id, "Lion");
            repository.save(animal);
            Optional<Animal> lion = repository.findById(id);
            System.out.println("save (will create)" + lion);
            animal = new Animal(id, "Lion Updated");
            repository.save(animal);
            lion = repository.findById(id);
            System.out.println("save (will update)" + lion);
            repository.deleteById(id);
            lion = repository.findById(id);
            System.out.println("save (will empty)" + lion);
        }
    }
}
