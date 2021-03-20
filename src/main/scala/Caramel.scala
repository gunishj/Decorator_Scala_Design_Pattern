trait Caramel extends Beverage {
  abstract override def cost: Int = super.cost + 5

  abstract override def description: String = super.description + " with caramel "
}
