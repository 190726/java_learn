package com.sk.jpa.started.ch02;

import javax.persistence.AttributeConverter;

public class GradeConverter implements AttributeConverter<Grade, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Grade attribute) {
		if(attribute==Grade.S1) {
			return 100;
		}else if(attribute==Grade.S2) {
			return 101;
		}
		return 102;
	}

	@Override
	public Grade convertToEntityAttribute(Integer dbData) {
		if(dbData == 100) {
			return Grade.S1;
		}else if(dbData == 101) {
			return Grade.S2;
		}
		return Grade.S3;
	}
}