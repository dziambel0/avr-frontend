package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    private final String BASE_URL = "http://localhost:8080/api/company";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Company> getAllCompanys() {
        Company[] company = restTemplate.getForObject(BASE_URL, Company[].class);
        return Arrays.asList(company);
    }

}
