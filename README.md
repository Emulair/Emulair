# Emulair Emulator
<img src="https://play.google.com/intl/en_us/badges/images/generic/en-play-badge.png"
     alt="Get it on Google Play"
     height="80">
<img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png"
     alt="Get it on F-Droid"
     height="80">
<img src="https://raw.githubusercontent.com/flocke/andOTP/master/assets/badges/get-it-on-github.svg"
     alt="Get it on GitHub"
     height="80">

## Details
Emulair is an Android exclusive open-source front-end for Libretro cores, based on Lemuroid. For more information about the project (such as how the code functions, why the project exists, who worked on it, etc.), check the [Wiki page](https://github.com/RaduBratan/Emulair/wiki). To see our backlog, check the [Projects page](https://github.com/users/RaduBratan/projects/2).

## Philosophy
The primary goal of Emulair is to combine the ease of use and simple but accessible interface of Lemuroid with RetroArch's extensive customizability and features, while also adding support for standalone emulators.

## Origin
It originates from [Lemuroid](https://github.com/Swordfish90/Lemuroid), which, in turn, is a rib of [Retrograde](https://github.com/retrograde/retrograde-android). It also uses [LibretroDroid](https://github.com/Swordfish90/LibretroDroid) under the hood to run [Libretro](https://github.com/libretro) cores. The 2D sprites for the systems are taken from [hakchi2](https://github.com/ClusterM/hakchi2) and [Faustbear](https://imgur.com/gallery/8RQ1QkA).

## Systems - Libretro Cores
- Arcade by [FinalBurn Neo](https://docs.libretro.com/library/fbneo/) and [MAME 2003-Plus](https://docs.libretro.com/library/mame2003_plus/)
- Atari 2600 by [Stella](https://docs.libretro.com/library/stella/)
- Atari 7800 by [ProSystem](https://docs.libretro.com/library/prosystem/)
- Atari Lynx by [Handy](https://docs.libretro.com/library/handy/)
- Bandai WonderSwan by [Beetle Cygne](https://docs.libretro.com/library/beetle_cygne/)
- Bandai WonderSwan Color by [Beetle Cygne](https://docs.libretro.com/library/beetle_cygne/)
- NEC PC Engine by [Beetle PCE FAST](https://docs.libretro.com/library/beetle_pce_fast/)
- Nintendo 64 by [Mupen64Plus](https://docs.libretro.com/library/mupen64plus/)
- Nintendo DS by [DeSmuME](https://docs.libretro.com/library/desmume/) or [melonDS](https://docs.libretro.com/library/melonds/)
- Nintendo 3DS by [Citra](https://docs.libretro.com/library/citra/)
- Nintendo GB by [Gambatte](https://docs.libretro.com/library/gambatte/)
- Nintendo GBC by [Gambatte](https://docs.libretro.com/library/gambatte/)
- Nintendo GBA by [mGBA](https://docs.libretro.com/library/mgba/)
- Nintendo NES by [FCEUmm](https://docs.libretro.com/library/fceumm/)
- Nintendo SNES by [Snes9x](https://docs.libretro.com/library/snes9x/)
- Sega Genesis by [Genesis Plus GX](https://docs.libretro.com/library/genesis_plus_gx/)
- Sega CD by [Genesis Plus GX](https://docs.libretro.com/library/genesis_plus_gx/)
- Sega Game Gear by [Genesis Plus GX](https://docs.libretro.com/library/genesis_plus_gx/)
- Sega Master System by [Genesis Plus GX](https://docs.libretro.com/library/genesis_plus_gx/)
- SNK NG Pocket by [Beetle NeoPop](https://docs.libretro.com/library/beetle_neopop/)
- SNK NG Pocket Color by [Beetle NeoPop](https://docs.libretro.com/library/beetle_neopop/)
- Sony PS1 by [PCSX ReARMed](https://docs.libretro.com/library/pcsx_rearmed/)
- Sony PSP by [PPSSPP](https://docs.libretro.com/library/ppsspp/)

## Systems - Standalone Apps
This feature hasn't been implemented yet.

## Existing Features (from Lemuroid)
- Easily search for any installed video game
- Manually save/load states
- Automatically save/load states when correctly closing a game (by clicking "Quit" in the pause menu)
- Save files to Google Drive (only if downloaded from Google Play; inaccessible directly from Drive)
- Add games to a "Favourites" list
- Simulate various screens, such as LCD or CRT
- Remap some touch screen controls (such as joysticks or D-pads) to gyroscopic input, by double/triple tapping the buttons
- Customizable touch controls (size and position)
- ROMs scanning and indexing
- BIOSes scanning and indexing
- Gamepad support (with button remapping included)
- .zip ROMs support
- Local, offline multiplayer (up to 4 controllers, only in games where you can select more than one player)

## Added Features
- [x] A "Jump back in" section on the "Games" page, along with "Recents", "Favorites" and "All Games"
- [x] Complete visual redesign with consistent sizing, spacing and corner radius
- [x] Complete conversion to Material Design 3 Components
- [x] An info screen containing frequently asked questions and other useful stuff
- [x] A profile screen used for easily connecting to RetroAchievements and syncing save files to the cloud
- [x] Light Theme, AMOLED Theme, Material You Theme (previously there was only a Dark Theme)
- [x] Set what screen orientation games should be opened in (landscape/portrait/follow device)
- [x] Automatically rescan internal directories on app restart and resume
- [x] Sync save files with Google Firebase
- [x] Button prompts before (almost) every important action
- [x] A themed app icon for Android 13+ devices
- [x] Fixes for bugs that were carried over from Lemuroid
- [x] Plenty QOL features, updates and fixes

## Upcoming Features
- [ ] More emulation cores (almost all cores found on RetroArch)
- [ ] More exposed settings for all the cores
- [ ] Cheat codes support
- [ ] RetroAchievements support
- [ ] .7z ROMs support
- [ ] A user-friendly intro screen concisely explaining how to use the app
- [ ] Set on-screen buttons' transparency
- [ ] Different app layout for tablets and foldables
- [ ] Different app layout for phones in landscape orientation
- [ ] Automatically save state every x seconds
- [ ] More save file formats support
- [ ] An updated Libretro games database with more fields (e.g. release year, release month, etc.)
- [ ] Add systems to a "Starred" list
- [ ] Long press a game to access a details screen
- [ ] More animations
- [ ] A custom splash screen for Android 12+ devices
- [ ] A "Close menu" button accessible from the pause menu, so users don't have to click their device's back button every time they want to unpause a game
- [ ] Choose if you want to automatically fall back on other emulators or not, in case a game doesn't work (this implies unlocking the option to switch between FinalBurn Neo and MAME 2003-Plus)
- [ ] Easily access and manage all your files from an app-specific folder inside storage/emulated/0

Note: The above features won't be released in this exact order. Concerning the SDM project, not every feature on this list will be implemented (the minimum requirement is 10). Regarding the development after the university project is finished, some features may be changed or even removed. If you don't know what "SDM" means or what Emulair has to do with any kind of university, check the [Wiki page](https://github.com/RaduBratan/Emulair/wiki/5.-More-about-Emulair) for more info on why the project exists.

## Removed Features (from Lemuroid)
- Android TV support
- Turn games into shortcuts for your launcher
- Sync saves on Google Drive

Note: Some features will be brought back later.

## Name Meaning
"Emulair" is a triple entendre and the name is inspired by the Lawnchair launcher (not associated with Emulair). Firstly, "Emulair" kind of sounds like the word "Emulator" (if you try hard enough). Secondly, "Emulair" means "lair of the emu bird", an animal whose name is similar to the abbreviation of the word "emulator". Lastly, "Emulair" also means "lair for all your emulators", which is similar in name to "Vimm's Lair", a place for preserving video games.

## Legal
Copyright (C) 2023 Radu-George Bratan

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.

Before downloading the source code of this software to use it in a project (no matter if it's private or public), please make sure that you understand what the GNU General Public License v3.0 allows you, as well as requires you to do.
