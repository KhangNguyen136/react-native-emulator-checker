
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNEmulatorCheckerSpec.h"

@interface EmulatorChecker : NSObject <NativeEmulatorCheckerSpec>
#else
#import <React/RCTBridgeModule.h>

@interface EmulatorChecker : NSObject <RCTBridgeModule>
#endif

@end
