package org.mupro.springbootapi.model;


import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String district;
    private String sector;
    private String cell;

    public Address(){}
    public Address(String district, String sector, String cell) {
        this.district = district;
        this.sector = sector;
        this.cell = cell;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
