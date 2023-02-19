package com.example.test9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private Button lbutton;
    private Button rbutton;
    private Button startbutton;
    private int index[]={1,2,4,8,16,32,64};
    private String[] name ={"赵","司马","钱","孔","孙","罗","李","上官","周","卢","吴","高","证","顾","王","丁",
            "潘","鲁","余","雷","刘","董","徐","梁","朱","叶","金","任","彭","唐","魏","欧阳","马","胡","林","孟",
            "袁","钟","戴","龚","肖","黄","夏","苏","许","方","何","苗","张","万","曹","毛","严","付","范","田","向",
            "杜","汤","段","姚","宋","蔡","涂","阮","伍","代","覃","成","邹","邓","吕","程","汪","柳","石","卜","郝",
            "易","陶","童","曾","欧","喻","郭","施","史","贾","关","侯","薛","熊","江","盛","白","赖","贺","舒","谢",
            "姜","申","华","尹","邱","殷","常","柯","牛","莫","祁","聂","康","倪","梅","水","艾","岳","廖","翟","邬",
            "季","花","左","桂","龙","陆"};
    private int images[]={
            R.drawable.t1,
            R.drawable.t2,
            R.drawable.t3,
            R.drawable.t4,
            R.drawable.t5,
            R.drawable.t6,
            R.drawable.t7,
            R.drawable.t8
    };
    private int num = 0;
    private int indexnum = 0;
    private int namenum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.image);
        lbutton=findViewById(R.id.button);
        rbutton=findViewById(R.id.button2);
        startbutton=findViewById(R.id.button3);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.t1);
            }
        });

        lbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namenum=namenum+index[num];
                num++;
                image.setImageResource(images[num]);
                indexnum++;
                if (indexnum==7){
                    namenum--;
                    Toast.makeText(MainActivity.this,"您的姓氏："+name[namenum],Toast.LENGTH_SHORT).show();
                }
            }
        });

        rbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                image.setImageResource(images[num]);
                indexnum++;
                if (indexnum==7){
                    namenum--;
                    Toast.makeText(MainActivity.this,"您的姓氏："+name[namenum],Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}