package foo

object Changer {
    fun change(input: String?): String? =
        when (input) {
            null -> "not null"
            else -> null
        }
}
