package com.example.server.model;
import jakarta.persistence.*;


@Entity
@Table(name = "views")
public class view {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column
    String ChartType;
    @Column
    String Country;
    @Column
    String Indicator;
    @Column
    String StartDate;

    @Column
    String EndDate;


    public view (String ChartType,String Country,String Indicator,String StartDate,String EndDate){
        this.ChartType=ChartType;
        this.Country=Country;
        this.Indicator=Indicator;
        this.StartDate=StartDate;
        this.EndDate=EndDate;
    }

    public view(){

    }


    public long getId(){
        return id;
    }
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
