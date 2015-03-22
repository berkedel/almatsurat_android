package com.github.berkedel.almatsurat_android.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by hadi on 3/22/15.
 */
public class ArabicTextView extends TextView {
    public ArabicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/GS45_Arab_AndroidOS.ttf"));
    }
}
