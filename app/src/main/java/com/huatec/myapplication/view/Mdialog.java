package com.huatec.myapplication.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

import com.huatec.myapplication.R;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;

public class Mdialog extends Dialog {

    private Button button_cancel, button_exit;//定义取消与确认按钮
    private TextView tv;//定义标题文字

    //构造方法
    public Mdialog(Context context) {

        //设置对话框样式
        super(context, R.style.mdialog);

        //通过LayoutInflater获取布局
        View view = LayoutInflater.from(getContext()).inflate(R.layout.mdialoglayout, null);
        tv = view.findViewById(R.id.title);   //获取显示标题的文本框控件
        button_cancel = view.findViewById(R.id.btn_cancel);    //获取取消按钮
        button_exit = view.findViewById(R.id.btn_exit);  //获取确认退出按钮
        setContentView(view);  //设置显示的视图
    }

    //设置标题
    public void setTv(String content) {
        tv.setText(content);
    }

    //取消监听
    public void setOnCancelListener(View.OnClickListener listener) {
        button_cancel.setOnClickListener(listener);
    }

    //退出监听
    public void setOnExitListener(View.OnClickListener listener) {
        button_exit.setOnClickListener(listener);
    }
}
