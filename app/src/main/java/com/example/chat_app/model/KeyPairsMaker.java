package com.example.chat_app.model;

import com.google.firebase.database.IgnoreExtraProperties;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IgnoreExtraProperties
public class KeyPairsMaker {
    String preKeyPairPrivateKey;
    String signedPreKeySignaturePrivateKey;
    long timestamp;
}
