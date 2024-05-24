package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Company {

    private Long companyId;

    private String companyName;

    private String contactInfo;

    public Long getCompanyId() {
        return this.companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getContactInfo(){
        return this.contactInfo;
    }
}
