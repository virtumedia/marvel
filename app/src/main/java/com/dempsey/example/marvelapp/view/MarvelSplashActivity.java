package com.dempsey.example.marvelapp.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.dempsey.example.marvelapp.R;
import com.dempsey.example.marvelapp.presenter.MarvelContract;
import com.dempsey.example.marvelapp.presenter.MarvelSplashPresenter;

public class MarvelSplashActivity extends BaseActivity<MarvelSplashPresenter> implements MarvelContract.View {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    retrieveContentToDisplay();
  }

  private void retrieveContentToDisplay() {
    final boolean hasStoredContent = false; //presenter.hasStoredResults();

    if (hasStoredContent) {
      displayResults();
    } else {
      final String key = getString(R.string.appl_keyP);
      final String key2 = getString(R.string.appl_key);
      presenter.retrieveListOfCharacters(key, key2);
    }
  }

  @Override
  public MarvelSplashPresenter createPresenter(@NonNull Activity activity) {
    return MarvelSplashPresenter.createPresenter(activity, this);
  }

  @Override
  public void displayResults() {
    startActivity(ItemsListActivity.newIntent(this));
  }
}