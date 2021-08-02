class whenStatementLikeIfStatement {

    fun checkTime(time: Int) {


        when {

            time <= 1 || time <= 5 -> {
                println("Its still Dawn $time:00 am")
            }

            time <= 6 || time <= 11 -> {
                println("It is  Morning $time:00 am")
            }


            time <= 12 || time <= 13 -> {
                println(" Its now Noon $time:00 PM Noon Time")
            }

            time <= 14 || time <= 17 -> {
                println("Its afternoon already $time:00 Hours")
            }

            time <= 18 || time <= 24 -> {
                println("It is evening already $time:00 Hours")
            }

            else -> {
                println("time is beyond range of 24 hours $time")
            }
        }
    }

}