plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.quizapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.quizapp"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    //добавляем библиотеки
    implementation("com.github.ismaeldivita:chip-navigation-bar:1.4.0")// позволяет создать виджет панели навигации,
    // вдохновленный Google Bottom Navigation, смешанный с компонентом Chips.
    //https://github.com/ismaeldivita/chip-navigation-bar

    implementation("com.github.bumptech.glide:glide:4.12.0")//нужна для подгрузки изображений из Интернета

    implementation("jp.wasabeef:glide-transformations:4.3.0")//позволяет трансформировать изображения
    // из glide (https://github.com/wasabeef/glide-transformations?ref=androidrepo.com)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}