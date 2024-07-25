
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNEmulatorCheckerSpec.h"

@interface EmulatorChecker : NSNumber <NativeEmulatorCheckerSpec>
#else
#import <React/RCTBridgeModule.h>

@interface EmulatorChecker : NSNumber <RCTBridgeModule>
#endif

@end
