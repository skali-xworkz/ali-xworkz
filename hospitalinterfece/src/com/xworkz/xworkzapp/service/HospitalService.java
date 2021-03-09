package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.HospitalDto;

public interface HospitalService {
public void checkingValidLicenseNumber(HospitalDto dto);
public void displayall();
public void checkUpadateDetails(String licenseNumber, String phoneNo);
public void checkdelete(String licenseNumber);
public void twiceCheckingData(String licenseNumber,String founder);
}
