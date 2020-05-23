package com.java.sks.rest.model;
public class Feature {

    public Feature(String featureName, String email, boolean enable) {
        this.featureName = featureName;
        this.email = email;
        this.enable = enable;
    }

    private String featureName;

    private String email;
    private boolean enable;

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEnable() {
        return enable;
    }



}
