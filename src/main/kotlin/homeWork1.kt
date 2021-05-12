fun main() {
    println("Please enter student\' name: ")
    var studentsName: String = readLine()!!.toString()
    println("Please enter $studentsName\'s first grade: ")
    var firstGrade: Int = readLine()!!.toInt()

    while (firstGrade <= 14) {
        println("Please re-enter $studentsName's first grade. (students' first grade must be over 14): ")
        var firstGrade: Int = readLine()!!.toInt()

        if (firstGrade > 14) {
            println("Please enter $studentsName's second grade: ")
            var secondGrade: Int = readLine()!!.toInt()
            println("Please enter $studentsName's third grade: ")
            var thirdGrade: Int = readLine()!!.toInt()
            var gpa: Int = (firstGrade + secondGrade + thirdGrade)/3
                if (gpa < 12) {
                    println("$studentsName has failed")
                }
                else{
                    println("$studentsName has passed")
                }
            break
        }
    }



}
