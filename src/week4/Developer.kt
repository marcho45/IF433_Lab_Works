package week4

 class Developer( val programmingLanguage: String, name: String, baseSalary : Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage."
        )
    }

}