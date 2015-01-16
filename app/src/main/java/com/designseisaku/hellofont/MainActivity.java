package com.designseisaku.hellofont;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // フォント読み込み
        Typeface typeface = getTypefaceFromAssets(this, "icomoon.ttf");

        // コントロールの表示フォント指定
        TextView textView = (TextView) this.findViewById(R.id.textView);
        textView.setTypeface(typeface);
        textView.setText("a b c");

        // アイコン表示
        TextView icontextView = ( TextView )this.findViewById( R.id.icontextView);
        icontextView.setText( "a" );

    }

//    public class FontUtility {
        /**
         * フォントを assets から読み込みます。
         *
         * @param context コンテキスト。
         * @param path    フォント ファイルを示す assets フォルダからの相対パス。
         * @return 成功時は Typeface インスタンス。それ以外は null。
         */
        public static Typeface getTypefaceFromAssets(Context context, String path) {
            return Typeface.createFromAsset(context.getAssets(), path);
        }

 //   }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
