package abi37_0_0.expo.modules.webbrowser;

import android.content.Context;

import java.util.Collections;
import java.util.List;

import abi37_0_0.org.unimodules.core.BasePackage;
import abi37_0_0.org.unimodules.core.ExportedModule;
import abi37_0_0.org.unimodules.core.ViewManager;

public class WebBrowserPackage extends BasePackage {
  @Override
  public List<ExportedModule> createExportedModules(Context context) {
    return Collections.singletonList((ExportedModule) new WebBrowserModule(context));
  }
}
