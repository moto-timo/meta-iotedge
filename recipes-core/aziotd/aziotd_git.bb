SUMMARY = "aziotd is the main binary for the IoT Identity Service and related services."
HOMEPAGE = "https://azure.github.io/iot-identity-service/"
LICENSE = "MIT"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4f9c2c296f77b3096b6c11a16fa7c66e \
"

SRC_URI += "\
    gitsm://github.com/Azure/iot-identity-service.git;protocol=https;branch=main \
    file://0001-Bump-rust-to-1.75-and-update-crates-for-scarthgap.patch \
    file://0002-Do-not-require-panic-abort.patch \
    file://0003-aziot-identity-replace-deprecated-utc-usage.patch \
    "
SRCREV = "05557fc8dd5c591f7cbf99185ef769248b614101"

S = "${WORKDIR}/git"

CARGO_SRC_DIR = "aziotd"

export SOCKET_DIR ?= "/run/aziot"
inherit cargo cargo-update-recipe-crates pkgconfig

include aziotd.inc
include aziotd-crates.inc

do_compile:append() {
    CARGO_SRC_DIR = "cert/aziot-certd"
    oe_cargo_build
}
