package geo

import geo.serializers.LatLngAltSerializer
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@JsExport
@Serializable(with = LatLngAltSerializer::class)
interface LatLngAlt : LatLng {
    val alt: Double
}