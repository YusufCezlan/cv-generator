package com.odev;

import java.util.ArrayList;
import java.util.List;

public class ResumeData {
    private String fullName;
    private String title;
    private String email;
    private String phone;
    private String imagePath;
    private List<Experience> experiences;

    public ResumeData(String fullName, String title, String email, String phone, String imagePath) {
        this.fullName = fullName;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.imagePath = imagePath;
        this.experiences = new ArrayList<>();
    }

    public void addExperience(Experience exp) {
        this.experiences.add(exp);
    }

    public String getFullName() { return fullName; }
    public String getTitle() { return title; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getImagePath() { return imagePath; }
    public List<Experience> getExperiences() { return experiences; }
}