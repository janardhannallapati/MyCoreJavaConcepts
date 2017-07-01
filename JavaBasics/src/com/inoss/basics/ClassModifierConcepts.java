package com.inoss.basics;

//top-level class 
// only public + at most one of abstract and final are permitted 
public class ClassModifierConcepts {

	// nested (member) class can be private or protected or public  
	private class member1{}
	protected class member2{}
	public class member3{}
	// nested (member) class can have at most one of abstract and final
	private final class member4{}
	private  abstract  class member5{}
	//nested (member) class can be static
	private static class member6{}
	private static final class member7{}
	private static abstract class member8{}
	
	public ClassModifierConcepts(){
		//nested (Local) classes are declared inside a method , constructor or initializer block
		class Local1{}
		//nested (local) can only have abstract or final
		final class Local2{}
		abstract class Local3{}
		//will not work
		//private class Local4{}
		
	}
}
