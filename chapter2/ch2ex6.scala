
//Description :  extracting the patterns from the given string 
//Author :  Siva Charan
//email : siva3060@gmail.com


//Defining what to extract from the string 

//In scala we can use convert a given string into matching patter
// by post fixing the string with ".r" and inside Triple Quotes (""")
//
// We can also extract the data from string using regext objects also 
// which which results in optional/some/none pattern

val pattern = """.*,(\d+)-(\d+)-(\d+),.*""".r

val str : String = "Fran,123 Main,925-555-1943,95122"

//scala gives support to extract the data after we define the pattern and extract contents 
val pattern(first,mid,last) = str 


println(s"Phone number is :$first-$mid-$last")

println(s"Phone number in Integer : ${first.toInt+1}-${mid.toInt+1}-${last.toInt+1}")

//saving into tuple

val myTuple = (first,mid,last)

println(s"the tuple value is ${myTuple}")
