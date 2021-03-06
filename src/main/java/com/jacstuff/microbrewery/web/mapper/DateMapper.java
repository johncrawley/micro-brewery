package com.jacstuff.microbrewery.web.mapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.springframework.stereotype.Component;

@Component
public class DateMapper {

	public OffsetDateTime asOffsetDateTime(Timestamp timestamp) {
		if(timestamp == null) {
			return null;
		}
		LocalDateTime ldt = timestamp.toLocalDateTime();
		return OffsetDateTime.of(
				ldt.getYear(),
				ldt.getMonthValue(),
				ldt.getDayOfMonth(),
				ldt.getHour(),
				ldt.getMinute(),
				ldt.getSecond(),
				ldt.getNano(),
				ZoneOffset.UTC);
	}
	
	
	public Timestamp asTimeStamp(OffsetDateTime offsetDateTime) {
		if(offsetDateTime == null) {
			return null;
		}
		return Timestamp.valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
	}

}
