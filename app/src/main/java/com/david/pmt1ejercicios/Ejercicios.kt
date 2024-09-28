package com.david.pmt1ejercicios

fun main(){

    //Ejercicio 1
    var edad:Int=35
    var nombre:String="David"
    var altura:Float=1.72f

    //Ejercicio 2
    var radio=5
    println("El área de un círculo de radio "+radio+" es "+calculaArea(radio))

    //Ejercicio 3
    saludar(nombre, edad)

    //Ejercicio 4
    informacionPersonal(nombre, edad, "Granada")

    //Ejercicio 5
    var celsius=10.0f
    var fahrenheit=69.0f
    var conversion1=celsiusToFahrenheit(celsius)
    var conversion2=fahrenheitToCelsius(fahrenheit)
    println("$celsius Cº son $conversion1 Fº")
    celsiusToFahrenheit(celsius)
    println("$fahrenheit Fº son $conversion2 Cº")

}

//Función para el Ejercicio 2
fun calculaArea(r:Int):Float{
    val pi=3.14159f
    var area=pi*(r*r)
    return area
}

//Función para el Ejercicio 3
fun saludar(nombre:String, edad:Int){
    println("Hola "+nombre+", tienes "+edad+" años.")
}

//Función para el Ejercicio 4
fun informacionPersonal(nombre:String, edad:Int, ciudad:String){
    var mensaje="Nombre: $nombre\nEdad: $edad años\nCiudad: $ciudad"
    println(mensaje)
}

//Métodos del Ejercicio 5
fun celsiusToFahrenheit(cel:Float):Float{
    return (cel*9/5+32)
}
fun fahrenheitToCelsius(fah:Float):Float{
    return (fah-32)*5/9
}