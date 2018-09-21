package org.jnosql.artemis.demo.se.mongodb.project;

import org.jnosql.artemis.document.DocumentQueryMapperBuilder;
import org.jnosql.artemis.document.DocumentTemplate;
import org.jnosql.diana.api.document.DocumentQuery;
import org.jnosql.diana.api.document.query.DocumentQueryBuilder;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {

        Project project = new Project();
        Tag tag = new Tag();
        tag.setId("java");
        tag.setName("Java");
        Tag tag2 = new Tag();
        tag2.setId("nosql");
        tag2.setName("Nosql");

        project.setId("id");
        project.setName("project");
        List<Partner> partners = new ArrayList<>();
        Partner partner = new Partner();
        partner.setCountry("Brazil");
        partner.setRole("role");
        partner.setName("name");
        partner.setType("type");
        Address address = new Address();
        address.setCountry("Brazil");
        address.setStreet("street");
        address.setLatitude(12D);
        address.setLongitude(10D);
        address.setNumber("number");
        partner.setLocation(address);
        partner.setTags(Arrays.asList(tag, tag2));
        partners.add(partner);
        project.setPartners(partners);

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            DocumentTemplate documentTemplate = container.select(DocumentTemplate.class).get();
            documentTemplate.delete(Project.class, "id");

            documentTemplate.insert(project);
            DocumentQueryMapperBuilder builder = container.select(DocumentQueryMapperBuilder.class).get();

            DocumentQuery query = builder.selectFrom(Project.class).where("partners.tags.id").eq("java").build();
            Optional<Project> result = documentTemplate.singleResult(query);
            System.out.println("query by tag java " + result);
            Optional<Project> id = documentTemplate.find(Project.class, "id");
            System.out.println(id);
            project = id.get();
            project.setName("update the");
            documentTemplate.update(project);

//            documentTemplate.delete(Project.class, "id");
//            id = documentTemplate.find(Project.class, "id");
//            System.out.println(id);
        }
    }


}
