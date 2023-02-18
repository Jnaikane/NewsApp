package com.codingtest.newsapp.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import com.codingtest.newsapp.R;


public class ProgressDialogUtils {
    private static final String TAG = ProgressDialogUtils.class.getSimpleName();
    private static ProgressDialogUtils dialogUtils;

    private ProgressDialog progressDialog;

    private ProgressDialogUtils() {
    }

    public static ProgressDialogUtils getInstance() {
        if (dialogUtils == null) {
            dialogUtils = new ProgressDialogUtils();
        }
        return dialogUtils;
    }

    public void show(Context context) {
        try {
            if (progressDialog != null && progressDialog.isShowing()) {
                return;
            }
            progressDialog = new ProgressDialog(context, R.style.TransparentProgressDialog);
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setCancelable(false);
            progressDialog.show();
        } catch (Exception ex) {
            Log.e(TAG, "Exception : " + ex);
        }
    }

    public void dismiss() {
        try {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        } catch (Exception ex) {
            Log.e(TAG, "Exception : " + ex);
        }
    }
}
