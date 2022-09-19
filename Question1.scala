object Question1 extends App {

  case class Points(x: Int, y: Int) {
    def +(p: Points) = Points(this.x + p.x, this.y + p.y)
    def move(dx: Int, dy: Int) = Points(this.x + dx, this.y + dy)
    def distance(p: Points) =
      math.sqrt(math.pow(this.x - p.x, 2) + math.pow(this.y - p.y, 2))
    def invert() = Points(this.y, this.x)
  }
  val point1 = Points(2, 4)
  val point2 = Points(3, 5)
  println(point1 + point2)
  println(point1.move(3, 4))
  println(point1.distance(point2))
  println(point1.invert())

}
