package com.cleverds.controller.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
@Slf4j
public class FireBaseConfiguration {

    @Bean
    public void initialize() {
        try (FileInputStream serviceAccount = new FileInputStream("config/serviceAccountKey.json")) {
            final FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://cds-402ef.firebaseio.com")
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
        } catch (IOException e) {
            log.error("Can not connect to Firebase Database!", e);
        }
    }

    @Bean
    public static Firestore getDatabase(){
        return FirestoreClient.getFirestore();
    }
}
