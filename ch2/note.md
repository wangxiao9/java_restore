## 标识符
1. Java 对各种变量，方法和类等要素命名时使用的字符序列为标识符
     * 凡是自己可以起名字的地方都叫标识符，都遵守标识符规则
2. Java 标识符规则
     * 标识符由 字母 下划线_ 美元符 $ 或数字组成
     * 标识符应该以字母，下划线，美元符开头 （不能以数字为开头）
     * Java标识符大小写敏感，长度无限制

## 关键字
1. Java中关键字赋予特定的含义，称为关键字（keyword）
2. Java中所有的关键字都是小写英文
     * https://www.cnblogs.com/longesang/p/10642776.html


## Java基本数据类型
1. 常量
     * 用字符串标识，区分为不同的数据类型
          * 整型常量 123,3
          * 实型常量 3.23
          * 字符常量 'a'
          * 逻辑常量 true false
          * 字符串常量 'addbhjdhkja'
     * 常量的值不可变

2. 变量
     * Java变量是程序中最基本的存储单元。要素包括变量名，变量类型，作用域
     * 使用前必须对其声明
          * int a = 123;
          * String a = 'helloworld';
          * double d1,d2,d3 = 0.123; (第一个变量默认0.00)
     * 分类
          * 按照声明位置划分
               * 局部变量 ： 方法或语句块内部定义的变量
               * 成员变量 ： 方法外部，类的内部定义的变量
               * 注意： 类外卖不能有变量声明
          * 根据所属的数据类型划分
               * 基本数据类型变量
                    * 数据值 （byte占1字节,short占2字节,int占4字节,long占8字节,float占4字节,double占8字节）
                    * 字符型（char）
                    * 布尔型（boolean）
               * 引用数据类型变量
                    * 类（class）
                    * 接口（interface）
                    * 数组
     * Java 采用Unicode编码

## 运算符
1. 算术运算符： + - * 、 % ++ --
2. 关系运算符： > < >= <= == !=
3. 逻辑运算符： ！ & | …… && ||
4. 位运算符： & | ^ ~ >> << >
5. 赋值运算符 =
6. 扩展赋值运算符： += -=
7. 字符连接 +


## 表达式和语句 
1. 三目运算符
     * x?y:z

## 分支
* if
* if else
* if elseif
* if elseif elseif else
* switch() {case xx: case xx: default}

## 循环
* for
* while
* do while
* break: 终止某个语句块的时候执行
* continue: 终止某次循环过程，跳出循环体中的，开始下一个循环

## 方法
1. Java方法类似其他语言的函数，用一段晚来完成特定功能的代码片段，声明格式
     * 修饰符（public private） 返回值类型 方法名 (形参) {Java语句}
2. 形参： 在方法被调用时用于接收外界输入的数据
3. 实参： 调用方法时实际传给方法的数据
4. 返回值：方法在执行完毕后返回给调用它的环境数据
5. 返回值类型：事先约定的返回值的数据类型，如无返回值，必须给出返回值的void
6. Java语句中调用： 对象名.方法名（实参）
7. return语句终止方法并且返回数据

## 变量的作用域

## 递归调用

## 递归的方法

> Fibonacci数列1,1,2,3,5,8... 求算第n个数列的值,用递归的方法求出值

```
public static int F(int num) {
          if (num==1 || num==2) {
               return 1;
          } else {
               return F(num-1) + F(num-2);
          }
     }
```

## 非递归的方法

```
public static long F2(int index) {
          if (index == 1 || index ==2) {
               return 1;
          } 

          long f1 = 1L;
          long f2 = 1L;
          long f = 0;

          for (int i=0; i<=index-2; i++) {
               f = f1 + f2;
               f1 = f2;
               f2 = f;
          }

          return f;
     }
```