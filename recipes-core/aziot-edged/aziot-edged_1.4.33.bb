SUMMARY = "The aziot-edged is the main binary for the IoT edge daemon."
HOMEPAGE = "https://aka.ms/iotedge"
LICENSE = "MIT"

LIC_FILES_CHKSUM = " \
    file://../LICENSE;md5=0f7e3b1308cb5c00b372a6e78835732d \
    file://../THIRDPARTYNOTICES;md5=11604c6170b98c376be25d0ca6989d9b \
"

include aziot-edged.inc
include aziot-edged-crates.inc

inherit cargo cargo-update-recipe-crates pkgconfig
export VERSION = "${PV}"

SRC_URI += "git://github.com/Azure/iotedge.git;protocol=https;branch=release/1.4"
SRCREV = "71f4974213cfab7447117af13a30319ba2c40357"
S = "${WORKDIR}/git/edgelet"
CARGO_SRC_DIR = "aziot-edged"

# Allow do_compile to perform git fetch commands
do_compile[network] = "1"

