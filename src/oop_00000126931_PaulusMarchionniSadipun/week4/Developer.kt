package oop_00000126931_PaulusMarchionniSadipun.week4

 class Developer( val programmingLanguage: String, name: String, baseSalary : Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage."
        )
    }

}