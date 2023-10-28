plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.tvshows"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tvshows"
        minSdk = 24
        targetSdk = 33
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
    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Material Design
    implementation("com.google.android.material:material:1.10.0")

    //Retrofit a Gson
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    //picasso
    implementation ("com.squareup.picasso:picasso:2.8")

    //Lifecycle extensions
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    //Room & Rxjava Support
    implementation("androidx.room:room-runtime:2.6.0")
    annotationProcessor("androidx.room:room-compiler:2.6.0")
    implementation("androidx.room:room-rxjava3:2.6.0")

    //RxJava
    implementation("io.reactivex.rxjava2:rxandroid:2.0.2")

    //Scalable size units
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")

    //Rounded Image view
    implementation("com.makeramen:roundedimageview:2.3.0")


}