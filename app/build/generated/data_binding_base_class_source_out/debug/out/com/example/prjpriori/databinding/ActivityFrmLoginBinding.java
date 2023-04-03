// Generated by view binder compiler. Do not edit!
package com.example.prjpriori.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prjpriori.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFrmLoginBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ProgressBar barraProgresso;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText lblEmail;

  @NonNull
  public final EditText lblSenha;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TextView signin;

  @NonNull
  public final TextView txtEsqueceuSenha;

  @NonNull
  public final TextView txtSemCadastro;

  private ActivityFrmLoginBinding(@NonNull NestedScrollView rootView,
      @NonNull ProgressBar barraProgresso, @NonNull Button btnLogin, @NonNull EditText lblEmail,
      @NonNull EditText lblSenha, @NonNull ImageView logo, @NonNull TextView signin,
      @NonNull TextView txtEsqueceuSenha, @NonNull TextView txtSemCadastro) {
    this.rootView = rootView;
    this.barraProgresso = barraProgresso;
    this.btnLogin = btnLogin;
    this.lblEmail = lblEmail;
    this.lblSenha = lblSenha;
    this.logo = logo;
    this.signin = signin;
    this.txtEsqueceuSenha = txtEsqueceuSenha;
    this.txtSemCadastro = txtSemCadastro;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFrmLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFrmLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_frm_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFrmLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barraProgresso;
      ProgressBar barraProgresso = ViewBindings.findChildViewById(rootView, id);
      if (barraProgresso == null) {
        break missingId;
      }

      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.lblEmail;
      EditText lblEmail = ViewBindings.findChildViewById(rootView, id);
      if (lblEmail == null) {
        break missingId;
      }

      id = R.id.lblSenha;
      EditText lblSenha = ViewBindings.findChildViewById(rootView, id);
      if (lblSenha == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.signin;
      TextView signin = ViewBindings.findChildViewById(rootView, id);
      if (signin == null) {
        break missingId;
      }

      id = R.id.txtEsqueceuSenha;
      TextView txtEsqueceuSenha = ViewBindings.findChildViewById(rootView, id);
      if (txtEsqueceuSenha == null) {
        break missingId;
      }

      id = R.id.txtSemCadastro;
      TextView txtSemCadastro = ViewBindings.findChildViewById(rootView, id);
      if (txtSemCadastro == null) {
        break missingId;
      }

      return new ActivityFrmLoginBinding((NestedScrollView) rootView, barraProgresso, btnLogin,
          lblEmail, lblSenha, logo, signin, txtEsqueceuSenha, txtSemCadastro);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}