package com.spring.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class TempDTO {
	
	 int no;
	 String title;
	 String content;
	 boolean accept;
	 String regDate;
	
}
