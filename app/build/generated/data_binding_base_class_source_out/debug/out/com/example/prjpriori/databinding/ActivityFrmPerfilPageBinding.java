// Generated by view binder compiler. Do not edit!
package com.example.prjpriori.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prjpriori.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFrmPerfilPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView DataNascimentoPerfil;

  @NonNull
  public final TextView Rs;

  @NonNull
  public final Button btnDisponivel;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnLogoutPerfil;

  @NonNull
  public final Button btnPerfil;

  @NonNull
  public final TextView colsultorPerfil;

  @NonNull
  public final TextView dataAdesaoPerfil;

  @NonNull
  public final TextView emailPerfil;

  @NonNull
  public final TextView enderecoPerfil;

  @NonNull
  public final ImageView fotoPerfil;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView nomePerfil;

  @NonNull
  public final TextView pontuacaoPerfil;

  @NonNull
  public final LinearLayout saldo;

  @NonNull
  public final TextView tipoPerfil;

  @NonNull
  public final TextView txtSaldo;

  private ActivityFrmPerfilPageBinding(@NonNull LinearLayout rootView,
      @NonNull TextView DataNascimentoPerfil, @NonNull TextView Rs, @NonNull Button btnDisponivel,
      @NonNull Button btnHome, @NonNull Button btnLogoutPerfil, @NonNull Button btnPerfil,
      @NonNull TextView colsultorPerfil, @NonNull TextView dataAdesaoPerfil,
      @NonNull TextView emailPerfil, @NonNull TextView enderecoPerfil,
      @NonNull ImageView fotoPerfil, @NonNull LinearLayout linearLayout,
      @NonNull TextView nomePerfil, @NonNull TextView pontuacaoPerfil, @NonNull LinearLayout saldo,
      @NonNull TextView tipoPerfil, @NonNull TextView txtSaldo) {
    this.rootView = rootView;
    this.DataNascimentoPerfil = DataNascimentoPerfil;
    this.Rs = Rs;
    this.btnDisponivel = btnDisponivel;
    this.btnHome = btnHome;
    this.btnLogoutPerfil = btnLogoutPerfil;
    this.btnPerfil = btnPerfil;
    this.colsultorPerfil = colsultorPerfil;
    this.dataAdesaoPerfil = dataAdesaoPerfil;
    this.emailPerfil = emailPerfil;
    this.enderecoPerfil = enderecoPerfil;
    this.fotoPerfil = fotoPerfil;
    this.linearLayout = linearLayout;
    this.nomePerfil = nomePerfil;
    this.pontuacaoPerfil = pontuacaoPerfil;
    this.saldo = saldo;
    this.tipoPerfil = tipoPerfil;
    this.txtSaldo = txtSaldo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFrmPerfilPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFrmPerfilPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_frm_perfil_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFrmPerfilPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DataNascimento_perfil;
      TextView DataNascimentoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (DataNascimentoPerfil == null) {
        break missingId;
      }

      id = R.id.Rs;
      TextView Rs = ViewBindings.findChildViewById(rootView, id);
      if (Rs == null) {
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

      id = R.id.btnLogout_perfil;
      Button btnLogoutPerfil = ViewBindings.findChildViewById(rootView, id);
      if (btnLogoutPerfil == null) {
        break missingId;
      }

      id = R.id.btnPerfil;
      Button btnPerfil = ViewBindings.findChildViewById(rootView, id);
      if (btnPerfil == null) {
        break missingId;
      }

      id = R.id.colsultor_perfil;
      TextView colsultorPerfil = ViewBindings.findChildViewById(rootView, id);
      if (colsultorPerfil == null) {
        break missingId;
      }

      id = R.id.dataAdesao_perfil;
      TextView dataAdesaoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (dataAdesaoPerfil == null) {
        break missingId;
      }

      id = R.id.email_perfil;
      TextView emailPerfil = ViewBindings.findChildViewById(rootView, id);
      if (emailPerfil == null) {
        break missingId;
      }

      id = R.id.endereco_perfil;
      TextView enderecoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (enderecoPerfil == null) {
        break missingId;
      }

      id = R.id.foto_perfil;
      ImageView fotoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (fotoPerfil == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.nome_perfil;
      TextView nomePerfil = ViewBindings.findChildViewById(rootView, id);
      if (nomePerfil == null) {
        break missingId;
      }

      id = R.id.pontuacao_perfil;
      TextView pontuacaoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (pontuacaoPerfil == null) {
        break missingId;
      }

      id = R.id.saldo;
      LinearLayout saldo = ViewBindings.findChildViewById(rootView, id);
      if (saldo == null) {
        break missingId;
      }

      id = R.id.tipo_perfil;
      TextView tipoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (tipoPerfil == null) {
        break missingId;
      }

      id = R.id.txtSaldo;
      TextView txtSaldo = ViewBindings.findChildViewById(rootView, id);
      if (txtSaldo == null) {
        break missingId;
      }

      return new ActivityFrmPerfilPageBinding((LinearLayout) rootView, DataNascimentoPerfil, Rs,
          btnDisponivel, btnHome, btnLogoutPerfil, btnPerfil, colsultorPerfil, dataAdesaoPerfil,
          emailPerfil, enderecoPerfil, fotoPerfil, linearLayout, nomePerfil, pontuacaoPerfil, saldo,
          tipoPerfil, txtSaldo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
