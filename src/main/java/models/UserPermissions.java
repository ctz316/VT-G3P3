package models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permissions")
public class UserPermissions {
	
	@Id
	@Column(name = "permission_id")
	private int permissionId;

	@Column(name = "name")
	private String name;
	
	public UserPermissions() { }

	public UserPermissions(int permissionid, String name) {
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
		UserPermissions other = (UserPermissions) obj;
		return permissionId == other.permissionId;
	}	
}
