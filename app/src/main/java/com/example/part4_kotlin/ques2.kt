package com.example.part4_kotlin

//Create a list of Employee which will have name and age as properties. print the name of all employees age >30.

data class Employee(val name: String, val age: Int)

class ques2 {

        var list: List<Employee> = listOf(Employee("Rahul", 22),
            Employee("Rajan", 32),
            Employee("Ritika", 54),
            Employee("Akshita", 25),
            Employee("Manoj", 43),
            Employee("Yash", 28),
            Employee("Naman", 31)
        )
    fun showName(){
        var names = list.filter { employee -> employee.age >30 }
        names.forEach{employee -> println(employee.name) }
        println("---------------------------------------------------------------------------------")
    }
}


