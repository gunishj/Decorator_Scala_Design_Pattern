object mainObject {
  def main(args: Array[String]): Unit = {
    println("Welcome to StarBucks")
    var GunishCoffee = new  Espresso with Caramel with SoyaSauce
    println("Your total cost is : ", GunishCoffee.cost)
    println("Your Coffee is : ",  GunishCoffee.description)
  }

}
