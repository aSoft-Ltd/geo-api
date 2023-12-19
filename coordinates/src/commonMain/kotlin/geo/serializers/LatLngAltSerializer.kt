package geo.serializers

import geo.LatLngAlt
import geo.internal.LatLngAltImpl
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object LatLngAltSerializer : KSerializer<LatLngAlt> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("geo.LatLngAlt")

    private val surrogate by lazy { LatLngAltImpl.serializer() }
    override fun deserialize(decoder: Decoder): LatLngAlt = decoder.decodeSerializableValue(surrogate)

    override fun serialize(encoder: Encoder, value: LatLngAlt) = encoder.encodeSerializableValue(surrogate, value.toImpl())

    private fun LatLngAlt.toImpl() = LatLngAltImpl(lat, lng, alt)
}