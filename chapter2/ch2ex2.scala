
/**
 * Description : Modifiying to return the integer value
 * Author : Siva Charan
 * email : siva3060@gamil.com
 *
 */

val cent : Double = 35.5

// we will use the "toType" build-in conversion values to convert the given type into 
// target type
val fah : Int = (cent * (9/5) + 32).toInt

println(s"Fahrenheit value if $fah")
