package expo.interfaces.devmenu

import abi40_0_0.com.facebook.react.bridge.WritableMap

interface DevMenuSettingsInterface {
  /**
   * Whether to enable shake gesture.
   */
  var motionGestureEnabled: Boolean

  /**
   * Whether to enable three-finger long press gesture.
   */
  var touchGestureEnabled: Boolean

  /**
   * Whether to enable key commands.
   */
  var keyCommandsEnabled: Boolean

  /**
   * Whether to automatically show the dev menu once its delegate is set and the bridge is loaded.
   */
  var showsAtLaunch: Boolean

  /**
   * Returns `true` only if the user finished onboarding, `false` otherwise.
   */
  var isOnboardingFinished: Boolean

  /**
   * Serializes settings into a [WritableMap] so they can be passed through the bridge.
   */
  fun serialize(): WritableMap
}
