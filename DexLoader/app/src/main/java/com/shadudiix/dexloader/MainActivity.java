package com.shadudiix.dexloader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import dalvik.system.InMemoryDexClassLoader;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            InputStream assetStream = getAssets().open("DexInstance.dex");
            byte[] dexBuffer = new byte[assetStream.available()];
            assetStream.read(dexBuffer);
            assetStream.close();

            InMemoryDexClassLoader dexLoader = new InMemoryDexClassLoader(ByteBuffer.wrap(dexBuffer), this.getClassLoader());
            Class<?> dexInstance = dexLoader.loadClass("com.shadudiix.dexinstance.DexInstance");
            Method dexMethod = dexInstance.getMethod("getSDKVersion");

            String dexValue = dexMethod.invoke(
              dexInstance.newInstance()
            ).toString();
            System.out.println("Android version is: " + dexValue);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}