package com.enity;

import java.util.Map;

import com.service.Account;

public class PersonInfo {

	private String name;
	private int age;
	private String email;
	private String password;
	private String bio;

	private int followers;
	private int following;

	private boolean isPublic;
	private Map<String, Boolean> requestedAccounts;
	private boolean isRequestedToFollow;

	public boolean isRequestedToFollow() {
		return isRequestedToFollow;
	}

	public void setRequestedToFollow(boolean isRequestedToFollow) {
		this.isRequestedToFollow = isRequestedToFollow;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

}
