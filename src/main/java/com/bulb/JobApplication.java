package com.bulb;

public class JobApplication {
    private String company;
    private String jobTitle;

    public JobApplication(String company, String jobTitle) {
        this.company = company;
        this.jobTitle = jobTitle;
    }  

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
