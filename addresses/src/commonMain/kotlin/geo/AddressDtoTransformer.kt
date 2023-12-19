package geo

fun AddressDto.toPresenter() = AddressPresenter(
    src = this,
    country = country,
    entries = entries
)