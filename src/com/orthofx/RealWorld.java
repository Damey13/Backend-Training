package com.orthofx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RealWorld {

	static Scanner input = new Scanner(System.in);

	private static Map<String, Tower> towerTable = new HashMap<>();
	private static Map<Integer, Tenant> tenantTable = new HashMap<>();

	static String towerName;
	static String tenantName;

	public static void main(String[] args) {

		do {

			System.out.println("\n" + "Enter a choice" + "\n" + "\n1. Add Tower" + "\n2. Add Tenant"
					+ "\n3. View Tenant" + "\n4. Update Tenant" + "\n5. Delete Tenant" + "\n6. Exit" + "\n");

			int choice = input.nextInt();
			switch (choice) {

			case 1:
				System.out.println("\n" + "Add Tower" + "\n");
				System.out.println("Enter The Tower Name" + "\n");
				towerName = input.next();
				createTower(towerName);
				System.out.println("\n" + "Tower Added Successfully" + "\n");

				break;

			case 2:
				System.out.println("\n" + "Add Tenant" + "\n");
				System.out.println("Enter The Tenant Name" + "\n");
				tenantName = input.next();
				System.out.println("Enter The Tower Name" + "\n");
				towerName = input.next();
				if (towerTable.containsKey(towerName)) {
					createTenant(tenantName, towerTable.get(towerName));
					System.out.println("\n" + "Tenant Added Successfully" + "\n");

				} else {
					System.out.println("Tower Doesnt Exist");
				}

				break;

			case 3:
				System.out.println("\n" + "View Tenant" + "\n");
				System.out.println("Enter Tenant Id" + "\n");
				int id = input.nextInt();
				getTenant(id);
				break;

			case 4:
				System.out.println("\n" + "Update Tenant" + "\n");
				System.out.println("Enter Tenant Id" + "\n");
				id = input.nextInt();
				System.out.println("Enter New Tenant Name" + "\n");
				tenantName = input.next();
				System.out.println("Enter New Tower Name" + "\n");
				towerName = input.next();
				updateTenant(id, tenantName, towerTable.get(towerName));
				System.out.println("\n" + "Tenant Updated Successfully" + "\n");
				break;

			case 5:
				System.out.println("\n" + "Delete Tenant" + "\n");
				System.out.println("Enter Tenant Id" + "\n");
				id = input.nextInt();
				deleteTenant(id);
				System.out.println("\n" + "Tenant Deleted Successfully" + "\n");
				break;

			case 6:
				System.out.println("\n" + "Thank You For Using Application!!");
				System.exit(0);

			default:
				System.out.println("Please Enter Valid Choice" + "\n");
				break;
			}

		} while (true);

	}

	public static Tower createTower(String name) {
		Tower tower = new Tower(towerTable.size() + 1, name);
		towerTable.put(tower.getName(), tower);
		return tower;
	}

	public static Tenant createTenant(String name, Tower tower) {
		Tenant tenant = new Tenant(tenantTable.size() + 1, name, tower);
		tenantTable.put(tenant.getId(), tenant);
		return tenant;
	}

	public static void getTenant(int id) {
		try {
			Tenant tenant = tenantTable.get(id);
			System.out.println(tenant.getName() + " " + tenant.getTowerName());
		} catch (NullPointerException e) {
			System.out.println("Invalid");
		}
	}

	public static Tenant updateTenant(int id, String name, Tower tower) {
		Tenant tenant = new Tenant(id, name, tower);
		tenantTable.put(id, tenant);
		return tenant;
	}

	public static void deleteTenant(int id) {
		tenantTable.remove(id);
	}

}
