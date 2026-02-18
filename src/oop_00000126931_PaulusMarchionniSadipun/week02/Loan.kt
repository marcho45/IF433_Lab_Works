package oop_00000126931_PaulusMarchionniSadipun.week02

class loan(
var booktitle: String,
    var borrower: String,
    var loanDuration: Int = 1
)
{
    fun calculateFine(): Int {
        if (loanDuration > 3) {
            // Rumus: (Durasi - 3) * 2000
            return (loanDuration - 3) * 2000
        } else {
            // Jika <= 3 hari, denda 0
            return 0
        }
    }
}

