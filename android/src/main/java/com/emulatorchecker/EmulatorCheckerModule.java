package com.emulatorchecker;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.reveny.emulator.detection.EmulatorDetection;

@ReactModule(name = EmulatorCheckerModule.NAME)
public class EmulatorCheckerModule extends ReactContextBaseJavaModule {
  public static final String NAME = "EmulatorChecker";

  public EmulatorCheckerModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void isEmulator(Promise promise) {
    // EmulatorDetector.with(getReactApplicationContext())
    // .setCheckTelephony(false)
    // .addPackageName("com.bluestacks")
    // .setDebug(true)
    // .detect(new EmulatorDetector.OnEmulatorDetectorListener() {
    //     @Override
    //     public void onResult(boolean isEmulator) {
    //             promise.resolve(isEmulator);
    //     }
    // });
    EmulatorDetection detection = new EmulatorDetection();
    boolean result = detection.isDetected();
    promise.resolve(result);
  }
}
