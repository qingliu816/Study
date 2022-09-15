
public class China extends Burger211 {

	@Override
	public Burger getInheritanceBurger() {
		Burger b = new Burger();
		b.name = "Inheritance Burger";
		b.toppings = "beef patty, tomato, onion, ranch source";
		b.kcalValue = 210;
		b.price = 6;
		return b;
	}

	@Override
	public Burger getOverridingBurger() {
		Burger b = new Burger();
		b.name = "Overriding Burger";
		b.toppings = "“beef patty, lime, onion, lettuce, tomato source";
		b.kcalValue = 211;
		b.price = 7;
		return b;
	}

	@Override
	public Burger getConstructorBurger() {
		Burger b = new Burger();
		b.name = "Constructor Burger";
		b.toppings = "“chicken breast, gallo, onion, ranch source";
		b.kcalValue = 140;
		b.price = 8;
		return b;
	}
}