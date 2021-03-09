package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDto;

public interface HospitalDao {
public void hospitalAddDto(HospitalDto dto);
public void displayHospitalDetails();
public void updateDisplayLicense(String licenseNumber,String phoneNo);
public void delete(String licenseNumber);
public void passParticularData(String licenseNumber,String founder);
}
