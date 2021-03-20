trait SoyaSauce extends  Beverage {
  abstract override def cost: Int = super.cost + 7

  abstract override def description: String = super.description + " with soya sauce "

}
