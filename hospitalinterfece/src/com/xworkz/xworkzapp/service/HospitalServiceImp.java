package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.HospitalDaoImp;
import com.xworkz.xworkzapp.dto.HospitalDto;

public class HospitalServiceImp implements HospitalService {
	private HospitalDaoImp hdi = new HospitalDaoImp();

	public HospitalServiceImp() {
		System.out.println(" inside hospiatal service implementation");
	}

	@Override
	public void checkingValidLicenseNumber(HospitalDto dto) {
		// TODO Auto-generated method stub
		boolean isvalidData = true;
		if (dto.getLicenseNumber() == null || dto.getLicenseNumber().length() != 8) {
			System.out.println("invalid license number");
			isvalidData = false;
		}
		if (dto.getName() == null || dto.getName().length() < 4) {
			System.out.println("invalid name");
			isvalidData = false;
		}
		if (dto.getLocation() == null || dto.getLocation().length() < 8) {
			System.out.println("invalid location");
			isvalidData = false;
			if (dto.getFounder() == null || dto.getLocation().length() < 6) {
				System.out.println("invalid founder");
				isvalidData = false;
				if (dto.getSpecialization() == null || dto.getSpecialization().length() < 8) {
					System.out.println("invalid specialization");
					isvalidData = false;

				}
				if (dto.getPhoneNo() == null || dto.getPhoneNo().length() < 10) {
					System.out.println("invalid phone_number");
					isvalidData = false;

				}
			}
		}
		if (isvalidData) {
			hdi.hospitalAddDto(dto);
		}
	}

	@Override
	public void displayall() {
		// TODO Auto-generated method stub
		hdi.displayHospitalDetails();
	}

	@Override
	public void checkUpadateDetails(String licenseNumber, String phoneNo) {
		if (licenseNumber != null || phoneNo != null) {
			hdi.updateDisplayLicense(licenseNumber, phoneNo);
		}
	}

	@Override
	public void checkdelete(String licenseNumber) {
		// TODO Auto-generated method stub
		if(licenseNumber!=null){
		hdi.delete(licenseNumber);	
		}
		
	}

	@Override
	public void twiceCheckingData(String licenseNumber, String founder) {
		// TODO Auto-generated method stub
		if(licenseNumber!=null&&founder!=null ){
			hdi.passParticularData(licenseNumber, founder);
		}
	}	
	
	
}
