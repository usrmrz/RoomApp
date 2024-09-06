# RoomApp
Room DB experiment

path-to-project-folder\project-name\gradle\libs.versions.toml<br>
[versions]<br>
// Add this lines<br>
&nbsp;&nbsp;&nbsp;&nbsp;kotlin = "2.0.20"<br>
&nbsp;&nbsp;&nbsp;&nbsp;annotation = "1.8.2"<br>
&nbsp;&nbsp;&nbsp;&nbsp;room = "2.6.1"<br>
&nbsp;&nbsp;&nbsp;&nbsp;lifecycleExtensions = "2.8.4"<br>

[libraries]<br>
// Add this lines<br>
&nbsp;&nbsp;&nbsp;&nbsp;androidx-annotation = { group = "androidx.annotation", name = "annotation", version.ref = "annotation" }<br>
&nbsp;&nbsp;&nbsp;&nbsp;room-runtime = { module = "androidx.room:room-runtime", version.ref = "room" }<br>
&nbsp;&nbsp;&nbsp;&nbsp;room-ktx = { module = "androidx.room:room-ktx", version.ref = "room" }<br>
&nbsp;&nbsp;&nbsp;&nbsp;room-compiler = { module = "androidx.room:room-compiler", version.ref = "room" }<br>
&nbsp;&nbsp;&nbsp;&nbsp;androidx-lifecycle-viewmodel-compose = { module = "androidx.lifecycle:lifecycle-viewmodel-compose", version.ref = "lifecycleExtensions" }<br>

[plugins]<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;compose-compiler = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }

path-to-project-folder\project-name\build.gradle.kts<br>
plugins {<br>
// Add this line<br>
&nbsp;&nbsp;&nbsp;&nbsp;alias(libs.plugins.compose.compiler) apply false

path-to-project-folder\project-name\app\build.gradle.kts<br>
plugins {<br>
// Add this lines<br>
&nbsp;&nbsp;&nbsp;&nbsp;kotlin("kapt")<br>
&nbsp;&nbsp;&nbsp;&nbsp;alias(libs.plugins.compose.compiler)<br>

dependencies {<br>
// Add this lines<br>
&nbsp;&nbsp;&nbsp;&nbsp;implementation(libs.androidx.annotation)<br>
&nbsp;&nbsp;&nbsp;&nbsp;implementation(libs.room.runtime)<br>
&nbsp;&nbsp;&nbsp;&nbsp;implementation(libs.room.ktx)<br>
&nbsp;&nbsp;&nbsp;&nbsp;//noinspection KaptUsageInsteadOfKsp
&nbsp;&nbsp;&nbsp;&nbsp;kapt(libs.room.compiler)<br>
&nbsp;&nbsp;&nbsp;&nbsp;implementation(libs.androidx.lifecycle.viewmodel.compose)<br>