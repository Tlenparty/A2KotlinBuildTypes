# Android Build Variants

Небольшой Android-проект на Kotlin, демонстрирующий настройку вариантов сборки
в Gradle: собственные build types, product flavors и переопределение кода и
ресурсов в отдельных source sets.

## Возможности

- Build types `debug`, `release`, `staging`, `beta`: у каждого свой
  `versionNameSuffix` и поле `BuildConfig.TYPE`; `staging` и `beta` наследуют
  настройки `debug` через `initWith`
- Product flavors `freeConfig` и `paid` (измерение `version`) с суффиксами версии
  `.free` / `.paid`
- Своя `MainActivity` для каждого flavor — показывает тост «Free config» /
  «Paid config»
- Переопределение ресурсов: отдельные разметки для `freeConfigDebug`, `paidDebug`
  и `staging`, свои строки для `staging`

## Структура

```
app/src/
├── main/               # манифест, базовая разметка и ресурсы
├── freeConfig/         # MainActivity для free-версии
├── paid/               # MainActivity для paid-версии
├── freeConfigDebug/    # разметка для freeConfigDebug
├── paidDebug/          # разметка для paidDebug
└── staging/            # разметка и строки для staging
```

## Сборка

Требуется JDK 11–17 и Android SDK 30.

```bash
./gradlew assembleFreeConfigDebug    # или assemblePaidStaging, assembleRelease и т.д.
```

APK: `app/build/outputs/apk/<flavor>/<buildType>/`.
