
//Description : Centigrade to Fahrenheit Conversion
// save each step of conversion and expect the values 
//Author : Penchala Yegu
//email : siva3060@gmail.com

val cent : Float = 45

//float exprected 
val step1 = 9/5
println("Expected : Int  Generated : "+step1.getClass)


//float exprected 
val step2 = cent * step1
println("Expected : Float Generated : "+step2.getClass)

//float  exprected 

val step3 = step2 + 32
println("Expected : Float Generated : "+step3.getClass)

println(s"Centigrade : $cent\n Step1 : $step1\n Step2 : $step2\n Fahrenheit : $step3")

