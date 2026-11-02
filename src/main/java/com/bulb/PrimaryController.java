package com.bulb;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PrimaryController {

    @FXML
    private TextField companyField;
    @FXML
    private TextField jobTitleField;
    @FXML 
    private Label feedbackLabel;

    @FXML
    private void addApplication(){
        String company = companyField.getText().trim();
        String jobTitle = jobTitleField.getText().trim();

        if(!company.isEmpty() && !jobTitle.isEmpty()){
            JobApplication application = new JobApplication(company, jobTitle);

            feedbackLabel.setText("Application added: " + application.getCompany() + " - " + application.getJobTitle());
            companyField.clear();
            jobTitleField.clear();
        } else {
            feedbackLabel.setText("Please fill in both fields.");
        }
    }  
}
