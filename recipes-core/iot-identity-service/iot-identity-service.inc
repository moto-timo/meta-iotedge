SRC_URI += "git://github.com/Azure/iot-identity-service.git;protocol=https;branch=main;name=iot-identity-service"
SRCREV[iot-identity-service] = "05557fc8dd5c591f7cbf99185ef769248b614101"

SRC_URI += " \
    file://0001-rust-toolchain.toml-bump-to-1.75-for-scarthgap.patch \
    file://0002-Cargo.lock-bump-all-to-latest-1.75-for-scarthgap.patch \
    "
