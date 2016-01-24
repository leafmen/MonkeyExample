package leafmen.tsz.com.monkeyexample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by LiQiang on 2016/1/24.
 */
public class MonkeyView extends View {
    public float bitmapX;
    public float bitmapY;

    public MonkeyView(Context context) {
        super(context);
        bitmapX = 750;
        bitmapY=500;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.m1);
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if (bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
