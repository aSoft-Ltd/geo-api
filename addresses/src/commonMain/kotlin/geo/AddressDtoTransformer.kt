package geo

import kollections.toIList

fun AddressDto.toPresenter() = AddressPresenter(
    src = this,
    country = country,
    entries = entries.toIList()
)