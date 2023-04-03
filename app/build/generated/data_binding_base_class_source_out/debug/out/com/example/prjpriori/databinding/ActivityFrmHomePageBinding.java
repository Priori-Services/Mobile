// Generated by view binder compiler. Do not edit!
package com.example.prjpriori.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prjpriori.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFrmHomePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnConfig;

  @NonNull
  public final Button btnDisponivel;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnPerfil;

  @NonNull
  public final Button btnPerfil2;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView textVie3;

  @NonNull
  public final TextView textVie4;

  @NonNull
  public final TextView textVie5;

  @NonNull
  public final TextView textVie6;

  @NonNull
  public final TextView textVie7;

  @NonNull
  public final TextView textVie8;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  private ActivityFrmHomePageBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnConfig,
      @NonNull Button btnDisponivel, @NonNull Button btnHome, @NonNull Button btnPerfil,
      @NonNull Button btnPerfil2, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout2, @NonNull TextView textVie3, @NonNull TextView textVie4,
      @NonNull TextView textVie5, @NonNull TextView textVie6, @NonNull TextView textVie7,
      @NonNull TextView textVie8, @NonNull TextView textView2, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6,
      @NonNull TextView textView7, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.btnConfig = btnConfig;
    this.btnDisponivel = btnDisponivel;
    this.btnHome = btnHome;
    this.btnPerfil = btnPerfil;
    this.btnPerfil2 = btnPerfil2;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.textVie3 = textVie3;
    this.textVie4 = textVie4;
    this.textVie5 = textVie5;
    this.textVie6 = textVie6;
    this.textVie7 = textVie7;
    this.textVie8 = textVie8;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFrmHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFrmHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_frm_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFrmHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnConfig;
      Button btnConfig = ViewBindings.findChildViewById(rootView, id);
      if (btnConfig == null) {
        break missingId;
      }

      id = R.id.btnDisponivel;
      Button btnDisponivel = ViewBindings.findChildViewById(rootView, id);
      if (btnDisponivel == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnPerfil;
      Button btnPerfil = ViewBindings.findChildViewById(rootView, id);
      if (btnPerfil == null) {
        break missingId;
      }

      id = R.id.btnPerfil2;
      Button btnPerfil2 = ViewBindings.findChildViewById(rootView, id);
      if (btnPerfil2 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.textVie3;
      TextView textVie3 = ViewBindings.findChildViewById(rootView, id);
      if (textVie3 == null) {
        break missingId;
      }

      id = R.id.textVie4;
      TextView textVie4 = ViewBindings.findChildViewById(rootView, id);
      if (textVie4 == null) {
        break missingId;
      }

      id = R.id.textVie5;
      TextView textVie5 = ViewBindings.findChildViewById(rootView, id);
      if (textVie5 == null) {
        break missingId;
      }

      id = R.id.textVie6;
      TextView textVie6 = ViewBindings.findChildViewById(rootView, id);
      if (textVie6 == null) {
        break missingId;
      }

      id = R.id.textVie7;
      TextView textVie7 = ViewBindings.findChildViewById(rootView, id);
      if (textVie7 == null) {
        break missingId;
      }

      id = R.id.textVie8;
      TextView textVie8 = ViewBindings.findChildViewById(rootView, id);
      if (textVie8 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityFrmHomePageBinding((ConstraintLayout) rootView, btnConfig, btnDisponivel,
          btnHome, btnPerfil, btnPerfil2, linearLayout, linearLayout2, textVie3, textVie4, textVie5,
          textVie6, textVie7, textVie8, textView2, textView3, textView4, textView5, textView6,
          textView7, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
