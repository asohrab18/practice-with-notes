package com.learning.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ObjectsDemo {

	private static final Map<String, List<String>> usersMap = new HashMap<>();
	static {
		usersMap.put("alams1", Arrays.asList("Meerut", "UP", "India"));
		usersMap.put("priya2", Arrays.asList("New Delhi", "DL", "India"));
		usersMap.put("tejas3", Arrays.asList("Hyderabad", "Telangana", "India"));
	}

	public static void getUserDetails(String username) {
		Objects.requireNonNull(username, () -> "username cannot be null");		

		System.out.println(username);
		List<String> details = usersMap.get(username);
		if (details != null) {
			for (String d : details) {
				System.out.println(d);
			}
		}

	}

	public static void main(String[] args) {
		getUserDetails(null);
	}

}
