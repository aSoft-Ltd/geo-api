package geo.serializers

import geo.LatLng
import geo.LatLngAlt
import geo.internal.LatLngAltImpl
import geo.internal.LatLngImpl
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.element
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object LatLngSerializer : KSerializer<LatLng> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("geo.LatLng")

    private val surrogate by lazy { LatLngImpl.serializer() }
    override fun deserialize(decoder: Decoder): LatLng = decoder.decodeSerializableValue(surrogate)

    override fun serialize(encoder: Encoder, value: LatLng) = encoder.encodeSerializableValue(surrogate, value.toImpl())

    private fun LatLng.toImpl() = LatLngImpl(lat, lng)
}