include(
    ":emulair-app-common",
    ":emulair-app",
    ":emulair-app-build-nogplay",
    ":emulair-app-build-gplay",
    ":bundled-cores"
)

project(":bundled-cores").projectDir = File("lemuroid-cores/bundled-cores")

fun usePlayDynamicFeatures(): Boolean {
    val task = gradle.startParameter.taskRequests.toString()
    return task.contains("Gplay") && task.contains("DownloadedCores")
}

// To test out the error screens, wrap the below `include(...)`, as well as all the `project(...)`s under `if (usePlayDynamicFeatures()) {..}`
// This way, the cores in the debug version of the app will not be installed, and an error screen will appear
// Follow similar instructions in build.gradle.kts for changes to actually take effect
include(
    ":lemuroid_core_desmume",
    ":lemuroid_core_dosbox_pure",
    ":lemuroid_core_fbneo",
    ":lemuroid_core_fceumm",
    ":lemuroid_core_gambatte",
    ":lemuroid_core_genesis_plus_gx",
    ":lemuroid_core_handy",
    ":lemuroid_core_mame2003_plus",
    ":lemuroid_core_mednafen_ngp",
    ":lemuroid_core_mednafen_pce_fast",
    ":lemuroid_core_mednafen_wswan",
    ":lemuroid_core_melonds",
    ":lemuroid_core_mgba",
    ":lemuroid_core_mupen64plus_next_gles3",
    ":lemuroid_core_pcsx_rearmed",
    ":lemuroid_core_ppsspp",
    ":lemuroid_core_prosystem",
    ":lemuroid_core_snes9x",
    ":lemuroid_core_stella",
    ":lemuroid_core_citra"
)

project(":lemuroid_core_gambatte").projectDir = File("lemuroid-cores/lemuroid_core_gambatte")
project(":lemuroid_core_desmume").projectDir = File("lemuroid-cores/lemuroid_core_desmume")
project(":lemuroid_core_melonds").projectDir = File("lemuroid-cores/lemuroid_core_melonds")
project(":lemuroid_core_fbneo").projectDir = File("lemuroid-cores/lemuroid_core_fbneo")
project(":lemuroid_core_fceumm").projectDir = File("lemuroid-cores/lemuroid_core_fceumm")
project(":lemuroid_core_genesis_plus_gx").projectDir = File("lemuroid-cores/lemuroid_core_genesis_plus_gx")
project(":lemuroid_core_mame2003_plus").projectDir = File("lemuroid-cores/lemuroid_core_mame2003_plus")
project(":lemuroid_core_mgba").projectDir = File("lemuroid-cores/lemuroid_core_mgba")
project(":lemuroid_core_mupen64plus_next_gles3").projectDir =
    File("lemuroid-cores/lemuroid_core_mupen64plus_next_gles3")
project(":lemuroid_core_pcsx_rearmed").projectDir = File("lemuroid-cores/lemuroid_core_pcsx_rearmed")
project(":lemuroid_core_ppsspp").projectDir = File("lemuroid-cores/lemuroid_core_ppsspp")
project(":lemuroid_core_snes9x").projectDir = File("lemuroid-cores/lemuroid_core_snes9x")
project(":lemuroid_core_stella").projectDir = File("lemuroid-cores/lemuroid_core_stella")
project(":lemuroid_core_handy").projectDir = File("lemuroid-cores/lemuroid_core_handy")
project(":lemuroid_core_prosystem").projectDir = File("lemuroid-cores/lemuroid_core_prosystem")
project(":lemuroid_core_mednafen_pce_fast").projectDir = File("lemuroid-cores/lemuroid_core_mednafen_pce_fast")
project(":lemuroid_core_mednafen_ngp").projectDir = File("lemuroid-cores/lemuroid_core_mednafen_ngp")
project(":lemuroid_core_mednafen_wswan").projectDir = File("lemuroid-cores/lemuroid_core_mednafen_wswan")
project(":lemuroid_core_dosbox_pure").projectDir = File("lemuroid-cores/lemuroid_core_dosbox_pure")
project(":lemuroid_core_citra").projectDir = File("lemuroid-cores/lemuroid_core_citra")
