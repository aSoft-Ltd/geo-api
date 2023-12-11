package geo

import kotlinx.JsExport

@JsExport
interface LatLngAlt : LatLng {
    val alt: Double
}