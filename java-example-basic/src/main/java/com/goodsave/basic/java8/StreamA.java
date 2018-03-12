package com.goodsave.basic.java8;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamA {

	public static void main(String[] args) {
		
		//filter过滤器  sorted排序
		List<Integer> nums = Arrays.asList(6, 2, 1, 8, 3, 9, 5);
		List<Integer> filtered = nums.stream().filter(num->num!=-1).sorted().collect(Collectors.toList());
		filtered.forEach(System.out::println);
		
		//limit 限制条数
		Random random = new Random();
		random.ints().limit(3).forEach(System.out::println);
		
		//map 一对一映射
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers.stream().map(num->num*num).distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		//并行流
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		strings.parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
		
		System.err.println(StringUtils.join(strings.stream().map(fieldName ->"["+fieldName+"]").collect(Collectors.toList()).toArray(), ","));
		
		//统计
		List<Integer> aaa= Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = aaa.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("列表中最大的数 : " + stats.getMax());
		System.out.println("列表中最小的数 : " + stats.getMin());
		System.out.println("所有数之和 : " + stats.getSum());
		System.out.println("平均数 : " + stats.getAverage());
		
	}
	
}
