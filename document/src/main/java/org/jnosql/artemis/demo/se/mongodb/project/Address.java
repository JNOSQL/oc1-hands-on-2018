package org.jnosql.artemis.demo.se.mongodb.project;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Embeddable;
import org.jnosql.artemis.Entity;

@Entity
public class Address {
    @Column
    private String number;

    @Column
    private String street;

    @Column
    private Long osmCityId;

    @Column
    private String cityName;

    @Column
    private String zipCode;

    @Column
    private String country;

    @Column
    private Double longitude;

    @Column
    private Double latitude;

    public String getNumber() {
        return number;
    }

    public Address setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public Long getOsmCityId() {
        return osmCityId;
    }

    public Address setOsmCityId(Long osmCityId) {
        this.osmCityId = osmCityId;
        return this;
    }

    public String getCityName() {
        return cityName;
    }

    public Address setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Address setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Address setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("number='").append(number).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", osmCityId=").append(osmCityId);
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append('}');
        return sb.toString();
    }
}
