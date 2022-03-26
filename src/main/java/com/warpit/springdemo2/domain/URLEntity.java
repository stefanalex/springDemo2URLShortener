package com.warpit.springdemo2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class URLEntity {
	
	@Column
	private String protocol;
	
	@Column
	private Domain doomain;
	
		
	@Column
	private String articlePermanLink;

}
