@file:Suppress("NOTHING_TO_INLINE")

package geo

inline fun Country.matches(key: String): Boolean = label.startsWith(key, ignoreCase = true)
        || code.startsWith(key, ignoreCase = true)
        || currency.name.startsWith(key, ignoreCase = true)
        || dialingCode.replace("+", "").startsWith(key.replace("+", ""))