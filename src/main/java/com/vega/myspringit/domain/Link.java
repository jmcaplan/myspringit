package com.vega.myspringit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.*;

@Entity
@RequiredArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
public class Link extends Auditable {

	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String title;
	@NonNull
	private String url;
	
	@OneToMany(mappedBy = "link")
	private List<Comment> comments = new ArrayList<>();
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
}
