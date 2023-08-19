package com.linkedin.collections;

import java.util.Collection;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.0);
		Room picadilly = new Room("Picadilly", "Guest Room", 3, 105.0);
		Room oxford = new Room("Oxford", "Suite", 3, 125.0);

		Collection<Room> rooms = List.of(cambridge, manchester, picadilly, oxford);
		double total = getPotentialRevenue(rooms);
		System.out.println(total);
	}
	
	private static double getPotentialRevenue(Collection<Room> rooms) {
		return rooms.stream()
					.mapToDouble(r -> r.getRate())
					.sum();
	}
}