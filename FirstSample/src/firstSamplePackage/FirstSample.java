package firstSamplePackage;

import java.util.HashMap;
import java.util.Map;

public class FirstSample {

	public static void main(String[] args) {
		Person person = new Person();
		person.addPerson();
		Map<String, Integer> nameMap = new HashMap<String, Integer>();
		addNametoMap(person, nameMap);
		getNameValueFromMap(nameMap);
	}

	private static void getNameValueFromMap(Map<String, Integer> nameMap) {
		for (Map.Entry<String, Integer> names : nameMap.entrySet()) {
			System.out.println(names.getKey() + " " + ":" + " "
					+ names.getValue());
		}
	}

	private static void addNametoMap(Person person, Map<String, Integer> nameMap) {
		for (String name : person.getPersonName()) {
			if (nameMap.containsKey(name)) {
				int value = nameMap.get(name);
				nameMap.put(name, ++value);
			} else {
				int value = 0;
				nameMap.put(name, ++value);
			}

		}
	}
}
