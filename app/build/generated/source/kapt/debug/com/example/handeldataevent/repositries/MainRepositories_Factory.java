// Generated by Dagger (https://dagger.dev).
package com.example.handeldataevent.repositries;

import com.example.handeldataevent.data.remote.network.ApiPostsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainRepositories_Factory implements Factory<MainRepositories> {
  private final Provider<ApiPostsService> postsServiceProvider;

  public MainRepositories_Factory(Provider<ApiPostsService> postsServiceProvider) {
    this.postsServiceProvider = postsServiceProvider;
  }

  @Override
  public MainRepositories get() {
    return newInstance(postsServiceProvider.get());
  }

  public static MainRepositories_Factory create(Provider<ApiPostsService> postsServiceProvider) {
    return new MainRepositories_Factory(postsServiceProvider);
  }

  public static MainRepositories newInstance(ApiPostsService postsService) {
    return new MainRepositories(postsService);
  }
}
