package com.dempsey.example.marvelapp.data.dao.remotedao;

import android.support.annotation.NonNull;
import com.dempsey.example.marvelapp.data.model.Comic;

interface MarvelRemoteDao {

  Comic getAllCharacters(@NonNull final String param, @NonNull final String... params);


}