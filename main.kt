fun printStars(num: Int){
  for (j in 1..num) {
    print("*")
  }
  println()
}

fun ascendingTriangle(height: Int) {
  for (star in 1..height){
    print (star)
  }
  println()
}

fun descendingTriangle(height: Int) {
  for (star in height downTo 1){
    print(star)
  }
  println()
}

fun isoscelesTriangle(width: Int) {
  ascendingTriangle(width-1)
  descendingTriangle(width)
}

fun main() {
  println("Hello world!")
  printStars(10)
  ascendingTriangle(5)
  descendingTriangle(6)
  isoscelesTriangle(5)
}