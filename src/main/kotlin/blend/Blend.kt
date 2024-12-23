package blend

import org.slf4j.LoggerFactory

object Blend {

    val name = "Blend"
    val release = "1.0"
    val logger = LoggerFactory.getLogger(name)

    fun initialize() {
        val time = System.currentTimeMillis()

        logger.info("Initialized $name r$release in ${System.currentTimeMillis() - time}ms")
    }
}
