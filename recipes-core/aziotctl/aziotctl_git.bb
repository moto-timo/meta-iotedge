SUMMARY = "aziotctl is used to manage the IoT Identity Service and related services."
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

S = "${WORKDIR}/git"

CARGO_SRC_DIR = "aziotctl"

export SOCKET_DIR ?= "/run/aziot"
export USER_AZIOTID ?= "aziotid"
export USER_AZIOTCS ?= "aziotcs"
export USER_AZIOTKS ?= "aziotks"
export USER_AZIOTTPM ?= "aziottpm"

inherit cargo cargo-update-recipe-crates

include aziotctl.inc
include aziotctl-crates.inc

