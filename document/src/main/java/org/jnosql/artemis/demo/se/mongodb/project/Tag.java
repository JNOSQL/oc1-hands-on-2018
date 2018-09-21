package org.jnosql.artemis.demo.se.mongodb.project;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Entity;

@Entity
public class Tag {

    @Column
    private String id;

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public Tag setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Tag setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tag{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
