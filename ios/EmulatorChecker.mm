#import "EmulatorChecker.h"

@implementation EmulatorChecker
RCT_EXPORT_MODULE()

+(BOOL)requiresMainQueueSetup
{
  return NO; // Return YES if your module must be initialized on the main thread
}

// Example method
// See // https://reactnative.dev/docs/native-modules-ios
RCT_EXPORT_METHOD(isEmulator:(RCTPromiseResolveBlock)resolve
                  reject:(RCTPromiseRejectBlock)reject)
{
    resolve(@NO);
}


@end
