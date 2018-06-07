import groovy.transform.*
 /*@EqualsAndHashCode
 class Person {
     String first, last
     int age
 }
 def p1 = new Person(first:'John', last:'Smith', age:21)
 def p2 = new Person(first:'John', last:'Smith', age:21)
 println p1
 
 println p2
 println p1 == p2
/* assert p1 == p2
 def map = [:]
 map[p1] = 45
 assert map[p2] == 45*/
 
 
 @Canonical 
 class Customer {
     String first, last
     int age
     Date since
     Collection favItems = ['Food']
     def object 
 }
 def d = new Date()
 def anyObject = new Object()
 def c1 = new Customer(first:'Tom', last:'Jones', age:21, since:d, favItems:['Books', 'Games'], object: anyObject)
 def c2 = new Customer('Tom', 'Jones', 21, d, ['Books', 'Games'], anyObject)
 assert c1 == c2