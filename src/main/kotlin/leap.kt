class Year(val year: Int) {

    val isLeap: Boolean
    get() {
        // First test, the general rule
        var isLeap = (year % 4) == 0

        // Second test, remove multiple of 100
        isLeap = isLeap && (year % 100) != 0

        // Third test, re-introduce multiple of 400
        isLeap = isLeap || (year % 400) == 0

        return isLeap

    }

}