package com.app.lotery.msGenerarJugada.model;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.TypeDef;
/*import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;*/

import com.vladmihalcea.hibernate.type.array.IntArrayType;

@TypeDef(
     name = "int-array",
     typeClass = IntArrayType.class
)


@MappedSuperclass
public class BaseEntity {
/*	@Id
    private Long id;
 
    @Version
    private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}*/
}
