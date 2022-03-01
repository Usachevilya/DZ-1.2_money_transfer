
val transfer = 100_000_00
val fee = 0.75
var amount = 0
 fun main() {
     val commisionAmount = (transfer * fee / 100).toInt()
     if (commisionAmount <= 3500) {
         amount = 3500 + transfer
         println("Коммисия составила 35 рублей")
     } else {
         amount = commisionAmount + transfer
         println("Коммисия составила " + commisionAmount / 100 + " рублей")
     }
println("Сумма перевода составила " + amount / 100 + " рублей")

}