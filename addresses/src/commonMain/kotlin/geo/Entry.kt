@file:JsExport

package geo

import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class Entry(
    val label: String,
    val value: String?
)