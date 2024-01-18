DESCRIPTION = "Hello World Recipe"
LICENSE     = "MIT"

inherit dpkg-raw

DESTDIR = "debian/my-app"
FILESPATH:prepend = "${THISDIR}/files:"
SRC_URI = "file://application.py"
S = "${WORKDIR}/${PN}"

do_install(){
    install -m 0755 -d ${D}/usr/bin/
    install -m 0755 ${WORKDIR}/application.py ${D}/usr/bin
}
