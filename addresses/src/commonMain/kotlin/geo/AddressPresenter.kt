@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package geo

import kollections.List
import kollections.toIList
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@Serializable
data class AddressPresenter(
    val src: AddressDto,
    val country: Country,
    val entries: List<Entry>
) {

    fun toLines() = src.toLines()
}