1. call-by-name, lazy evaluation
   def log(m: String) = if (logEnabled) println(m)
   
   def log(m: => String) = if (logEnabled) println(m) // call-by-name, m is not evaluated if logEnabled is false
   
   
   
2.

3.

