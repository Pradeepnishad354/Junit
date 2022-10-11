package com.flux;

import reactor.core.publisher.Mono;

public class MonoE {
	
	public static void main(String[] args) {
		
		// creating mono 
		
		Mono<String> m=Mono.just("hello");
		
		
		//creating a mono from a callable
		
		Mono<String> callable=Mono.fromCallable(()-> "Hello world");
		
		
		
		/* System.out.println(callable); */
	}
	
	

}
