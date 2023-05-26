package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_salt")
public class UserSalt {
	
	@Id
	@Column(name = "salt_id")
	private int saltId;
	
	@Column(name = "salt")
	private String salt;
	
	@Column(name = "user_id")
	private int userId;
	
	public UserSalt() { }

	public UserSalt(int saltId, String salt, int userId) {
		super();
		this.saltId = saltId;
		this.salt = salt;
		this.userId = userId;
	}

	public int getSaltId() {
		return saltId;
	}

	public void setSaltId(int saltId) {
		this.saltId = saltId;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserSalts [saltId=" + saltId + ", salt=" + salt + ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(salt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSalt other = (UserSalt) obj;
		return Objects.equals(salt, other.salt);
	}
	
}
