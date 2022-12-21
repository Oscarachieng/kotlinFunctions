fun factorial(number: Int) :Int {
  if (number <= 1){
    return 1
  }
  return (number - 1)* number
}

fun main () {
  println(factorial(20))
}