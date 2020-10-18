//fun main(){
//
//    val employee1 = Employee("Bob Jones", "Assistant Administrator", true, 15.50, 1)
//    val employee2 = Employee("Stan Smith", "Agent", false, 15.50, 1)
//
//    employee1.printAll()
//    employee1.calculatePay(45.0)
//    println("")
//    employee2.printAll()
//    employee2.calculatePay(45.0)
//
//}

fun main() {
    var emp1 = Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1);
    var emp2 = Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2);
    var emp3 = Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3);



    emp1.printAll();
    emp1.calculatePay(45.0);
    println("")
    emp2.printAll();
    emp2.calculatePay(50.0);
    println("")
    emp3.printAll();
    emp3.calculatePay(35.0);
}
