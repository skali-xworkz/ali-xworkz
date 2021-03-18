package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.custom.InValidVehicle;
import com.xworkz.xworkzapp.custom.InvalidFireId;
import com.xworkz.xworkzapp.dto.FireDTO;

public class FireServiceImp implements FireService {

	public FireServiceImp() {
		// TODO Auto-generated constructor stub
		System.out.println("inside service impl");
	}

	@Override
	public void validId(FireDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("validate method");

		try {
			if (dto.getId() == null || !dto.getId().startsWith("FIR")) {
				throw new InvalidFireId("please provide valid ID & name");
			}
			if(dto.getNoOfVehicles()<2){
				throw new InValidVehicle("insufficent invalid Vehicle");
			}

		} catch (InvalidFireId e) {
			// TODO Auto-generated catch block
			System.out.println("exception occured invalidID & name");
		}
		catch (InValidVehicle f) {
			// TODO Auto-generated catch block
			System.out.println("exception occured invalid vehicle");
		}
		
	}
}
