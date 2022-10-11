package com.flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import reactor.core.publisher.Flux;


public class FluxExample {
	
	public static void main(String[] args) {
	//creating the flux for element 1,2,3,4,5
		
		Flux<Integer> integerFlux=Flux.just(1,2,3,4,5);
	
		
//creating the flux for "hello","go","foo"
		
		Flux<String> stringFlux=Flux.just("hello","go","foo");
		
	//creates a flux from an already existing Iterable
		
		List<String > StringList=Arrays.asList("hello","go","foo");
		
		Flux<String> stringFluxList=Flux.fromIterable(StringList);
		
		
		//create a flux on a range
		
		Flux<Integer> flux=Flux.range(1, 5);
		
		System.out.println(flux);
		
		
	//creates a flux that generates	a new value every second
		
		Flux<Long> intervalFlux=Flux.interval(Duration.ofMillis(100));
		
		
		// you can create a flux from another one
		
		Flux<String> fc=Flux.from(stringFlux);
		
		
	}

}
