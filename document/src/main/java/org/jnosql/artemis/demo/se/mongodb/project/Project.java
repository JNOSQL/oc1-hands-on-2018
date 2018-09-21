package org.jnosql.artemis.demo.se.mongodb.project;


import org.jnosql.artemis.Column;
import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

import java.util.LinkedList;
import java.util.List;

@Entity(value = "projects")
public class Project {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private List<Partner> partners = new LinkedList<>();

    public String getId() {
        return id;
    }

    public Project setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public List<Partner> getPartners() {
        return partners;
    }

    public Project setPartners(List<Partner> partners) {
        this.partners = partners;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Project{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", partners=").append(partners);
        sb.append('}');
        return sb.toString();
    }
}
