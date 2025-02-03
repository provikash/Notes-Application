plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.noteapplicationusingdatabase"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.noteapplicationusingdatabase"
        minSdk = 29
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        var jvmTarget = "11"
    }
}

dependencies {


    implementation(libs.core.ktx)
    val room_version = "2.6.1"

    val lifecycle_version = "2.8.7"

    implementation("androidx.room:room-ktx:$room_version")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Annotation processor
    implementation("androidx.lifecycle:lifecycle-common-java8:$lifecycle_version")

    annotationProcessor("androidx.room:room-compiler:$room_version")

    // Room components
    implementation ("androidx.room:room-ktx:$rootProject.roomVersion")
    implementation ("androidx.room:room-compiler:$rootProject.roomVersion")
    androidTestImplementation ("androidx.room:room-testing:$rootProject.roomVersion")



    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}