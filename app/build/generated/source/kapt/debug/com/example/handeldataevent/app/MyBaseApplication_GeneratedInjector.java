package com.example.handeldataevent.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MyBaseApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MyBaseApplication_GeneratedInjector {
  void injectMyBaseApplication(MyBaseApplication myBaseApplication);
}
