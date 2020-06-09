# CrashCapture
崩溃日志抓取
1.项目导入

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	
	
	dependencies {
	        implementation 'com.github.yuxuhao:CrashCapture:V1.0.0'
	}
```

2、MyApp内初始化

​    

```
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 放在其他库初始化前
         * boolean debug显示 其他不显示
         */
        SpiderMan.init(this, true);
    }
}
```

