
//Description : converting 128 to various formats
// save each step of conversion and expect the values 
//Author :  Siva Charan
//email : siva3060@gmail.com


//Using the .to<type> method from the types 
val number  : Int = 128 

val ch : Char = number.toChar
println(s"Character value of $number is $ch");

val du : Double = ch.toDouble
println(s"Character value of $ch is $du");

val newnumber : Int = du.toInt
println(s"Convert double value  of $du is $newnumber");
