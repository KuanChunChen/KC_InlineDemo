package k.c.horialtal.move.sheet.kc_inlinedemo

class InlineUtil {



    object Conversions {
        const val MINUTES_PER_HOUR = 60
    }

    /**
     * Example of you normal want to create a kotlin function.
     *
     * @param hours the hour want to translate
     */

    fun getMinutes1(hours: Int): Int {
        return hours * Conversions.MINUTES_PER_HOUR
    }

    /**
     * Example of you write kotlin function with inline , but some IDE maybe remind that
     * you should use function type with inline to improve the performance.
     *
     * @param hours the hour want to translate
     */

    inline fun getMinutes2(hours: Int): Int {

        return hours * Conversions.MINUTES_PER_HOUR

    }


    /**
     * Example of you write kotlin function function type (or lambda function).
     *
     * @param hours the hour want to translate
     */

    fun getMinutes3(hours: Int ,lambda: (result: Int) -> Unit): Int {

        lambda.invoke(hours)

        return hours * Conversions.MINUTES_PER_HOUR
    }


    /**
     * Example of you write kotlin function with inline and function type(or lambda function)
     *
     * @param hours the hour want to translate
     */
    inline fun getMinutes4(hours: Int ,lambda: (result: Int) -> Unit): Int {

        lambda.invoke(hours)
        return hours * Conversions.MINUTES_PER_HOUR

    }


    /**
     * Example of you write kotlin function with inline,noinline,crossinline and function type(or lambda function)
     *
     * @param hours the hour want to translate
     */

    inline fun getMinutes5(
        hours: Int,
        lambda1: (result: Int) -> Unit,
        noinline lambda2: (result: Int) -> Unit,
        crossinline lambda3: (result: Int) -> Unit
    ): Int {

        lambda1.invoke(hours)
        println("After lambda1")

        lambda2.invoke(hours)
        println("After lambda2")

        lambda3.invoke(hours)
        println("After lambda3")

        return hours * Conversions.MINUTES_PER_HOUR

    }


}