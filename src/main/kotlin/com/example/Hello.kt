package com.example
    fun main() {
        print(formatPhNumber("112345678910"))
    }
fun formatPhNumber(rawnumber: String ):String? {
    try {
        if (rawnumber == "") {
            throw NumberFormatException("NuberFormat Exception")
        } else {
            val nondigits = """[^\d]""".toRegex()
            var actualnumber = rawnumber?.replace(nondigits, "")
            if (actualnumber.length > 10) {
                throw NumberFormatException()
            } else {
                var newnumber: String? = "+61" + actualnumber?.takeLast(8)
                return newnumber
            }
        }
    }
     catch (e: Exception) {
        e.printStackTrace()
         return null
    }
}


