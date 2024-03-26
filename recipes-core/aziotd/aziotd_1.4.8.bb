SUMMARY = "aziotd is the main binary for the IoT Identity Service and related services."
HOMEPAGE = "https://azure.github.io/iot-identity-service/"
LICENSE = "MIT"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4f9c2c296f77b3096b6c11a16fa7c66e \
"

SRC_URI += "gitsm://github.com/Azure/iot-identity-service.git;protocol=https;branch=release/1.4"
SRCREV = "657b163c8ecdf89cebcc57e1751d47cb1999de2c"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "aziotd"

inherit cargo cargo-update-recipe-crates pkgconfig

include aziotd.inc
include aziotd-crates.inc
