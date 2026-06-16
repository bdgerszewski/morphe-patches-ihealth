package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_IHEALTH = Compatibility(
        name = "iHealth MyVitals",
        packageName = "com.ihealthlabs.MyVitalsPro",
        apkFileType = ApkFileType.XAPK,
        appIconColor = 0x00AEEF,
        targets = listOf(
            AppTarget(version = "4.14.5")
        )
    )
}
