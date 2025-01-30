package com.service;

import java.util.ArrayList;
import java.util.List;

import com.enity.PersonInfo;

public class Account {

	private List<PersonInfo> followers = new ArrayList<>();
	private List<PersonInfo> following = new ArrayList<>();

	public synchronized void addToFollow(PersonInfo... allPersonsInfos) {
		for (PersonInfo p : allPersonsInfos) {
			if (p.isPublic()) {
				// add to follow
				followers.add(p);
				System.out.println(p.getName() + ": is added to followers list");
			} else {
				// Request to follow
				System.out.println(p.getName() + ": is private account sending the requests");
				p.setRequestedToFollow(true);
			}

		}
	}

	public synchronized void acceptFollowers(PersonInfo... requestsRecived) {
		for (PersonInfo p : requestsRecived) {
			following.add(p);
			if (followers.contains(p)) {
				System.out.println(p.getName() + " is following you..!");
			} else {
				System.out.println(p.getName() + " is not following you..!");
			}
		}
	}

	public List<PersonInfo> notFollowingBack() {
		List<PersonInfo> notFollowBack = new ArrayList<>();

		for (PersonInfo p : following) {
			if (!followers.contains(p)) {
				notFollowBack.add(p);
			}
		}

		System.out.println("Total " + notFollowBack.size() + " are not following back..!!");
		if (notFollowBack.size() > 0)
			System.out.println("And the accounts are: " + notFollowBack);

		return notFollowBack;

	}

	public List<PersonInfo> notFollowing() {
		List<PersonInfo> notFollowing = new ArrayList<>();

		for (PersonInfo p : followers) {
			if (!following.contains(p)) {
				notFollowing.add(p);
			}
		}

		System.out.println("Total " + notFollowing.size() + " are not following by you..!!");
		if (notFollowing.size() > 0)
			System.out.println("And the accounts are: " + notFollowing);

		return notFollowing;

	}

}
