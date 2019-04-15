public class Ques5{
	public static void main(String[] args){
	Waiter waiter = new Waiter();	
	MealBuilder mb;
	Meal meal;
	waiter.setMealBuilder(new SouthMealBuilder());
	meal = waiter.construct();
	System.out.println("南方快餐");
	System.out.println(meal.getFood());
	System.out.println(meal.getDrink());
	System.out.println("******************************");
	waiter.setMealBuilder(new NorthMealBuilder());
	meal = waiter.construct();
	System.out.println("北方快餐");
	System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
	}
}
		 
