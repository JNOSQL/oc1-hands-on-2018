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

package org.jnosql.artemis.demo.se.redis;

import java.util.List;


public class UserBuilder {

    private String username;

    private String name;

    private List<String> phones;


    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }


    public UserBuilder withPhones(List<String> phones) {
        this.phones = phones;
        return this;
    }

    public User build() {
        return new User(username, name, phones);
    }
}
