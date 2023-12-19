@file:JsExport // TODO: Remove JsExport annotation and use the AddressPresenter for Js
@file:Suppress("NON_EXPORTABLE_TYPE")

package geo

import kollections.List
import kollections.map
import kollections.plus
import kollections.reversed
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class AddressDto(
    val country: Country,
    val entries: List<Entry>
) {
    fun toLines() = (entries.reversed().map { it.value ?: "" } + country.label)
}