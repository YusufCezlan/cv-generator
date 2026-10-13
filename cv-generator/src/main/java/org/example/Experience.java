package com.odev;

public class Experience {
    private String company;
    private String position;
    private String dateRange;
    private String description;

    public Experience(String company, String position, String dateRange, String description) {
        this.company = company;
        this.position = position;
        this.dateRange = dateRange;
        this.description = description;
    }

    public String getCompany() { return company; }
    public String getPosition() { return position; }
    public String getDateRange() { return dateRange; }
    public String getDescription() { return description; }
}