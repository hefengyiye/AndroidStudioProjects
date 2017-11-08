package com.example.fengyiye.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class Customview extends View {
    Bitmap img;
    int y = 0;

    public Customview(Context context) {
        super(context);
        init(null, 0);
    }

    public Customview(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public Customview(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        img = BitmapFactory.decodeResource(getResources(),R.drawable.desktop);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.YELLOW);
        canvas.drawBitmap(img,0,y,null);

        y=y+10;
    }


}
