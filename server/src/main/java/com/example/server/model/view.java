package com.example.server.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class view {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    Integer id;

    String ChartType;
    String Country;
    String Indicator;
    String StartDate;
    String EndDate;


    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getIndicator() {
        return Indicator;
    }

    public void setIndicator(String indicator) {
        Indicator = indicator;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getChartType() {
        return ChartType;
    }

    public void setChartType(String chartType) {
        ChartType = chartType;
    }
}
