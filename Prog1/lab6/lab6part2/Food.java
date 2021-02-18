public class Food {
	
	Food(String foodType) {
		this.foodType = foodType;
	}

	public String getFoodName() {
		return foodType;
	}
	private String foodType;
}