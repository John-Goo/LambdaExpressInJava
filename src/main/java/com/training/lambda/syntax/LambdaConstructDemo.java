
package com.training.lambda.syntax;

public class LambdaConstructDemo {

	public static void main(String[] args) {
		AnimalInterface1 intf1 = ()->{
			return new Cat();// ==>Cat::new;
		};
		//intf1.fetchAnimal();
		AnimalInterface1 intf2 = Cat::new;
		intf2.fetchAnimal();
		/**
		 * 有参的构造方法引用
		 */
		AnimalInterface3 intf3 = Cat::new;
		Cat cat3 = intf3.fetchAnimal("Kulu");
		System.out.println(cat3.getName());


	}

}

@FunctionalInterface
interface AnimalInterface1{
	public Cat fetchAnimal();
}


@FunctionalInterface
interface AnimalInterface3{
	public Cat fetchAnimal(String name);
}


class Cat{

	private String name;
	private String type;

	public Cat() {
		System.out.println("[Cat]-->无参构造函数.");
	}

	public Cat(String name) {
		System.out.println("[Cat]-->有1个参构造函数.");
		this.name = name;
	}

	public Cat(String name,String type) {
		System.out.println("[Cat]-->有1个参构造函数.");
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



}
