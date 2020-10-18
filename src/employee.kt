import java.text.DecimalFormat
class Employee (name: String , position: PositionTitle , salary: Boolean, payRate: Double, shift: Int){

    var name: String
//    var position: String
    var position: PositionTitle
    var salary: Boolean
//    var payRate: Double = 0.0
    var payRate: Double
    var shift: Int

    init {
        this.name = name
        this.position = position
        this.salary = salary
        this.payRate = payRate
        this.shift = shift
    }

    fun printAll(){
        println("name: " + name + "\nposition: " + position + "\nsalary: " + salary + "\npay rate: " + payRate + "\nshift: " + shift)
    }


    var pay = 0.0
    fun calculatePay (hoursIn: Double) {
        if (shift == 1) {
            print("")
        }
        if (shift == 2) {
            payRate *= 1.05
        }
        if (shift == 3) {
            payRate *= 1.1
        }
        pay = hoursIn * payRate
        if (salary) {
            print("")
        } else {
            if (hoursIn > 40) {
//                pay = ((((hoursIn) – 40) * (1.5 * payRate))) + (40 * payRate))
                pay += ((hoursIn - 40) * (payRate * 1.5))
                pay -= ((hoursIn - 40) * payRate)
            }
        }
        val currency = DecimalFormat("$.00")
        print("the week's pay is ")
        println(currency.format(pay))
    }
}