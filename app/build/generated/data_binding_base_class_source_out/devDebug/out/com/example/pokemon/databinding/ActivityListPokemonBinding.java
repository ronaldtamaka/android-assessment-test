// Generated by view binder compiler. Do not edit!
package com.example.pokemon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pokemon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityListPokemonBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar pb;

  @NonNull
  public final RecyclerView rv;

  private ActivityListPokemonBinding(@NonNull ConstraintLayout rootView, @NonNull ProgressBar pb,
      @NonNull RecyclerView rv) {
    this.rootView = rootView;
    this.pb = pb;
    this.rv = rv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityListPokemonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityListPokemonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_list_pokemon, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityListPokemonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pb;
      ProgressBar pb = ViewBindings.findChildViewById(rootView, id);
      if (pb == null) {
        break missingId;
      }

      id = R.id.rv;
      RecyclerView rv = ViewBindings.findChildViewById(rootView, id);
      if (rv == null) {
        break missingId;
      }

      return new ActivityListPokemonBinding((ConstraintLayout) rootView, pb, rv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}