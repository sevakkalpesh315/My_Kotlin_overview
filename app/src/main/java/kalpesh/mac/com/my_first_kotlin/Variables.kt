package kalpesh.mac.com.my_first_kotlin

/**
 * Created by kalpesh on 09/06/2017.
 */
class Variables {

// Variable/Value "is a (:)" data type "whose value is (=)"
    /**
     *  1. The variables can be mutable and immutable

    This can also be done in Java (marking variables as final if we don’t want it to be modified),
    but in Kotlin it is much less verbose and much more used: In Kotlin immutable values ​​are preferred whenever possible.
     */


    /**
     *  2. Variables are declared using val or var , provided they are immutable or mutable

    An interesting thing from Kotlin is that most of the time you won’t need to specify the type of the objects you are working with, as long as the compiler can infer it.

    So we just need to write var or val depending on the type of variable we want to generate, and the type can normally be inferred. We can always specify a type explicitly.
     */

    var a: String= "Hey Kotlin";
    var b: Int=9;





    /**
     *  In Kotlin everything is an object

    There are no basic types, and there is no void . If something does not return anything, it actually returns the Unit object. Most of the time it can be omitted, but it is there, lurking.

    Therefore, all these variables are objects:
     */

    val x: Int =8;
    val y: Double=43.44;
    val z: Unit = Unit;




    /**
     *  3. Type casting is done automatically

    Whenever the compiler is able to detect that there is no other possible option, the casting will be done automatically. Awesome!
     */
    //This can be used to access views from xml

//    val z: View = findViewById(R.id.my_view)
//
//    if (z is TextView) {
//        z.text = "I've been casted!"
//    }


    /**
     * 4. Simpler numerical types can not be assigned to more complex types
     */

    val x1: Int=3;
   // val y1: Long= x1;

   // You need to do an explicit casting:

    val y2: Long= x1.toLong();


}


