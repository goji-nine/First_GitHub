package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Component @Getter @Setter //@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {

	@NonNull
	private Chef chef;
	private int age;

//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
	
	

}
