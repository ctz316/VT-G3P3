package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permission_level")
public class PermissionLevel {
	
	@Id
	@Column(name = "permission_id")
	private int permissionId;

	@Column(name = "name")
	private String name;
	
	public PermissionLevel() { }
	
	public PermissionLevel(int permissionId) {
		this.permissionId = permissionId;
	}

	public PermissionLevel(int permissionid, String name) {
		super();
		this.permissionId = permissionid;
		this.name = name;
	}

	public int getPermissionsId() {
		return permissionId;
	}

	public void setPermissionId(int permissionid) {
		this.permissionId = permissionid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(permissionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PermissionLevel other = (PermissionLevel) obj;
		return permissionId == other.permissionId;
	}	
}
