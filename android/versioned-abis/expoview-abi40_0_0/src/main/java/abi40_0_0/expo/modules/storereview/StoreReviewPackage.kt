package abi40_0_0.expo.modules.storereview

import android.content.Context
import abi40_0_0.org.unimodules.core.BasePackage

class StoreReviewPackage : BasePackage() {
  override fun createExportedModules(context: Context) = listOf(StoreReviewModule(context))
}