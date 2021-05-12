package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Aru","sharu","ssss");
		Stream<String> s = list.stream();
		List<String> l = s.map(X->x.toUpperCase()).collect(Collectors.toList());
		l.forEach(x->System.out.println(x));
	}

}
