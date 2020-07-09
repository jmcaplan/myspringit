package com.vega.myspringit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.*;

@Entity
@RequiredArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
public class Comment extends Auditable {

	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String body;
	
	@ManyToOne
	@NonNull
	private Link link;
	
}
