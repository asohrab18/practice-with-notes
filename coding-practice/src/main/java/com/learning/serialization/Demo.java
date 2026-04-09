package com.learning.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	private static final String FILE_NAME = "user.ser";

	// Serialization
	public static void serialize() throws IOException {

		UserDetails user = new UserDetails();
		user.setName("Sohrab");

		try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(user);
		}
	}

	// Deserialization
	public static void deserialize() throws IOException, ClassNotFoundException {

		try (FileInputStream fis = new FileInputStream(FILE_NAME); 
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			UserDetails user = (UserDetails) ois.readObject();
			System.out.println(user.getName());
		}
	}

	public static void main(String[] args) throws Exception {
		serialize();
		deserialize();
	}
}