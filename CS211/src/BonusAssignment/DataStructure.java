package BonusAssignment;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStructure {
	static ArrayList<User> userList = new ArrayList<>();
	static HashMap<Integer, String> userMap = new HashMap<>();
	static NewRandom rand = new NewRandom();

	public static void main(String[] args) {

		for (int i = 1; i <= 100000; i++) {
			User user = new User();
			user.id = rand.nextInt();
			String password = "";
			// generate password with length from 5 to 15.
			for (int j = 0; j < rand.nextInt(10) + 5; j++) {
				password += rand.nextCh();
			}
			user.password = password;
			while (userMap.containsKey(user.id)) {// avoid duplicate user id
				user.id = rand.nextInt();// random a new ID again
			}
			userList.add(user);// add to ArrayList
			userMap.put(user.id, user.password);// add to HashMap

		}
		
		Search();
		Remove();
	}

	public static void Search() {
		// how to loop 50000 user when use the password because in the arrayList the
		// object
		// is a object? can we use the object of the one variable to find another one ??

		System.out.println("Search");
		double totalArrayTime = 0.0;
		double totalMapTime = 0.0;
		for (int i = 0; i < 50000; i++) {
			int id = userList.get(rand.nextInt(userList.size())).id;

			double startTime = System.currentTimeMillis();
			// find password in array.
			for (int j = 0; j < userList.size(); j++) {
				if (userList.get(j).id == i) {
					break;
				}
			}
			double endTime = System.currentTimeMillis();
			totalArrayTime += (endTime - startTime);

			startTime = System.currentTimeMillis();
			// find password in map.
			userMap.get(id);
			endTime = System.currentTimeMillis();
			totalMapTime += (endTime - startTime);
		}

		System.out.println("arrayList:" + totalArrayTime / 1000.0 + "sec");
		System.out.println("map:" + totalMapTime / 1000.0 + "sec");
		System.out.println(
				"map is" + " " + (totalArrayTime - totalMapTime) * 100 / totalArrayTime + "% faster than arrayList");
	}

	public static void Remove() {
		System.out.println("Remove");
		double totalArrayTime = 0.0;
		double totalMapTime = 0.0;
		for (int i = 0; i < 10000; i++) {
			User user = userList.get(rand.nextInt(userList.size()));

			double startTime = System.currentTimeMillis();
			// remove user in list
			userList.remove(user);
			double endTime = System.currentTimeMillis();
			totalArrayTime += (endTime - startTime);

			startTime = System.currentTimeMillis();
			// remove user in map
			userMap.remove(user.id);
			endTime = System.currentTimeMillis();
			totalMapTime += (endTime - startTime);
		}

		System.out.println("arrayList:" + totalArrayTime / 1000.0 + "sec");
		System.out.println("map:" + totalMapTime / 1000.0 + "sec");
		System.out.println(
				"map is" + " " + (totalArrayTime - totalMapTime) * 100 / totalArrayTime + "% faster than arrayList");
	}

}
