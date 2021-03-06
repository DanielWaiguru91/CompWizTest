
object BuildPlugins {
    object Versions {
        const val buildToolsVersion = "4.2.2"
        const val safeArgsPlugin = "2.3.5"
        const val kotlinVersion = "1.5.20"
    }
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinStdPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val safeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.safeArgsPlugin}"
    //Plugins
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "android"
    const val safeArgs = "androidx.navigation.safeargs.kotlin"
    const val kotlinKapt = "kotlin-kapt"
    const val kotlinParcelize = "kotlin-parcelize"
}
object AndroidSDK {
    const val compileSdkVersion = 30
    const val targetSdk = compileSdkVersion
    const val minSdk = 21
}
object Libs {
    private object Versions {
        const val coreKtxVersion = "1.6.0"
        const val appCompatVersion = "1.3.0"
        const val constraintVersion = "2.0.4"
        const val uiKtxVersion = "2.3.3"
        const val materialVersion = "1.4.0"
        const val coroutinesVersion = "1.5.0"
        const val glideVersion = "4.11.0"
        const val lifecycleVersion = "2.4.0-alpha02"
        const val retrofitVersion = "2.9.0"
        const val okHttpVersion = "4.9.1"
        const val koinVersion = "3.1.2"
        const val supportVersion = "1.0.0"
        const val RvMultiSelectionVersion = "1.0.0"
    }
    const val supportV4 = "androidx.legacy:legacy-support-v4:${Versions.supportVersion}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${BuildPlugins.Versions.kotlinVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintVersion}"
    const val navUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.uiKtxVersion}"
    const val fragmentNavigation =
        "androidx.navigation:navigation-fragment-ktx:${Versions.uiKtxVersion}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialVersion}"
    const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideAnnotation = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    const val viewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"

    //Networking
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofitVersion}"
    const val okHttp = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"

    //Koin for DI
    const val koinAndroid = "io.insert-koin:koin-android:${Versions.koinVersion}"
    const val koinViewModel = "io.insert-koin:koin-android-viewmodel:${Versions.koinVersion}"
    const val glideVector = "com.github.corouteam:GlideToVectorYou:v2.0.0"

    const val rvSelection = "androidx.recyclerview:recyclerview-selection:${Versions.RvMultiSelectionVersion}"

}

object TestLibs {
    private object Versions {
        const val junitVersion = "4.13.2"
        const val androidxJunitVersion = "1.1.3"
        const val espressoVersion = "3.4.0"
        const val mockitoVersion = "3.5.15"
        const val mockServerVersion = "4.9.0"
        const val robolectricVersion = "4.4"
        const val androidxCoreTestVersion = "2.1.0"
        const val coroutineTestVersion = "1.4.2"
        const val fragmentTestingVersion = "1.2.5"
        const val koinVersion = "3.1.2"
        const val truthVersion = "1.0.1"
        const val mockkVersion = "1.12.0"
        const val runner = "1.3.0"
        const val rules = "1.3.0"
        const val liveDataTest = "1.2.0"
    }
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxJunitVersion }"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockitoVersion}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectricVersion}"
    const val androidxArchCore = "androidx.arch.core:core-testing:${Versions.androidxCoreTestVersion}"
    const val coroutineTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutineTestVersion}"
    const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragmentTestingVersion}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockServerVersion}"
    const val koinTest = "io.insert-koin:koin-test:${Versions.koinVersion}"
    const val truth = "com.google.truth:truth:${Versions.truthVersion}"
    const val mockk = "io.mockk:mockk:${Versions.mockkVersion}"
    const val mockInstrumented = "io.mockk:mockk-android:${Versions.mockkVersion}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val rules = "androidx.test:rules:${Versions.rules}"
    const val liveDataTest = "com.jraska.livedata:testing-ktx:${Versions.liveDataTest}"

}