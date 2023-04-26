// Generated by view binder compiler. Do not edit!
package com.example.prjpriori.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
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
  public final ListView investimentosRealizados;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView textView2;

  private ActivityFrmHomePageBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnConfig,
      @NonNull Button btnDisponivel, @NonNull Button btnHome, @NonNull Button btnPerfil,
      @NonNull Button btnPerfil2, @NonNull ListView investimentosRealizados,
      @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.btnConfig = btnConfig;
    this.btnDisponivel = btnDisponivel;
    this.btnHome = btnHome;
    this.btnPerfil = btnPerfil;
    this.btnPerfil2 = btnPerfil2;
    this.investimentosRealizados = investimentosRealizados;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.textView2 = textView2;
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

      id = R.id.investimentosRealizados;
      ListView investimentosRealizados = ViewBindings.findChildViewById(rootView, id);
      if (investimentosRealizados == null) {
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

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityFrmHomePageBinding((ConstraintLayout) rootView, btnConfig, btnDisponivel,
          btnHome, btnPerfil, btnPerfil2, investimentosRealizados, linearLayout, linearLayout2,
          textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
