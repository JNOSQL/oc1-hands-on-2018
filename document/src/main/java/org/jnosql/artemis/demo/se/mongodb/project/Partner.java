package org.jnosql.artemis.demo.se.mongodb.project;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Embeddable;
import org.jnosql.artemis.Entity;

import java.util.List;


@Entity
public class Partner {

    @Column
    private String name;

    @Column
    private String country;

    @Column
    private String type; // TODO: Add an enum

    @Column
    private String role;

    @Column
    private Address location;

    @Column
    private List<Tag> tags;

    public String getName() {
        return name;
    }

    public Partner setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Partner setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getType() {
        return type;
    }

    public Partner setType(String type) {
        this.type = type;
        return this;
    }

    public String getRole() {
        return role;
    }

    public Partner setRole(String role) {
        this.role = role;
        return this;
    }

    public Address getLocation() {
        return location;
    }

    public Partner setLocation(Address location) {
        this.location = location;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Partner setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Partner{");
        sb.append("name='").append(name).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", role='").append(role).append('\'');
        sb.append(", location=").append(location);
        sb.append(", tags=").append(tags);
        sb.append('}');
        return sb.toString();
    }
}
