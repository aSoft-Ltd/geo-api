package geo

fun Country.matches(key: String): Boolean = label.contains(key, ignoreCase = true)
        || code.contains(key, ignoreCase = true)
        || currency.name.contains(key, ignoreCase = true)
        || dialingCode.contains(key.replace("+", ""))