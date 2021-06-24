package com.xworkz.river.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.river.dao.RiverDAOImpl;
import com.xworkz.river.dto.RiverDTO;
import com.xworkz.river.exception.RiverName;

@Component
public class RiverServiceImpl implements RiverService {
	@Autowired
	private RiverDAOImpl daoImple;
	boolean isValidData = true;

	@Override
	public void riverValidDeatils(RiverDTO dto) throws RuntimeException {
		System.out.println("checking validate_RIVER_Details");

		if (dto.getRiverName() == null || dto.getRiverName().length() < 4) {
			isValidData = false;
			throw new RiverName("Plase Enter valid_Name properly ");
		} else if (dto.getRiverId() == 0) {
			isValidData = false;
			throw new RiverName(" provide valid river_id");
		} else if (dto.getRiverDamNo() == 0) {
			isValidData = false;
			throw new RiverName("provide valid river_damno");
		} else if (dto.getRiverLength() == 0) {
			isValidData = false;
			throw new RiverName("provide valid river_length");
		} else if (dto.getRiverOrigin() == null) {
			throw new RiverName("provide valid river_origin");
		} else if (dto.getRiverPolluted() == 0) {
			isValidData = false;
			throw new RiverName("provide valid river_polluted");
		}
		if (isValidData) {
			daoImple.saveRiverDTO(dto);
		}
	}
}