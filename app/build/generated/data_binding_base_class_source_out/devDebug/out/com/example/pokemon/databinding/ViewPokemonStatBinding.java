// Generated by view binder compiler. Do not edit!
package com.example.pokemon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pokemon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewPokemonStatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView baseStat;

  @NonNull
  public final TextView statName;

  private ViewPokemonStatBinding(@NonNull ConstraintLayout rootView, @NonNull TextView baseStat,
      @NonNull TextView statName) {
    this.rootView = rootView;
    this.baseStat = baseStat;
    this.statName = statName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewPokemonStatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewPokemonStatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_pokemon_stat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewPokemonStatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.base_stat;
      TextView baseStat = ViewBindings.findChildViewById(rootView, id);
      if (baseStat == null) {
        break missingId;
      }

      id = R.id.stat_name;
      TextView statName = ViewBindings.findChildViewById(rootView, id);
      if (statName == null) {
        break missingId;
      }

      return new ViewPokemonStatBinding((ConstraintLayout) rootView, baseStat, statName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
