# Android Build Variants

A small Android project in Kotlin that demonstrates build variant configuration
in Gradle: custom build types, product flavors, and overriding code and
resources in separate source sets.

## Features

- Build types `debug`, `release`, `staging`, `beta`: each has its own
  `versionNameSuffix` and `BuildConfig.TYPE` field; `staging` and `beta` inherit
  the `debug` settings via `initWith`
- Product flavors `freeConfig` and `paid` (the `version` dimension) with version suffixes
  `.free` / `.paid`
- A separate `MainActivity` for each flavor, showing a toast "Free config" /
  "Paid config"
- Resource overrides: separate layouts for `freeConfigDebug`, `paidDebug`
  and `staging`, and custom strings for `staging`

## Project structure

```
app/src/
├── main/               # manifest, base layout and resources
├── freeConfig/         # MainActivity for the free version
├── paid/               # MainActivity for the paid version
├── freeConfigDebug/    # layout for freeConfigDebug
├── paidDebug/          # layout for paidDebug
└── staging/            # layout and strings for staging
```

## Build

Requires JDK 11–17 and Android SDK 30.

```bash
./gradlew assembleFreeConfigDebug    # or assemblePaidStaging, assembleRelease, etc.
```

APK: `app/build/outputs/apk/<flavor>/<buildType>/`.
