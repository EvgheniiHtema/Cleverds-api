package com.cleverds.logic.utility;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.WriteResult;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;

@Slf4j
public class FireBaseUtility {

    public static String getResultTime(ApiFuture<WriteResult> collectionsApiFuture) {
        try {
            return collectionsApiFuture.get().getUpdateTime().toString();
        } catch (InterruptedException | ExecutionException e) {
            log.error("There is exeption during ");
            return null;
        }
    }
}
