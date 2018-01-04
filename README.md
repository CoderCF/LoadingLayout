# LoadingLayout
一个可以随时切换加载中界面、错误界面、空界面、和主界面的控件

##效果图

![这里写图片描述](/pic/a.gif)

##用法

 1.**xml布局**
	**注：loadinglayout布局里面必须有且只有一个子布局，不然会报错。**
```
<com.cf.loadinglayoutmodule.LoadingLayout
        android:id="@+id/loading_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:text="我是内容界面"
            android:textSize="16sp"/>
    </com.cf.loadinglayoutmodule.LoadingLayout>
```

2.**初始化Loadinglayout**

```
 mLoadingLayout = (LoadingLayout) findViewById(R.id.loading_layout);
```

3.**加载所需布局**
```
/**显示加载中布局*/
mLoadingLayout.showLoading();
/**显示错误布局*/
mLoadingLayout.showError();
/**显示空布局*/
mLoadingLayout.showEmpty();
/**显示主布局*/
mLoadingLayout.showMain();
```


博客地址：[http://blog.csdn.net/chengfu116/article/details/77097288](http://blog.csdn.net/chengfu116/article/details/77097288)

