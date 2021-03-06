#JavaEE
## JavaWeb软件结构
    JavaEE项目——浏览器B，Web服务器S BS结构 Browser Server
    JavaSE项目——客户端C，服务器S    CS结构 Client Server
## 前端开发流程
    美术实现->前端工程师（设计成静态网页）（H5）->Java程序员（将静态网页修改为动态网页）(JSP)  
## 网页的组成部分
### 内容（结构）
    页面中可看到的数据，称之为内容。一般使用html技术展示。
### 表现
    指内容在页面上的展示形式。一般使用CSS技术实现。
### 行为
    指页面中元素与输入设备交互的响应。一般使用JavaScript技术实现

## HTML & CSS
## HTML （决定页面内容）
- HTML  
简单介绍HTML全称Hyper Text Markup Language(超文本标记语言) 简写HTML。
HTML 通过标签标记网页中的各个部分。网页文件本身是一种文本文件。
通过在文本文件中添加标记，可以告诉浏览器如何显示其中的内容（如：文字如何处理，画面如何安排，图片如何显示等）
  
- HTML书写规范

<!-- 这是html的注释 -->

```
<html>  表示整个html页面的开始
    <head> 头信息
        <title> 标题 </title> 
    </head>
    <body>
    页面主体内容
    </body>  
</html> 表示整个html页面的结束
```



- 标签介绍
    1. 标签格式：<标签名> 封装的数据 </标签名>
    2. 标签大小不敏感
    3. 标签可以拥有自己的属性：
        1. 基本属性：bgcolor="read" 用来修改简单的样式效果
        2. 事件属性：onclick="alert('你好');"  可以直接设置事件响应后的代码
    4. 标签分为单标签和双标签：
        1. 单标签：<标签名/>  如:自结束标签<br/>水平线标签 <hr/>
        2. 双标签格式：<开始标签标签名>...封装的数据...</结束标签标签名> 
- 标签语法 见文件
                     
  
    

    
  
## CSS(页面美化和布局控制)

决定页面样式

### CSS简介

1. 概念：Cascading Style Sheets 层叠样式表（层叠：多个样式可以作用在同一个html元素上，同时生效）

2. 使用CSS控制样式的好处：

   1. 功能强大；

   2. CSS可以使内容的展示和样式的控制分开。（ html使用属性控制样式，样式和元素的显示在一起）

      解耦 （分工更容易，提高开发效率）

### CSS使用（CSS与HTML的结合方式）

1. 内联样式(不推荐使用，并没有实现分离)
> 在标签内使用style属性指定css代码
```$xslt
如：

<div style="color:red;">ParsingXML css</div>
```

2. 内部样式
> 在head 标签内，定义style 标签style标签的标签体内容就是CSS代码；
```$xslt
如：
<head>
    <style>
        div{
            color:blue;
        }
    </style>
</head>

<div>ParsingXML css2</div>
```

3. 外部样式
> 1. 首先定义CSS资源文件；
> 2. 在head标签内，定义link标签，引入外部的资源文件
```css
    定义a.css文件，内容如下：
    div{
        color:green;
    }

    
· 在head标签内引入css文件的方式一：（常用）
    <head>
        <link rel = "stylesheet" href = "css/a.css>
    </head>

· 在head标签内引入css文件的方式二：（了解）
    <head>
       <style>
            @import "css/a.css";
       </style> 
    </head>

    <div>ParsingXML css3</div>
    <div>ParsingXML css3</div>

```

4. css 语法：

    语法格式：

    选择器 {

    ​	属性名1：属性值1；

    ​	属性名2：属性值2；

    ​	...

    }

    注意：每一对属性需要使用;隔开，最后一堆属性可以不加；

5. 选择器：筛选具有相同特征的元素

    1. 分类：

        1. 基础选择器：

            1. id选择器：选择具体的id属性值的元素，建议在一个HTML页面中id值唯一

                `语法：#id 属性值{}`

            2. 元素选择器：选择具有相同标签名称的元素

                `语法：标签名称 {}`

                > 注意：id选择器的优先级高于元素选择器

            3. 类选择器：选择具有相同的class属性值的元素

                `元素：.class 属性值{}`

                > 注意：类选择器优先级高于元素选择器

        2. 扩展选择器

            1. 选择所有元素

                `语法：* {}`

            2. 并集选择器

                `语法：选择器1，选择器2{}`

            3. 子选择器：筛选选择器1元素下的选择器2元素

                `语法：选择器1 选择器2{}`

            4. 父选择器：筛选选择器2的父元素选择器1

                `语法：选择器1>选择器2{}`

            5. 属性选择器：选择元素名称，属性名=属性值的元素

                `语法：元素名称[属性名=’属性值‘]{}`

            6. 伪类选择器：选择一些元素具有的状态

                `语法 元素：状态{}`

                ```css
                如：<a>
                	状态：
                		link :初始化状态；
                		visited : 被访问过的状态；
                		active : 正在访问状态；
                		hover ：鼠标悬浮状态；
                ```

6. 属性

    1. 字体、文本

        > font-size 字体大小
        >
        > color 文本颜色
        >
        > text-align 对其方式
        >
        > line-height 行高      

    2. 背景

        > background

    3. 边框

        > border 设置边框，符合属性

    4. 尺寸

        > width 宽度
        >
        > height 高度

    5. 盒子模型

        > margin 外边距
        >
        > padding 内边距
        >
        > float 浮动
        >
        > ​			left
        >
        > ​			right

        > 注意：
        >
        > 1. 相对概念
        > 2. 默认情况下内边距会影响整个盒子的大小，需要使用box-size: border-box，设置盒子的属性，让width和height就是最终盒子的大小；

        

        