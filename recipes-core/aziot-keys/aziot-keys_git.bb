SUMMARY = "aziot-keys is the default implementation of cryptographic operations used by the Keys Service."
HOMEPAGE = "https://azure.github.io/iot-identity-service/"
LICENSE = "MIT"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4f9c2c296f77b3096b6c11a16fa7c66e \
"

SRC_URI = "\
    gitsm://github.com/Azure/iot-identity-service.git;protocol=https;branch=main \
    file://0001-Bump-rust-to-1.75-and-update-crates-for-scarthgap.patch \
    file://0002-Do-not-require-panic-abort.patch \
    "
SRCREV = "05557fc8dd5c591f7cbf99185ef769248b614101"

CARGO_SRC_DIR = "key/aziot-keys"

require aziot-keys.inc
include aziot-keys-crates.inc

inherit cargo cargo-update-recipe-crates pkgconfig

S = "${WORKDIR}/git"
